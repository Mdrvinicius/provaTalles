package Escola;

class Financeiro {

    private double mensalidade;


    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        if (mensalidade > 0) {
            this.mensalidade = mensalidade;
        } else {
            System.out.println("Valor de mensalidade inválido");
        }
    }

    public void pagarMensalidade(double pagamento) {
        if (pagamento == mensalidade) {
            System.out.println("Mensalidade de R$" + pagamento + " paga com sucesso!");
        } else {
            System.out.println("Valor pago diferente da mensalidade.");
        }
    }
}


public class financeiroMain {
    public static void main(String[] args) {
        Financeiro meuFinanceiro = new Financeiro();
        meuFinanceiro.setMensalidade(1200.00);
        System.out.println("Mensalidade pendente de: R$" + meuFinanceiro.getMensalidade());
        meuFinanceiro.pagarMensalidade(1200.00);

    }
}