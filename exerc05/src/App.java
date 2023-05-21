//* Nome do Aluno: Higor Ribas Stanchak
//* RA: 942311940
//* Nome do Programa:Faça um programa que leia o nome, o sobrenome, a idade, em
//anos, e a naturalidade (cidade de nascimento) de uma pessoa.
//Depois, o programa deve dar a seguinte opção “Deseja
//visualizar dados completos?”. Se o caractere digitado pelo
//usuário for ‘S’ o programa deve imprimir na tela Nome,
//Sobrenome, idade e naturalidade. Se o caractere digitado pelo
//usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
//o caractere não for nenhuma das outras opções acima o programa
//deve imprimir “Digitação errada. Tente Novamente”.
//* Data: 21/05/2023

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        String sobrenome;
        int idade;
        String naturalidade;
        String resposta;
        String S;
        String N;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = teclado.next();
        System.out.println("Digite seu sobrenome:");
        sobrenome = teclado.next();
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();
        System.out.println("Qual sua naturalidade(cidade de nascimento):");
        naturalidade = teclado.next();
        System.out.println("Deseja visualizar dados completos? 'S' para sim e 'N' para não");
        resposta = teclado.next();
        teclado.close();

        if(resposta.equals("S")){
            System.out.println("Seus dados complestos são:");
            System.out.println("Seu nome:"+nome);
            System.out.println("Seu sobrenome:"+sobrenome);
            System.out.println("Sua idade:"+idade);
            System.out.println("Sua naturalidade:"+naturalidade);
        }
        else if(resposta.equals("N")){
            System.out.println("Seus dados reduzidos são:");
            System.out.println("Seu nome:"+nome);
            System.out.println("Sua idade:"+idade);
        }
        else{
            System.out.println("Digitação errada. Tente Novamente");
        
        }
    }
        
    }

