package Escola;

public class Professor {

    //atributos do professor

    String nome;
    double salario;
    int cadeiras;
    double horarioEntrada;
    double horarioSaida;
    double horasTrabalhadas;



    //construtor
public Professor (String nome, double salario, int cadeiras){
    this.nome = nome;
    this.salario = salario;
    this.cadeiras = cadeiras;
    }

    void baterEntrada(double entrada){
        horarioEntrada+=entrada;
        }

    void baterSaida(double saida) {
        horarioSaida+=saida;
        }



}


