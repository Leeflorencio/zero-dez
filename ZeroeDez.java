package com.br.beecrowd;

import java.util.Scanner;

public class ZeroeDez {

    public static void main(String[] args) {

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
