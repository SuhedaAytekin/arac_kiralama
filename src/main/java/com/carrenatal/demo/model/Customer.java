package com.carrenatal.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    @Column(name="ad")
    private String ad;

    @Column(name="soyad")
    private String soyad;

    @Column(name="tc")
    private int tc;

    @Column(name="telefon")
    private int telefon;

    @Column(name="kiralanan_plaka")
    private String kiralanan_plaka;

    public Long getC_id(Long c_id) {
       return this.c_id;
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

    public void setTelefon(int telefon) {this.telefon= telefon;
    }

    public String getKiralanan_plaka() {
        return kiralanan_plaka;
    }

    public void setKiralanan_plaka(String kiralanan_plaka) {
        this.kiralanan_plaka = kiralanan_plaka;
    }


}
