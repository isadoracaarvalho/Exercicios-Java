public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private Double saldo;

    public ContaBancaria(String nomeCliente, String numeroConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
