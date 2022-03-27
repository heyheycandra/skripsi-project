package com.id.latihan.latihanspring.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_m_kalibrasi")
public class JadualKalibrasi {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private Date tgl_kalibrasi;

    @Column
    private String nama_alat;

    @Column
    private String merk;

    @Column
    private String Type;

    @Column
    private String sn;

    @Column
    private String ruangan;
}
