package Atividade02.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.println("-----Informe os dados do aluno-----");
        System.out.println("Nome:");
        String nome = entrada.nextLine();
        aluno1.setNome(nome);
        System.out.println("Digita a Nota 01 do aluno:");
        double nota1 = entrada.nextDouble();
        aluno1.setNota1(nota1);
        System.out.println("Digite a Nota 02 do aluno:");
        double nota2 = entrada.nextDouble();
        aluno1.setNota2(nota2);

        entrada.nextLine();

        System.out.println("\n-----Dados do Aluno-----");
        System.out.println("Nome: " + aluno1.getNome());
        aluno1.verificarAprovacao();

    
        entrada.close();
    }
    
}
