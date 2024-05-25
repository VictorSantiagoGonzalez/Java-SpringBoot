
package com.ideas.aplicacion.dao;

import com.ideas.aplicacion.domain.Tbl_proveedor;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface Tbl_proveedorDao extends CrudRepository<Tbl_proveedor, Long> {
    @Query(value="SELECT * FROM tbl_proveedor WHERE idtbl_proveedor  NOT IN (1)", nativeQuery = true)
    public List<Tbl_proveedor> listaTbl_proveedorSelect(Long idtbl_proveedor);
}
