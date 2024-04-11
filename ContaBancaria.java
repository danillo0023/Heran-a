package heranca.exercicio1;

public class ContaBancaria {
    protected String cliente;
    protected int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "cliente='" + cliente + '\'' +
                ", num_conta=" + num_conta +
                ", saldo=" + saldo +
                '}';
    }
}

