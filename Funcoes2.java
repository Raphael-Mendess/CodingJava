
import java.util.Scanner;

public class Funcoes2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números");

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int higher = max(A, B, C);

        showResult(higher);

        scanner.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux = z;
        } 
        return aux;
    }

   public static void showResult(int value){
    System.out.println("higher:" + value);
   } 
}    




   

