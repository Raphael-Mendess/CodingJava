package util;

public class Calculator {
    
    public final double PI = 3.14159;

    
    public double circumference(double radius){
        return 2.0 * PI * radius; 
    }

    public  double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3; 
    }
}

//Como os métodos aqui agora não são estáticos então somos obrigados a instanciar um novo objeto na classe principal.