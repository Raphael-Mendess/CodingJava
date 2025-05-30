/*A classe é um conceito que vai além do Java, é um conceito que vem do paradigma da programação orientada a objetos, a classe basicamente 
vai ser o que vai ser um modelo que vai definir a estrutura dos nossos obetos, ela vai definir os atributos(variáveis) que esse objeto possui e também
os métodos(ações e funções) que esse objeto possui e vai descrever o comportamento do objeto  
 */

public class OrientacaoObjetos{
    public static void main(String[]args){
        Carro meuCarro = new Carro();
    }
}

/* A partir do momento que criamos um arquivo Java precisamos obrigatoriamente construir uma classe Ex: public class OrientacaoObjetos
Vamos ver a partir de agora como funciona os construtores:
Um construtor é o método principal de uma classe, o construtor vai ser chamado sempre que o objeto de uma classe for criado
Vamos criar uma nova classe Carro para entender isso, dentro dessa classe um método com o mesmo nome Carro que vai escrever na tela "Carro criado"  */

class Carro{
    public Carro(){
        System.out.println("Carro criado");
    }
}


/*A partir dai iremos adicionar a classe Carro no nosso método principal que é o public static void main, veja que não precisamos definir o tipo e ja 
escrevemos Carro diretamente no método principal.
Pois uma classe ja é um tipo e ai não precisamos usar um tipo primitivo, pois ja definimos o tipo classe quando criamos o método class Carro.
O meu tipo no método principal vai ser meuCarro, então vai ficar "Carro meuCarrro", e essa classe vai receber "new Carro();" para criarmos um
novo objeto do mesmo tipo, resultando em:

Carro meu Carro = new Carro();

Quando escrevemos isso no método principal, o meu método construtor public Carro() vai ser acionado, escrevendo então o que está dentro dele,
no caso System.out.println("Carro criado").

                                         


 */ 