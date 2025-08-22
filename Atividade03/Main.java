package Atividade03;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Carro carro1 = new Carro();

        System.out.println("-----Informe os dados do carro-----");
        System.out.println("Digite o modelo do carro:");
        String modelo = entrada.nextLine();
        carro1.setModelo(modelo);
    for(int i=0; i<4; i++) {
        System.out.println("O que Deseja Fazer?");
        System.out.println("[1] - Acelerar");
        System.out.println("[2] - Frear");
        int acao = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner

        if(acao == 1) {
            carro1.acelerar(acao);
        }else if(acao == 2) {
            carro1.frear(acao);
        }else{
            System.out.println("Ação inválida. Por favor, digite '1' para acelerar ou '2' para frear.");
        }
    }

        carro1.exibirVelocidade();

entrada.close();

        

    }

}
