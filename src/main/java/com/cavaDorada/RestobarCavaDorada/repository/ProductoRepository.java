package com.cavaDorada.RestobarCavaDorada.repository;


import com.cavaDorada.RestobarCavaDorada.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Productos, Integer> {


    @Query("SELECT p.idProducto, p.nombre, p.categoria, p.precios, p.stock, p.descripcion, p.estado, pr.nombre " +
            "FROM Productos p JOIN p.provedor pr WHERE pr.estado = true")
    List<Object[]> findProductoPersonalizados();

    @Modifying
    @Query(value = "INSERT INTO tb_producto (nombre, precio, cantidad, descripcion, estado, porcentaje_iva, categoria_id, provedor_id) VALUES (:nombre, :precio, :cantidad, :descripcion, :estado, :porcentajeIva, :categoriaId, :provedorId)", nativeQuery = true)
    void insertProducto(@Param("nombre") String nombre,
                        @Param("precio") BigDecimal precio,
                        @Param("cantidad") Integer cantidad,
                        @Param("descripcion") String descripcion,
                        @Param("estado") Boolean estado,
                        @Param("porcentajeIva") Integer porcentajeIva,
                        @Param("categoriaId") Integer categoriaId,
                        @Param("provedorId") Integer provedorId);





/*
    @Query()
    List<Object[]> OrdenarPorCategoria();

    @Query("")
   List<Object[]> OrdenarPorPrecio();

    @Query()
    List<Object[]> OrdenarPorNombre();

*/
}
