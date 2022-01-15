package cadastroalunos;

import java.util.ArrayList;

public class Sala {

    // Declarando a variável listaDeAlunos do tipo ArrayList
    ArrayList<Aluno> listaDeAlunos;

    // Método construtor sala, já construindo uma lista
    public Sala() {
        this.listaDeAlunos = new ArrayList<>();
    }

    void inserirAluno(Aluno novoAluno) {
        novoAluno.calculaNotas();
        listaDeAlunos.add(novoAluno);
    }

    void listarAlunos() {
        System.out.println("\nLista de alunos");

        for (Aluno alunoNaLista : listaDeAlunos) {
            alunoNaLista.listar();
        }
    }

    void listarSituacoes() {
        System.out.println("\nSituações");

        for (Aluno alunoNaLista : listaDeAlunos) {
            alunoNaLista.mostraSituacao();
        }
    }
}
