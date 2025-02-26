package br.com.gusmaomatheus.util;

public final class UI {
    private UI() {}

    public static void mainMenu() {
        System.out.println("\n** CADASTRO DE ALUNOS **\n");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Editar aluno");
        System.out.println("3. Excluir aluno");
        System.out.println("4. Buscar aluno pelo nome");
        System.out.println("5. Listar alunos (com status de aprovação)");
        System.out.println("6. Encerrar");
    }
}
