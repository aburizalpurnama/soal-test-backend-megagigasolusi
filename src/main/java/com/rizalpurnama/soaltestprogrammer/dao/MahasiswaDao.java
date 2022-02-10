package com.rizalpurnama.soaltestprogrammer.dao;

import com.rizalpurnama.soaltestprogrammer.entity.Mahasiswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, Integer> {
}
