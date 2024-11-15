package Aluno;

import java.util.Arrays;

public class Aluno {

    private String nome;
    private String matricula;
    private Double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public Double obterMedia() {
        Double soma = (double) 0;
        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public String definirSituacao(){
        if (obterMedia() >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", media=" + obterMedia() + '\'' +
                ", situacao='" + definirSituacao() + '\'' +
                '}';
    }
}
