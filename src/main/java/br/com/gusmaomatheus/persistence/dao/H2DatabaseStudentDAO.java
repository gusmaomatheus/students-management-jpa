package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;
import br.com.gusmaomatheus.persistence.ConnectionFactory;
import jakarta.persistence.EntityManager;

public final class H2DatabaseStudentDAO implements StudentDAO {
    private final EntityManager entityManager = ConnectionFactory.getEntityManager();

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }
}
