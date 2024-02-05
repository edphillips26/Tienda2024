package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{//Serealizacion funciona para almacenar ciertos datos en la maquina
    
    private static final long serialVersionUID = 1L;//para poder hacer el ciclo de la sumatoria del idProducto
    @Id //tabla producto tiene una llave o identificador que va a ser el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Los valores generados que tipo de estrategia utilizan, identico = sea igual en la BD y en la clase
    @Column(name="id_producto")//decir cual es el nombre de la columna de la base de datos  
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    private String detalle;
    private double precio;
    private int existencias;
   // private long idCategoria;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
   
}
