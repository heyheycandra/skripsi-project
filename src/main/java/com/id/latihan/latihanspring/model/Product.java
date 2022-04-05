package com.id.latihan.latihanspring.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_m_product")
public class Product {

    @Id
    private Long product_id;

    @Column(length = 100)
    private String nama_alat;

    @Column(length = 200)
    private String merk;

    @Column(length = 100)
    private String type_alat;

    @Column(length = 100)
    private String sn;

    @Column(length = 10)
    private String ruangan;

    @Column(length = 50)
    private String kondisi;

    @Column(length = 100)
    private String harga_beli;

    @Column(length = 100)
    private String nama_vendor;

    @ManyToOne
    @JoinColumn(name = "tgl_pemeliharaan")
    private Jadwal tgl_pemeliharaan;

    @ManyToOne
    @JoinColumn(name = "tgl_kalibrasi")
    private JadualKalibrasi tgl_kalibrasi;

    @Column
    private Date create_on;

    @Column
    private String create_by;

    @Column
    private Date update_on;

    @Column
    private String update_by;


    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getNama_alat() {
        return nama_alat;
    }

    public void setNama_alat(String nama_alat) {
        this.nama_alat = nama_alat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType_alat() {
        return type_alat;
    }

    public void setType_alat(String type_alat) {
        this.type_alat = type_alat;
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

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public Jadwal getTgl_pemeliharaan() {
        return tgl_pemeliharaan;
    }

    public void setTgl_pemeliharaan(Jadwal tgl_pemeliharaan) {
        this.tgl_pemeliharaan = tgl_pemeliharaan;
    }

    public JadualKalibrasi getTgl_kalibrasi() {
        return tgl_kalibrasi;
    }

    public void setTgl_kalibrasi(JadualKalibrasi tgl_kalibrasi) {
        this.tgl_kalibrasi = tgl_kalibrasi;
    }

    public String getNama_vendor() {
        return nama_vendor;
    }

    public void setNama_vendor(String nama_vendor) {
        this.nama_vendor = nama_vendor;
    }

    public Date getCreate_on() {
        return create_on;
    }

    public void setCreate_on(Date create_on) {
        this.create_on = create_on;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getUpdate_on() {
        return update_on;
    }

    public void setUpdate_on(Date update_on) {
        this.update_on = update_on;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }
}
