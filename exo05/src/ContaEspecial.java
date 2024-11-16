public class ContaEspecial extends ContaBancaria{
    Double limite;

    public ContaEspecial(String nomeCliente, String numeroConta, Double saldo, Double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {

        double saldoComLimite = this.getSaldo() + limite;
        if (saldoComLimite >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ContaEspecial{" +
                "limite=" + limite +
                '}';
    }
}
