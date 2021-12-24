package com.example.restapi.RestAPI;

import com.example.restapi.Model.GetMahasiswa;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interfaces {
    @GET("mahasiswa.php")
    Call<List<GetMahasiswa>> getMahasiswa();

}
