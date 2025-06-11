public class ImprimirVetores{
    public static void main(String[]args){
        String frutas = "apple orange lemon potato"; 
        String[] vect = frutas.split("");
        System.out.println(vect[0]); 
        System.out.println(vect[1]);
        System.out.println(vect[2]); 
        System.err.println(vect[3]);
    }
}
