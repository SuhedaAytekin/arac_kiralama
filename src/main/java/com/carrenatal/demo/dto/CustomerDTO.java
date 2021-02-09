package com.carrenatal.demo.dto;

import com.carrenatal.demo.model.Car;
public class CustomerDTO {

    private Long c_id;
    private String ad;
    private String soyad;
    private int tc;
    private int telefon;
    private String kiralanan_plaka;

    public CustomerDTO() {
    }

    public CustomerDTO(Long c_id, String ad, String soyad, int tc, int telefon, String kiralanan_plaka) {
        this.c_id = c_id;
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.telefon = telefon;
        this.kiralanan_plaka = kiralanan_plaka;
    }

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public String getAd() {
     return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getKiralanan_plaka() {
        return kiralanan_plaka;
    }

    public void setKiralanan_plaka(String kiralanan_plaka) {
        this.kiralanan_plaka = kiralanan_plaka;
    }








}
