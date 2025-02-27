package br.com.gusmaomatheus.services;

import br.com.gusmaomatheus.model.Student;
import br.com.gusmaomatheus.persistence.dao.StudentDAO;

import java.util.Objects;

public final class RemoveStudentService {
    private final StudentDAO dao;

    public RemoveStudentService(StudentDAO dao) {
        this.dao = dao;
    }

    public void remove(Student student) {
        Objects.requireNonNull(student, "Student cannot be null.");

        dao.remove(student);
    }
}
