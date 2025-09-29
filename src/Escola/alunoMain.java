package Escola;

public class alunoMain {
    public static void main(String[] args) {
    aluno aluno1 = new aluno();
        aluno1.nome = "César";
        aluno1.matricula = 128205;
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 7;
        aluno1.nota3 = 9;

       aluno1.media = (aluno1.nota1 + aluno1.nota2 + aluno1.nota3) /3;

        System.out.println("Aluno " + aluno1.nome + " de matrícula " + aluno1.matricula + " tem uma média de: Média: "
                    +aluno1.media);

       aluno1.atividadeEntregue(2);
       aluno1.atividadeEntregue(0);


       System.out.println("Porém  "  + aluno1.nome + " tem os pontos de atividade a serem atribuidos ou retirado e " +
                   "a sua media fica " + aluno1.media  );

     }
}
