package br.com.gusmaomatheus;

import br.com.gusmaomatheus.model.Student;
import br.com.gusmaomatheus.persistence.ConnectionFactory;
import br.com.gusmaomatheus.persistence.dao.H2DatabaseStudentDAO;
import br.com.gusmaomatheus.persistence.dao.StudentDAO;
import br.com.gusmaomatheus.services.RegisterStudentService;
import br.com.gusmaomatheus.util.UI;
import jakarta.persistence.EntityManager;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final EntityManager entityManager = ConnectionFactory.getEntityManager();
        final StudentDAO dao = new H2DatabaseStudentDAO(entityManager);
        final RegisterStudentService registerService = new RegisterStudentService(dao);

        try {
            int option;

            do {
                UI.mainMenu();
                System.out.print("Digite a opção desejada: ");
                option = scanner.nextInt();

                // Limpar buffer
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("CADASTRO DE ALUNO:");
                        System.out.print("Digite o nome: ");
                        final String name = scanner.nextLine();
                        System.out.print("Digite o RA (SC00000X): ");
                        final String ra = scanner.nextLine();
                        System.out.print("Digite o email (exemplo@email.com): ");
                        final String email = scanner.nextLine();

                        System.out.print("Digite a nota 1: ");
                        final BigDecimal grade1 = scanner.nextBigDecimal();
                        System.out.print("Digite a nota 2: ");
                        final BigDecimal grade2 = scanner.nextBigDecimal();
                        System.out.print("Digite a nota 3: ");
                        final BigDecimal grade3 = scanner.nextBigDecimal();

                        final Student newStudent = new Student(name, ra, email, grade1, grade2, grade3);
                        registerService.register(newStudent);

                        break;
                    case 5:
                        final List<Student> students = dao.findAll();

                        if (students.isEmpty()) {
                            System.out.println("Nenhum aluno cadastrado na base!!!");
                        } else {
                            System.out.println("\nExibindo todos os alunos:\n");
                            for (Student s : students) {
                                UI.printStudentInfos(s);
                            }
                        }

                        break;
                    case 6:
                        System.out.println("Vai curintia!!");
                        System.out.println("Obrigado Diego Souza #Libertadores2012");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (6 != option);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        scanner.close();
        entityManager.close();
    }
}
