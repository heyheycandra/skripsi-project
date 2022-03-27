package com.id.latihan.latihanspring.controller;


import com.id.latihan.latihanspring.constant.Message;
import com.id.latihan.latihanspring.model.Compline;
import com.id.latihan.latihanspring.model.Product;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.ComplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compline")
public class ComplineController {

    @Autowired
    ComplineService complineService;

    @CrossOrigin(origins = "https://skripsi-projectv2.herokuapp.com/")
    @PostMapping("/addCompline")
    public ResponseEntity<MessageResponse> addDataCompline(@RequestBody Compline compline){
        complineService.saveDataCompline(compline);
        return ResponseEntity.ok(new MessageResponse("success insert data"));
    }

    @CrossOrigin(origins = "https://skripsi-projectv2.herokuapp.com/")
    @PostMapping("/updateCompline")
    public ResponseEntity<MessageResponse> updateDataCompline(@RequestBody Compline compline){
        complineService.updateDataCompline(compline);
        return ResponseEntity.ok(new MessageResponse("success update data"));
    }

    @CrossOrigin(origins = "https://skripsi-projectv2.herokuapp.com/")
    @GetMapping("/getAllCompline")
    public List<Compline> getAllcompline(){
        return complineService.getAllDataCompline();
    }

    @CrossOrigin(origins = "https://skripsi-projectv2.herokuapp.com/")
    @GetMapping("/{id}")
    public Optional<Compline> findByIdCompline(@PathVariable Long id){
        return complineService.findByIdCompline(id);
    }

    @CrossOrigin(origins = "https://skripsi-projectv2.herokuapp.com/")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MessageResponse> deleteDataProductById(@PathVariable Long id){
        complineService.deleteDataComplineById(id);
        return ResponseEntity.ok(new MessageResponse("success delete data compline id :" + id));
    }

}
