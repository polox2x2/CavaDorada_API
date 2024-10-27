package com.cavaDorada.RestobarCavaDorada.repository;

import com.cavaDorada.RestobarCavaDorada.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
