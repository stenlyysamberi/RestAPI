package com.example.restapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.restapi.Adapter.BiodataAdapter;
import com.example.restapi.Model.GetMahasiswa;
import com.example.restapi.Model.ModelBiodata;
import com.example.restapi.RestAPI.Interfaces;
import com.example.restapi.RestAPI.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    BiodataAdapter biodataAdapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get_biodata();
    }

    private void get_biodata(){
        recyclerView = findViewById(R.id.recy_biodata);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        try {

            Interfaces interfaces = RestClient.getRetrofitInstance().create(Interfaces.class);
            Call<List<GetMahasiswa>> call = interfaces.getMahasiswa();
            call.enqueue(new Callback<List<GetMahasiswa>>() {
                @Override
                public void onResponse(Call<List<GetMahasiswa>> call, Response<List<GetMahasiswa>> response) {
                    if (response.isSuccessful() && response.body()!=null){
                        //mySelf = response.body();
                        List<ModelBiodata> list = response.body().get(0).getMahasiswa();
                        biodataAdapter = new BiodataAdapter(list);
                        recyclerView.setAdapter(biodataAdapter);
                        biodataAdapter.notifyDataSetChanged();

                    }
                }

                @Override
                public void onFailure(Call<List<GetMahasiswa>> call, Throwable t) {
                    Log.e("Retrofit Get", t.toString());
                }
            });

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "error" + e, Toast.LENGTH_SHORT).show();
        }

    }
}