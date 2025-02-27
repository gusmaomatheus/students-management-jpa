package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

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

    @Override
    public List<Student> findAll() {
        final String query = "SELECT s FROM Student s";

        return entityManager.createQuery(query, Student.class).getResultList();
    }
}
