package com.cavaDorada.RestobarCavaDorada.repository;

import com.cavaDorada.RestobarCavaDorada.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
