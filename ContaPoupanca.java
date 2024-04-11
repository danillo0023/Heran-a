package heranca.exercicio1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int dia_rendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int dia_rendimento) {
        super(cliente, num_conta, saldo);
        this.dia_rendimento = dia_rendimento;
    }

    public void calcularNovoSaldo(float taxa) {
        if (dia_rendimento == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
            saldo += saldo * taxa;
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "cliente='" + cliente + '\'' +
                ", num_conta=" + num_conta +
                ", saldo=" + saldo +
                ", dia_rendimento=" + dia_rendimento +
                '}';
    }
}
