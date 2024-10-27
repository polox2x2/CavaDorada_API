package com.cavaDorada.RestobarCavaDorada.controller;

import com.cavaDorada.RestobarCavaDorada.entity.Productos;
import com.cavaDorada.RestobarCavaDorada.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping ("/api/cart")
@AllArgsConstructor
public class ProductosController {

    private final ProductoService productoService;

    @GetMapping("/{id}")
    public ResponseEntity<Productos> obtenerProductoPorId(@PathVariable Integer id) {
        return productoService.obtenerProductoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public List<Productos> obtenerTodosLosProductos() {
        return productoService.getProductos();
    }
    @PostMapping
    public ResponseEntity<String> createProducto(@RequestBody Productos producto) {
        productoService.createProducto(producto);
        return ResponseEntity.ok("Producto creado exitosamente");
    }



    @PutMapping("/{id}")
    public Productos actualizarProducto(@PathVariable Integer id, @RequestBody Productos productos) {
        return productoService.actualizarProducto(id, productos);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Integer id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
