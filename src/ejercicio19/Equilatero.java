
package ejercicio19;

public class Equilatero {
    public static double Calcular_perimetro(double lado){
        double perimetro;
        perimetro = (lado * 3);
        return perimetro;
        
    }
    
    public static double Calcular_altura(double lado){
        double altura;
        altura = (lado* Math.sqrt(3))/2;
        return altura;
    }
    
    public static double Calcular_area(double lado){
        double area;
        area = (Math.pow(lado, 2) * Math.sqrt(3))/4;
        return area;
    }
}