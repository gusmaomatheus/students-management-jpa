package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    List<Student> findAll();
}
