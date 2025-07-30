package application;

import entities.SalarioBruto;
import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        SalarioBruto emp = new SalarioBruto();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        
        sc.close();
    }
}
