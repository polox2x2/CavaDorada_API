package com.cavaDorada.RestobarCavaDorada.controller;


import com.cavaDorada.RestobarCavaDorada.entity.Provedor;
import com.cavaDorada.RestobarCavaDorada.service.ProvedorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/provedor")
@AllArgsConstructor
public class ProvedorController {

    private final ProvedorService provedorService;

    @GetMapping()
    public List<Provedor> obtenerProvedores (Provedor provedor){
        return provedorService.getProvedores();
    }
    @PostMapping()
    public Provedor agregarProvedor (@RequestBody Provedor provedor){
        return provedorService.agregarProvedor(provedor);
    }
}
