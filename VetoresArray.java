//Array - Vetores
public class VetoresArray{
    public static void main(String[] args) {
        int[] colecaodeinteiros = {1,2,3,4,5};
        System.out.println(colecaodeinteiros[0]);
    }
}
/* Tanto no Java como em outras linguagens de programação,um Vetor conhecido também como Array é uma estrutura de dados que a gente 
utiliza para armazenar uma coleção de dados do mesmo tipo, posso usar se eu for querer agrupar uma coleção de números inteiros por exemplo,podemos armazenar dados do mesmo tipo seja ele 
qual for,podendo ser float, int, String e etc.
  Quando fazemos a declaração de vetores dessa forma, a gente ta fzendo que esse vetor tenha um tamanho fixo, quando eu declarei o vetor acima eu ja deixei uma quantidade definida de elementos,
  então se tentarmos colecaointeiros[5]=6; vai dar erro porque o índice do Array que você está tentando acessar está fora dos limites desse Array.Se eu inicializei o Array com um tamanho eu não
  posso mais mudar.
  Se quisermos acessar o tamanho de um Array utilizamos System.out.println(colecaodeinteiros.lenght);
  Se quisermos falar qual vai ser o número de elementos(tamanho do vetor) e não definir eles diretamente,então podemos utilizar int[] colecaodeinteiros = new int[5];,Exemplo:
    String[]nomesArray = new String[2];
    nomesArray[0] = "Raphael";
    nomesArray[1] = "Otávio"
    ...

  Mas se eu nunca posso aumentar o tamanho do vetor então tenho um problema,se ao longo da execução do meu programa eu receber mais uma entrada do usuário, ou um valor dinamico que vem do 
  banco de dados ou vem de um arquivo do sistema do usuário que não sei quantos elementos vão vir, então precisamos usra os ArrayLists mais conhecios como Listas.
