
package com.ideas.aplicacion.service;

import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import com.ideas.aplicacion.domain.Tbl_proveedor;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface Tbl_proveedorService{
    public List<Tbl_proveedor> listarTbl_proveedor();
    public List<Tbl_proveedor> listaTbl_proveedoresSelect(Tbl_pedidos_pro tbl_pedidos_pro);
    public Tbl_proveedor encontrartbl_proveedor(Tbl_proveedor tbl_proveedor);
    public void guardartbl_proveedor(Tbl_proveedor tbl_proveedor);
     public void eliminartbl_proveedor(Tbl_proveedor tbl_proveedor);
}
