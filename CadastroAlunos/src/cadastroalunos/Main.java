// Pacote
package cadastroalunos;

// Classe Scanner (Para fazer Leitura(Entrada de Dados, Informações) - Input
import java.util.Scanner;

// Classe Principal
public class Main {

    // Método main
    public static void main(String[] args) {

        // Declarando variáveis
        int opcao, qtdeNotas;
        String nome, cpf;
        Aluno novoAluno = new Aluno();
        Sala novaSala = new Sala();
        float nota = 0;

        // Construindo o teclado(input)
        Scanner teclado = new Scanner(System.in);

        // Menu inicial
        do {
            System.out.println(" \n--- Menu ---");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Situações");
            System.out.println("4 - Sair");

            opcao = teclado.nextInt();

            // Limpeza do Buffer
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nNome: ");
                    nome = teclado.nextLine();

                    System.out.println("\nCPF: ");
                    cpf = teclado.nextLine();

                    novoAluno = new Aluno(nome, cpf);

                    System.out.println("\nQuantas notas?");
                    qtdeNotas = teclado.nextInt();

                    // Loop fot para ler quantas notas o usuário quiser
                    for (int i = 0; i < qtdeNotas; i++) {
                        System.out.println("\nNota" + (i + 1) + ": ");
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota);
                    }

                    novaSala.inserirAluno(novoAluno);

                    break;

                case 2:
                    novaSala.listarAlunos();
                    break;

                case 3:
                    novaSala.listarSituacoes();
                    break;

                case 4:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("\nEssa não é uma opção válida\n");
            }
        } while (opcao != 4);
    }
}
