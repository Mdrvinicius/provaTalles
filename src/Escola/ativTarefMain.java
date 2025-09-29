package Escola;

public class ativTarefMain {
    public static void main(String[] args) {
        tarefa tarefa1 = new tarefa("Redação de História", 8.5);
        tarefa tarefa2 = new tarefa("Exercício de Matemática", 6.0);

        tarefa1.mostrarInfo();
        tarefa2.mostrarInfo();

        System.out.println("Nota da tarefa 1: " + tarefa1.calcularNota());

        tarefa1.concluirTarefa();
        tarefa2.concluirTarefa();
    }
}