
package com.ideas.aplicacion.dao;

import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface Tbl_pedidos_proDao extends CrudRepository<Tbl_pedidos_pro, Long> {
    @Query(value="SELECT * FROM tbl_pedidos_pro WHERE idtbl_pedidos_pro NOT IN =1", nativeQuery = true)
    public List<Tbl_pedidos_pro> listaTbl_pedidos_proSelect(Long idtbl_pedidos_pro);
}

