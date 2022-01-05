package id.itsmerifz.reactspringcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_karyawan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nama;

    private String alamat;

    private String departemen;

    private Long thnKerja;

    private Long masaKerja;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Karyawan() {

    }
    
    public Karyawan(String n){
        nama = n;
    }
}
