package com.cavaDorada.RestobarCavaDorada.controller;

import com.cavaDorada.RestobarCavaDorada.entity.Categoria;
import com.cavaDorada.RestobarCavaDorada.service.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@AllArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService ;

    @PostMapping()
    public Categoria agregarCategoria (@RequestBody Categoria categoria){
        return categoriaService.agregarCategoria(categoria);
    }
    @GetMapping()
    public List<Categoria>obtenerCategorias (Categoria categoria){
        return categoriaService.obtenerCategorias(categoria);
    }
}
