import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Produto p1 = new Produto();

         System.out.println("Informe os dados do produto : ");

         System.out.print("Nome: ");
         String nome = entrada.nextLine();
         p1.setNome(nome);

         System.out.print("Preço unitário: ");
         double preco = entrada.nextDouble();
         p1.setPreco(preco);

         System.out.print("Quantidade: ");
         int quantidade = entrada.nextInt();
         p1.setQuantidade(quantidade);

         entrada.nextLine(); 

         Produto p2 = new Produto();

         System.out.println("Informe os dados do produto : ");

         System.out.print("Nome: ");
         String nome2 = entrada.nextLine();
         p2.setNome(nome2);

         System.out.print("Preço unitário: ");
         double preco2 = entrada.nextDouble();
         p2.setPreco(preco2);

         System.out.print("Quantidade: ");
         int quantidade2 = entrada.nextInt();
         p2.setQuantidade(quantidade2);

        System.out.println("\n ---Produtos Cadastrados: ---");
        p1.exibirInfo();
        p2.exibirInfo();

    }

}
