package tesharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Heinrich a.k.a. Heinrich Lizato
Java Developer
Created on 19/02/2024 12:57
@Last Modified 19/02/2024 12:57
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        String input = scanner.nextLine();
        scanner.close();

        int hasil = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch < 97) {
                hasil += ch;
            }
        }
        System.out.println("Hasil: " + hasil);
    }
}

