import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numeroConta, Double saldo, int diaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar cal = Calendar.getInstance();

        if (diaRendimento == cal.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento/100));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                '}';
    }
}
