package com.rizalpurnama.soaltestprogrammer.controller;

import com.rizalpurnama.soaltestprogrammer.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {

    @Autowired
    private MahasiswaService service;

    @GetMapping("/")
    public String showAllMahasiswa(Model model){

        return "mahasiswa";
    }
}
