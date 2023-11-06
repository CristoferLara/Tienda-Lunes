
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name ="categoria")

/*Serializacoin va a almacenar datos de la bd*/
public class Categoria implements Serializable  {
 
 private static final long serialVersionUID = 1L; /*para poder hacer el ciclo de la sumatoria de la categoria de bd*/  

@Id /*id es la llave de la tabla categoria*/
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_categoria")

 private long idCategoria;
 private String descripcion;
 private String rutaImagen;
 private boolean activo;

    public Categoria() {
      
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

 
}
