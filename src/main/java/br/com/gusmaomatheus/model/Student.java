package br.com.gusmaomatheus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table
public final class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String ra;
    private String email;
    private BigDecimal grade1;
    private BigDecimal grade2;
    private BigDecimal grade3;

    public Student() {}

    public Student(String name, String ra, String email, BigDecimal grade1, BigDecimal grade2, BigDecimal grade3) {}


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Student{}";
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRa() {
        return ra;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getGrade1() {
        return grade1;
    }

    public BigDecimal getGrade2() {
        return grade2;
    }

    public BigDecimal getGrade3() {
        return grade3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade1(BigDecimal grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(BigDecimal grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(BigDecimal grade3) {
        this.grade3 = grade3;
    }
}
