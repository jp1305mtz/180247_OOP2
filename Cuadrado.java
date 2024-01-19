package Formas;

public class Cuadrado {

    private float Lado;

    public Cuadrado() {
        this.Lado = 180247.0f / 100;
    }

    public float getLongitudLado() {
        return Lado;
    }

    public float calcDiagonal() {
        return (float) Math.sqrt(2) * Lado;
    }

    public float calcPerimetro() {
        return Lado + Lado + Lado + Lado;
    }

    public float calcArea() {
        return Lado * Lado;
    }

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();

        float longitudLado = cuadrado.getLongitudLado();
        System.out.println("La longitud del lado es: " + longitudLado + "cm");

        float diagonal = cuadrado.calcDiagonal();
        System.out.println("La diagonal mide: " + diagonal + "cm");

        float perimetro = cuadrado.calcPerimetro();
        System.out.println("El perímetro es de: " + perimetro + "cm");

        float area = cuadrado.calcArea();
        System.out.println("El área es de: " + area + "cm cuadrados");
    }
}