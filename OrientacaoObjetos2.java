public class OrientacaoObjetos2 { // Classe principal

    public static void main(String[] args) { // Método principal que inicia o programa
        // Criando objetos do tipo Carro com diferentes modelos
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Bmw");
        Carro meuCarro2 = new Carro("Sandero");

        // Chamando o método acelerar() para cada carro
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

class Carro { // Classe Carro

    String modelo; // Atributo (variável de instância) do tipo String que representa o modelo do carro

    // Construtor: recebe um parâmetro (modelo) e guarda no atributo da classe
    public Carro(String modelo) {
        this.modelo = modelo; // "this.modelo" se refere ao atributo da classe; "modelo" é o parâmetro recebido
    }

    // Método que simula o carro acelerando
    public void acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
    }
}


/*Você chama o construtor da classe Carro e passa o valor "Fusca" como argumento.

Isso vai para o parâmetro do construtor: public Carro(String modelo)
🧠 Conceitos importantes que você já aplicou:
Conceito	|    class Carro e class OrientacaoObjetos2
Objeto	    |    new Carro("Fusca"), etc.
Atributo	|    String modelo;
Construtor	|    public Carro(String modelo)
Método	    |    public void acelerar()
Palavra-chave this	Usada para acessar o atributo do objeto atual

*/