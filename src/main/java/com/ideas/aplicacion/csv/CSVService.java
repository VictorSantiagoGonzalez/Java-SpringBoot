package com.ideas.aplicacion.csv;


import com.ideas.aplicacion.domain.Tbl_proveedor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
  @Autowired
  DeveloperTutorialRepository repository;

  public void save(MultipartFile file) {
    try {
      List<Tbl_proveedor> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<Tbl_proveedor> tutorials = repository.findAll();

    ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
    return in;
  }

  public List<Tbl_proveedor> getAllTutorials() {
    return repository.findAll();
  }
}

