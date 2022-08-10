package exercicio2;

public class Disciplina {
    public String nome;
    public int cargaHoraria;

    public Disciplina() {
        nome = "Linguagem de Programação";
        cargaHoraria = 80;
    }

    // Exercício 3
    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Disciplina: " + nome + "\n" + "Carga horária: " + cargaHoraria);
    }

}