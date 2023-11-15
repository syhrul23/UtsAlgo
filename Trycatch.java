/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;
class Trycatch {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);
int angka;
System.out.print("Masukkan Angka : ");
try {
angka = masukan.nextInt();
System.out.println("Anda memasukkan Angka "+angka);
}catch(Exception e) {
System.out.println("Anda tidak memasukkan Angka");
}
}
}