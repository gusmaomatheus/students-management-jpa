package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;
import br.com.gusmaomatheus.persistence.ConnectionFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public final class H2DatabaseStudentDAO implements StudentDAO {
    private final EntityManager entityManager = ConnectionFactory.getEntityManager();

    @Override
    public void save(Student student) {
        final EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(student);
        transaction.commit();

        entityManager.close();
    }
}
