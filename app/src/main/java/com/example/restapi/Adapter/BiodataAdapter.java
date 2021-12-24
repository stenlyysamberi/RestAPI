package com.example.restapi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.restapi.Model.ModelBiodata;
import com.example.restapi.R;

import java.util.List;
public class BiodataAdapter extends RecyclerView.Adapter<BiodataAdapter.viewHolder> {


    List<ModelBiodata> mySelf;
    Context context;

    public BiodataAdapter(List<ModelBiodata> mySelf) {
        this.mySelf = mySelf;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent, false);
        return new  viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.nama.setText(mySelf.get(position).getNama());
        holder.dev.setText(mySelf.get(position).getSkill());

        Glide.with(context)
                .load("http://192.168.42.193:8000/storage/" + mySelf.get(position).getPicture())
                .placeholder(R.mipmap.ic_launcher_round)
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return mySelf.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nama,dev;
        ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nama  = itemView.findViewById(R.id.nama);
            dev = itemView.findViewById(R.id.dev);
            imageView = itemView.findViewById(R.id.img1);


        }
    }
}
