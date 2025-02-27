package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    void save(Student student);
    List<Student> findAll();
    Optional<Student> findByName(String name);
}
