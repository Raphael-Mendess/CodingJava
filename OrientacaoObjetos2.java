public class OrientacaoObjetos2{//Classe
    public static void main(String[]args){      //este é o método principal
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Bmw");
        Carro meuCarro2 = new Carro("Sandero"); 
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

class Carro{//Classe
    String modelo;
    public Carro(String modelo){
    this.modelo = modelo;                                     //Aqui criamos um atributo 'variavel' do tipo String que vai definir o modelo do carro  this.modelo = modelo;
    }

public void acelerar(){//Método
    System.out.println("Acelerando o carro " + this.modelo);
   }
}   