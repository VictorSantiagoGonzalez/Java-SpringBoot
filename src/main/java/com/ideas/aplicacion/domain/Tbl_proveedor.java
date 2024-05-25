
package com.ideas.aplicacion.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Tbl_proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idtbl_proveedor;
    private String Nombre;
    private String Celular;
    private String Correo;
    private String Direccion;
    private String Ciudad;
    private String Foto;

    public Tbl_proveedor() {
    }

    public Tbl_proveedor(long idtbl_proveedor, String Nombre, String Celular, String Correo, String Direccion, String Ciudad, String Foto) {
        this.idtbl_proveedor = idtbl_proveedor;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Foto = Foto;
    }
     public long getId() {
        return idtbl_proveedor;
    }

    public void setId(long idtbl_proveedor) {
        this.idtbl_proveedor = idtbl_proveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

	  


	  @Override
	  public String toString() {
	    return "Tutorial [idtbl_proveedor=" + idtbl_proveedor+ ", Nombre=" + Nombre + ", Celular=" + Celular + ", Correo=" + Correo + ", Direccion=" + Direccion + ", Ciudad=" + Ciudad+ ", Foto=" + Foto +"]";
	  }
    
    
    
    
    }