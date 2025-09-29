package Escola;

public class professorMain {
    public static void main(String args[]){

        Professor professor1 = new Professor("Talles" , 1055, 2);

       System.out.println(professor1.nome + " tem um salario de: " + professor1.salario + " e leciona em " +
                professor1.cadeiras + " cadeiras");


       professor1.baterEntrada(16.0);
       professor1.baterSaida(00.00);

      System.out.println(professor1.nome + " bateu o ponto de entrada às " + professor1.horarioEntrada +
               " e o ponto de saida às " + professor1.horarioSaida);


    if(professor1.horarioEntrada<=17.9) {
        System.out.println("Chegou cedo hoje professor");
    }else if (professor1.horarioEntrada>=18.1){
        System.out.println ("Está atrasado professor");
    }else{
        System.out.println("chegou na hora!");
        }



    }

}