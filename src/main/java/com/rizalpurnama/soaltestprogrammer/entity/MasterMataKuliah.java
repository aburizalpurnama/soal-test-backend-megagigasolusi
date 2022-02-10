package com.rizalpurnama.soaltestprogrammer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "master_mata_kuliah")
public class MasterMataKuliah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nama;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "msh_matkul",
            joinColumns = @JoinColumn(name = "mata_kuliah_id"),
            inverseJoinColumns = @JoinColumn(name = "mahasiswa_id"))
    private List<Mahasiswa> mahasiswa;
}
