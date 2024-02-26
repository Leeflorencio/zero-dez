package com.br.beecrowd;

import java.util.Scanner;

public class ZeroeDez {

    public static void main(String[] args) {

        /*
            Faça um programa que peça uma nota, entre zero e dez.
            Mostre uma mensagem caso o valor seja inválido e continue pedindo
            até que o usuário informe um valor válido
         */

        Scanner sc = new Scanner(System.in);


        do{
            System.out.println("Informe uma nota entre 0 e 10: ");
            Integer nota = sc.nextInt();

            if (nota >= 0 && nota <= 10){
                break;
            } else {
                System.out.println("Nota inválida!");
            }
        }while (true);
    }
}
