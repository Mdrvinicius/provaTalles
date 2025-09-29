package Escola;

public class tarefa extends atividade {
    private double notaObtida;

    public tarefa(String titulo, double notaObtida) {
        super(titulo);
        this.notaObtida = notaObtida;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tarefa: " + titulo);
        System.out.println("Nota obtida: " + notaObtida);
    }

    @Override
    public double calcularNota() {
        return notaObtida * 1.0;
    }

    public void concluirTarefa() {
        System.out.println("A tarefa '" + titulo + "' foi concluída!");
    }
}