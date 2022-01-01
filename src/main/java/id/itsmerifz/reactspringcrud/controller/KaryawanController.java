package id.itsmerifz.reactspringcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.itsmerifz.reactspringcrud.entity.Karyawan;
import id.itsmerifz.reactspringcrud.repository.KaryawanRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/data")
public class KaryawanController {
  
  @Autowired
  private KaryawanRepository kRepo;

  @GetMapping("/karyawan")
  public List<Karyawan> getAllKaryawan() {
    return kRepo.findAll();
  }
  
  @GetMapping("/karyawan/{id}")
  public Karyawan getKaryawanById(@PathVariable Long id){
      return kRepo.findById(id).get();
  }
  
  @PostMapping("/karyawan")
  public Karyawan saveKaryawanDetails(@RequestBody Karyawan k){
      return kRepo.save(k);
  }
  
  @PutMapping("/karyawan")
  public Karyawan updateKaryawan(@RequestBody Karyawan k){
      return kRepo.save(k);
  }
  
  @DeleteMapping("/karyawan/{id}")
  public ResponseEntity<HttpStatus> deleteKaryawanById(@PathVariable Long id){
      kRepo.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
