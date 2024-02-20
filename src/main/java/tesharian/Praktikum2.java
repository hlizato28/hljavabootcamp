package tesharian;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Heinrich a.k.a. Heinrich Lizato
Java Developer
Created on 20/02/2024 08:51
@Last Modified 20/02/2024 08:51
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        double nilai = 0;
        int jumlahAngka = 0;

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                nilai += sc.nextInt();
                jumlahAngka += 1;
            }
        } catch (Exception e) {
            System.out.println(nilai / jumlahAngka);
        }
    }
}

