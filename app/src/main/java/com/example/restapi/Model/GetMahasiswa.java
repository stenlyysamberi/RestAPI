package com.example.restapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMahasiswa {
    @SerializedName("data")
    List<ModelBiodata> mahasiswa;

    public List<ModelBiodata> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(List<ModelBiodata> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
