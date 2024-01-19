package Formas;

public class Circulo {

	private float Radio;

    public Circulo() {
        this.Radio = 180247.0f / 100;
    }

    public float getLongitudRadio() {
        return Radio;
    }

    public float calcCircunferencia() {
        return (float) (2 * 3.1416) * Radio;
    }

    public float calcArea() {
        return (float) (3.1416 * Radio * Radio);
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        float longitudRadio = circulo.getLongitudRadio();
        System.out.println("La longitud del radio es: " + longitudRadio + "cm");

        float circunferencia = circulo.calcCircunferencia();
        System.out.println("La circunferencia mide: " + circunferencia + "cm");

        float area = circulo.calcArea();
        System.out.println("El área es de: " + area + "cm cuadrados");
    }
}
