
package com.ideas.aplicacion.service;


import com.ideas.aplicacion.dao.Tbl_pedidos_proDao;
import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Tbl_pedidos_proServicelmpl implements Tbl_pedidos_proService{
    
     @Autowired
    private Tbl_pedidos_proDao tbl_pedidos_proDao;
    
        @Override
        public List<Tbl_pedidos_pro> listarTbl_pedidos_pro(){
        return (List<Tbl_pedidos_pro>) tbl_pedidos_proDao.findAll();
    }
   

   @Override
    public void guardar(Tbl_pedidos_pro tbl_pedidos_pro) {
         tbl_pedidos_proDao.save(tbl_pedidos_pro);
   }
        
    @Override
     public Tbl_pedidos_pro encontrar(Tbl_pedidos_pro tbl_pedidos_pro) {
       return tbl_pedidos_proDao.findById(tbl_pedidos_pro.getIdtbl_pedidos_pro()).orElse(null);
    }


    @Override
    public void eliminar(Tbl_pedidos_pro tbl_pedidos_pro) {
          tbl_pedidos_proDao.delete(tbl_pedidos_pro);
     }
    
  
}
