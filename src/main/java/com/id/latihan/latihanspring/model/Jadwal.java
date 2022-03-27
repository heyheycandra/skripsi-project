package com.id.latihan.latihanspring.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_m_jadwal")
public class Jadwal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String nama_alat;

    @Column
    private Date tgl_pemeliharaan;

    @Column
    private String merk;

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

    public Date getTgl_pemeliharaan() {
        return tgl_pemeliharaan;
    }

    public void setTgl_pemeliharaan(Date tgl_pemeliharaan) {
        this.tgl_pemeliharaan = tgl_pemeliharaan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
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
