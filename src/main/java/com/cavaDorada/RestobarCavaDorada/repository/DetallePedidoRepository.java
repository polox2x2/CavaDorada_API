package com.cavaDorada.RestobarCavaDorada.repository;

import com.cavaDorada.RestobarCavaDorada.entity.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido,Integer> {



}
