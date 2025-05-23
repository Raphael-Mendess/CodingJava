public class EstruturasCondicionais{
    public static void main(String[] args) {
       boolean bool = true;

        if(bool){
        System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}
        
/* Não é só com valores booleanos que conseguimos fazer nossas estruturas condicionais
Exemplo:
byte b = 100;
if b > 100{
    System.out.println("Verdadeiro");
} else{
    System.out.println("Falso"); 
}
*/ 
 
/* Podemos também usar if else juntos que signicia "senão", ao invés de termos só duas condições como ou if ou else
Exemplo:
String nomeVariavel = "Raphael"
if nomeVariavel.isBlank()){
    System.out.println("Verdadeiro");
} else if (nomeVariavel == "Raphael"){
    System.out.println("Raphael");
}
else{
    System.out.println("Falso");
}    
*/ 