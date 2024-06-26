import java.util.Scanner;

public class Retangulo {
    private double base;
    private static double altura;

    public Retangulo(double base, double altura){
        Scanner scanner = new Scanner(System.in);

        this.altura = Math.abs(scanner.nextDouble());
        this.base = Math.abs(scanner.nextDouble());
    }

    public Retangulo(){
        this.altura = 1.0;
        this.base = 2.0;
    }

    public boolean esquadria(double base, double altura){
        if (base == altura) {
            return true;
        } else {
            return false;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double area(double base, double altura) {
        return base * altura;
    }

    public double perimetro(double base, double altura) {
        return base * 2 + altura * 2;
    }

    public void gira(double base, double altura) {
        double temp = base;
        base = altura;
        altura = temp;
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui a base do retângulo: ");

        double base = Math.abs(scanner.nextDouble());

        System.out.println("Agora digite a altura do retângulo: ");

        double altura = Math.abs(scanner.nextDouble());

        System.out.println("É um quadrado? " + retangulo.esquadria(base, altura));

        System.out.println("Perímetro: " + retangulo.perimetro(base, altura));
        System.out.println("Área: " + retangulo.area(base, altura));

    }


}
