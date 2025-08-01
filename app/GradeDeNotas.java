package app;
import java.util.Locale;
import java.util.Scanner;
import entidades.Grade;

public class GradeDeNotas {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Grade notasmaximas = new Grade();

        System.out.println("Digite o nome e as notas do aluno:");
        String name = sc.nextLine();
        notasmaximas.n1 = sc.nextDouble();
        notasmaximas.n2 = sc.nextDouble();
        notasmaximas.n3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", notasmaximas.finalGrade());


    }
}
