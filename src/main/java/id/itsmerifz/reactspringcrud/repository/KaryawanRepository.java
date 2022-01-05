package id.itsmerifz.reactspringcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.itsmerifz.reactspringcrud.entity.Karyawan;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
    
//   @Query("from Karyawan k where k.nama=:search")
//   Page<Karyawan> findAll(Pageable p,@Param("search") String s);
//    @Query("select * from tbl_karyawan k where k.nama = ?1")
    List<Karyawan> findByNamaContaining(String nama);
}
