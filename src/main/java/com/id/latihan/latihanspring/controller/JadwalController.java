package com.id.latihan.latihanspring.controller;


import com.id.latihan.latihanspring.model.Jadwal;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.security.services.JadwalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jadwal")
public class JadwalController {

    @Autowired
    JadwalService jadwalService;

    @PostMapping("/addJadwal")
    public ResponseEntity<MessageResponse>addDataJadwal(@RequestBody Jadwal jadwal){
        jadwalService.saveDataJadwal(jadwal);
        return ResponseEntity.ok(new MessageResponse("success insert data jadwal"));
    }
    @PostMapping("/updateDataJadwal")
    public ResponseEntity<MessageResponse> updateDataJadwal(@RequestBody Jadwal jadwal){
        jadwalService.updateDataJadwal(jadwal);
        return ResponseEntity.ok(new MessageResponse("success update data jadwal "));
    }

    @GetMapping("/getAllJadwal")
    public List<Jadwal> getAllJadwal(){
        return jadwalService.getDataAllJadwal();
    }

    @GetMapping("/jadwal/{id}")
    public Optional<Jadwal> findByIdJadwal(@PathVariable Long id){
        return jadwalService.findByIdJadwal(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MessageResponse> deleteDataJadwalById(@PathVariable Long id){
        jadwalService.deletDataJadwalById(id);
        return ResponseEntity.ok(new MessageResponse("success delete data Id :" + id));
    }
}
