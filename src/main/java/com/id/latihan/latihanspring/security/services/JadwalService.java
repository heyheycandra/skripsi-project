package com.id.latihan.latihanspring.security.services;

import com.id.latihan.latihanspring.model.Jadwal;
import com.id.latihan.latihanspring.repository.JadwalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class JadwalService {

    @Autowired
    JadwalRepository jadwalRepository;

    public Jadwal saveDataJadwal(Jadwal jadwal){
        return jadwalRepository.save(jadwal);
    }

    public Jadwal updateDataJadwal(Jadwal jadwal){
        Jadwal jdw = jadwalRepository.findById(jadwal.getId()).orElse(null);
        jdw.setJenis_kerusakan(jadwal.getJenis_kerusakan());
        jdw.setMerk(jadwal.getMerk());
        jdw.setNama_alat(jadwal.getNama_alat());
        jdw.setNama_pelapor(jadwal.getNama_pelapor());
        jdw.setRuangan(jadwal.getRuangan());
        jdw.setSn(jadwal.getSn());
        jdw.setType(jadwal.getType());
        jdw.setTgl_pemeliharaan(new Date());
        return jadwalRepository.save(jdw);
    }

    public String deletDataJadwalById(Long id){
        jadwalRepository.deleteById(id);
        return ("success delete data" + id);
    }

    public Optional<Jadwal> findByIdJadwal(Long id){
        return jadwalRepository.findById(id);
    }

    public List<Jadwal> getDataAllJadwal(){
        return jadwalRepository.findAll();
    }

}
