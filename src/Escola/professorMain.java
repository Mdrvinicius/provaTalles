package Escola;

public class professorMain {
    public static void main(String args[]){

        Professor professor1 = new Professor("Talles" , 1055, 2);

       System.out.println(professor1.nome + " tem um salario de: " + professor1.salario + " e leciona em " +
                professor1.cadeiras + " cadeiras");


       professor1.baterEntrada(18.00);
       professor1.baterSaida(24.00);

      System.out.println(professor1.nome + " bateu o ponto de entrada às " + professor1.horarioEntrada +
               " e o ponto de saida às " + professor1.horarioSaida);

      professor1.horasTrabalhadas= professor1.horarioSaida - professor1.horarioEntrada;

    if(professor1.horasTrabalhadas>=5) {
        System.out.println("o professor merece um descanso");
    }else{
        System.out.println ("o total de horas trabalhadas está correto");
    }







    }

}