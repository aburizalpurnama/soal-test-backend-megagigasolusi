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
@Table(name = "master_fakultas")
public class MasterFakultas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nama;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "fakultas",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Mahasiswa> mahasiswa;
}
