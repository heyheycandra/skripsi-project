package com.id.latihan.latihanspring.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_m_compline")
public class Compline {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100)
    private String nama_alat;

    @Column
    private Date tanggal;

    @Column
    private String merek;

    @Column
    private String type;

    @Column
    private String sn;

    @Column
    private String ruangan;

    @Column
    private String jenis_kerusakan;

    @Column
    private String nama_pelapor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_alat() {
        return nama_alat;
    }

    public void setNama_alat(String nama_alat) {
        this.nama_alat = nama_alat;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getJenis_kerusakan() {
        return jenis_kerusakan;
    }

    public void setJenis_kerusakan(String jenis_kerusakan) {
        this.jenis_kerusakan = jenis_kerusakan;
    }

    public String getNama_pelapor() {
        return nama_pelapor;
    }

    public void setNama_pelapor(String nama_pelapor) {
        this.nama_pelapor = nama_pelapor;
    }
}
