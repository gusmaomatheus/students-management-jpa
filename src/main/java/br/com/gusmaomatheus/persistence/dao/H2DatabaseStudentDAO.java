package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public final class H2DatabaseStudentDAO implements StudentDAO {
    private final EntityManager entityManager;

    public H2DatabaseStudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Student student) {
        final EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(student);
        transaction.commit();
    }
}
