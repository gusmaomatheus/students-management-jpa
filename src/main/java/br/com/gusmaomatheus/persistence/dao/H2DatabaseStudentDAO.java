package br.com.gusmaomatheus.persistence.dao;

import br.com.gusmaomatheus.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Student> findByName(String name) {
        final String query = "SELECT s FROM Student s WHERE s.name = :name";

        try {
            return Optional.ofNullable(
                    entityManager.createQuery(query, Student.class)
                            .setParameter("name", name)
                            .getSingleResult());
        } catch (NoResultException exception) {
            return Optional.empty();
        }
    }
}
