package id.itsmerifz.reactspringcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.itsmerifz.reactspringcrud.entity.Karyawan;

@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
  
}
