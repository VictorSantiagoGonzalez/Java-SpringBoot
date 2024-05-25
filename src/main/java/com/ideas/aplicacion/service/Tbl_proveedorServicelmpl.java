
package com.ideas.aplicacion.service;

import com.ideas.aplicacion.dao.Tbl_proveedorDao;
import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import com.ideas.aplicacion.domain.Tbl_proveedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Tbl_proveedorServicelmpl implements Tbl_proveedorService{

    
    @Autowired
    private Tbl_proveedorDao tbl_proveedorDao;
    
    @Override
    public List<Tbl_proveedor> listarTbl_proveedor() {
     return (List<Tbl_proveedor>) tbl_proveedorDao.findAll();
    }

    @Override
    public void guardartbl_proveedor(Tbl_proveedor tbl_proveedor) {
      tbl_proveedorDao.save(tbl_proveedor);
    }

    @Override
    public void eliminartbl_proveedor(Tbl_proveedor tbl_proveedor) {
       tbl_proveedorDao.delete(tbl_proveedor);
}
    @Override
    public Tbl_proveedor encontrartbl_proveedor(Tbl_proveedor tbl_proveedor) {
       return tbl_proveedorDao.findById(tbl_proveedor.getIdtbl_proveedor()).orElse(null);
    }

    @Override
    public List<Tbl_proveedor> listaTbl_proveedoresSelect(Tbl_pedidos_pro tbl_pedidos_pro) {
             return tbl_proveedorDao.listaTbl_proveedorSelect(tbl_pedidos_pro.getTbl_proveedor().getIdtbl_proveedor());
    }

}
