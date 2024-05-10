public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double distanciaX = outroPonto.x - this.x;
        double distanciaY = outroPonto.y - this.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(3, 4);
        Ponto ponto2 = new Ponto(6, 8);

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distância entre os pontos é: " + distancia);
    }
}
