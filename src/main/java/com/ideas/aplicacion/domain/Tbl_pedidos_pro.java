package com.ideas.aplicacion.domain;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
public class Tbl_pedidos_pro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idtbl_pedidos_pro; 
   
    private String Tipo_de_tela;
    private String    Color;
    private int     Cantidad;
    private String    Ancho;
    private String    Largo;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
     private Date Fecha_del_pedido;
    
    @ManyToOne                                       //Relación de muchos a uno
    private Tbl_proveedor tbl_proveedor;
}


