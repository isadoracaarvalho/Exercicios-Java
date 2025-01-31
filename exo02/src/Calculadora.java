public class Calculadora {
    private double num1, num2;

    public Calculadora() {
    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double realizarSoma(double num1, double num2) {
        return num1 + num2;
    }

    public double realizarSubtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double realizarMultiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double realizarDivisao(double num1, double num2) {
        return num1 / num2;
    }

    public double realizarPotencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
