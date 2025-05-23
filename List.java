/*O ArrayList é uma classe do Java que nem a String, ele vai permitir que adicione ou remova itens de uma lista dinâmica de elementos,sem
declarar no momento da declaração da variável qual o tamanho que essa lista vai ter. Exemplo:
*/  
import java.util.ArrayList;
public class List{
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Raphael");
        nomes.add("Henrique");
        nomes.add("Mendes");
        nomes.add("Alvim");
        System.out.println(nomes.get(0));
        nomes.remove(0);
    } 
}
/*Para adicionar adicionar elementos dentro de um ArrayList usamos .add
Se quisermos acessar os ídices utilizamos System.out.println(nomes.get(0));
Por exemplo se quisermos buscar o nome Henrique, utilizaremos System.out.println(nomes.get(1)); , os indices se comportam da mesmam forma que os vetores.
Se quisermos remover um nome, por exemplo "Raphael" utilizamos nomes.remove(0) que é o nome que está no índice 0, então como removemos, o nome que passara a valer como índice zero sera o 
próximo da lista, no caso "Henrique".   

