package br.com.gusmaomatheus.services;

import br.com.gusmaomatheus.model.Student;
import br.com.gusmaomatheus.persistence.dao.StudentDAO;

import java.math.BigDecimal;
import java.util.Objects;

public final class UpdateStudentService {
    private final StudentDAO dao;

    public UpdateStudentService(StudentDAO dao) {
        this.dao = dao;
    }

    public void update(Student student, String name, String ra, String email, BigDecimal grade1, BigDecimal grade2, BigDecimal grade3) {
        Objects.requireNonNull(student, "Student must not be null.");
        Objects.requireNonNull(name, "Name must not be null.");
        Objects.requireNonNull(ra, "RA must not be null.");
        Objects.requireNonNull(email, "Email must not be null.");
        Objects.requireNonNull(grade1, "Grade must not be null.");
        Objects.requireNonNull(grade2, "Grade must not be null.");
        Objects.requireNonNull(grade3, "Grade must not be null.");

        dao.update(student, name, ra, email, grade1, grade2, grade3);
    }
}
