package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.Compline;
import com.id.latihan.latihanspring.repository.ComplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ComplineService {

    @Autowired
    ComplineRepository complineRepository;

    public Compline saveDataCompline(Compline compline){
        return complineRepository.save(compline);
    }

    public String deleteDataComplineById(Long compline_id){
        complineRepository.deleteById(compline_id);
        return ("succsess delete data" + compline_id);
    }

    public Optional<Compline> findByIdCompline(Long compline_id){
        return complineRepository.findById(compline_id);
    }

    public List<Compline> getAllDataCompline(){
        return complineRepository.findAll();
    }

    public Compline updateDataCompline(Compline compline){
        Compline compline1 = complineRepository.findById(compline.getId()).orElse(null);
        compline1.setNama_alat(compline.getNama_alat());
        compline1.setJenis_kerusakan(compline.getJenis_kerusakan());
        compline1.setMerek(compline.getMerek());
        compline1.setSn(compline.getSn());
        compline1.setMerek(compline.getMerek());
        compline1.setRuangan(compline.getRuangan());
        compline1.setType(compline.getType());
        compline1.setTanggal(new Date());
        return complineRepository.save(compline1);
    }

}
