package com.ideas.aplicacion.csv;

import com.ideas.aplicacion.domain.Tbl_proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperTutorialRepository extends JpaRepository<Tbl_proveedor, Integer>{

}
