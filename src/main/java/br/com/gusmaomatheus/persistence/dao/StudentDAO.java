package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    void save(Student student);
    List<Student> findAll();
    Optional<Student> findByName(String name);
    void update(Student student, String name, String ra, String email, BigDecimal grade1, BigDecimal grade2, BigDecimal grade3);
    void remove(Student student);
}
