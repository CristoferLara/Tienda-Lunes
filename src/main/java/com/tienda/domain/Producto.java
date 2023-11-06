/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Heym
 */
@Data
@Entity
@Table(name ="producto")

/*Serializacoin va a almacenar datos de la bd*/
public class Producto implements Serializable  {
 
 private static final long serialVersionUID = 1L; /*para poder hacer el ciclo de la sumatoria de la producto de bd*/  

@Id /*id es la llave de la tabla producto*/
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_producto")

    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    private long idCategoria;
    private String detalle;
    private int existencias;
    private double precio;
 
    @OneToMany
    @JoinColumn(name = "id_categoria")
    List<Producto> productos;
    
    public Producto() {
      
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

 
}

