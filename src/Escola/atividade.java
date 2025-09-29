package Escola;

public abstract class atividade {
    protected String titulo;

    public atividade(String titulo) {
        this.titulo = titulo;
    }

    public abstract void mostrarInfo();

    public abstract double calcularNota();
}

