package Escola;

public class aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;
    double media;

    void atividadeEntregue (int pontoExtra){
        media+=pontoExtra;
    }

    void semAtividade( int menosPonto){
        media-=menosPonto;
    }


}

