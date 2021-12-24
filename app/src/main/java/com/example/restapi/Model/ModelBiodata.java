package com.example.restapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelBiodata {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("nim")
    @Expose
    private String nim;
    @SerializedName("nama_panggil")
    @Expose
    private String namaPanggil;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("url_ig")
    @Expose
    private String urlIg;
    @SerializedName("url_fb")
    @Expose
    private String urlFb;
    @SerializedName("url_youtube")
    @Expose
    private String urlYoutube;
    @SerializedName("url_github")
    @Expose
    private String urlGithub;
    @SerializedName("jurussan")
    @Expose
    private String jurussan;
    @SerializedName("fakultas")
    @Expose
    private String fakultas;
    @SerializedName("hobi")
    @Expose
    private String hobi;
    @SerializedName("skill")
    @Expose
    private String skill;
    @SerializedName("picture")
    @Expose
    private String picture;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaPanggil() {
        return namaPanggil;
    }

    public void setNamaPanggil(String namaPanggil) {
        this.namaPanggil = namaPanggil;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrlIg() {
        return urlIg;
    }

    public void setUrlIg(String urlIg) {
        this.urlIg = urlIg;
    }

    public String getUrlFb() {
        return urlFb;
    }

    public void setUrlFb(String urlFb) {
        this.urlFb = urlFb;
    }

    public String getUrlYoutube() {
        return urlYoutube;
    }

    public void setUrlYoutube(String urlYoutube) {
        this.urlYoutube = urlYoutube;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }

    public String getJurussan() {
        return jurussan;
    }

    public void setJurussan(String jurussan) {
        this.jurussan = jurussan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
