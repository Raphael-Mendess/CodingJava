//Classe com atributos para representar um triângulo 
package triangulocompoo;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double calcularArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
