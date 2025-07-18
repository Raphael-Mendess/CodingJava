/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais*/
import java.util.Scanner;
public class ExFour{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);    
    System.out.println("Digite o número do funcionário: ");
    int funcionario = scanner.nextInt(); 
    System.out.println("Quantas horas trabalhadas? ");
    double horasTrabalhadas = scanner.nextDouble();
    double salario = horasTrabalhadas * 10;
    System.out.printf("O salário do funcionário de número %d corresponde a %.2f ",funcionario, salario);

    scanner.close();    
    }
}
