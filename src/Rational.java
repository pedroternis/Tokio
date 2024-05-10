public class Rational {
    private int numerador;
    private int denominador;

    public Rational(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Rational soma(Rational outro) {
        int novoNumerador = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Rational(novoNumerador, novoDenominador);
    }

    public Rational subtracao(Rational outro) {
        int novoNumerador = this.numerador * outro.denominador - outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Rational(novoNumerador, novoDenominador);
    }

    public Rational multiplicacao(Rational outro) {
        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Rational(novoNumerador, novoDenominador);
    }

    public Rational divisao(Rational outro) {
        int novoNumerador = this.numerador * outro.denominador;
        int novoDenominador = this.denominador * outro.numerador;
        return new Rational(novoNumerador, novoDenominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Rational num1 = new Rational(1, 2);
        Rational num2 = new Rational(1, 4);

        Rational soma = num1.soma(num2);
        Rational subtracao = num1.subtracao(num2);
        Rational multiplicacao = num1.multiplicacao(num2);
        Rational divisao = num1.divisao(num2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
