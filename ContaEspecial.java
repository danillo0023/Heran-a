package heranca.exercicio1;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "cliente='" + cliente + '\'' +
                ", num_conta=" + num_conta +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}