package br.com.gusmaomatheus.util;

import br.com.gusmaomatheus.model.Student;

public final class UI {
    private UI() {}

    public static void mainMenu() {
        System.out.println("\n** CADASTRO DE ALUNOS **\n");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Excluir aluno");
        System.out.println("3. Editar aluno");
        System.out.println("4. Buscar aluno pelo nome");
        System.out.println("5. Listar alunos (com status de aprovação)");
        System.out.println("6. Encerrar");
    }

    public static void printStudentInfos(Student student) {
        System.out.println();
        System.out.println("Nome: " + student.getName());
        System.out.println("RA: " + student.getRa());
        System.out.println("Email: " + student.getEmail());
        System.out.printf("Notas: %.2f - %.2f - %.2f\n", student.getGrade1().doubleValue(), student.getGrade2().doubleValue(), student.getGrade3().doubleValue());
        System.out.printf("Média: %.2f\n", student.getAverage());
        System.out.println("Situação: " + student.getSituation());
        System.out.println();
    }
}
