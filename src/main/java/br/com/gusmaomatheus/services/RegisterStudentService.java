package br.com.gusmaomatheus.services;

import br.com.gusmaomatheus.model.Student;
import br.com.gusmaomatheus.persistence.dao.StudentDAO;

import java.util.Objects;

public final class RegisterStudentService {
    private final StudentDAO dao;

    public RegisterStudentService(StudentDAO dao) {
        this.dao = dao;
    }

    public void register(Student student) {
        Objects.requireNonNull(student, "Student must not be null.");

        dao.save(student);
    }
}
