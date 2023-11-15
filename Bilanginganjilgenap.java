/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @syahrul's author
 */
import java.util.Scanner;
class Bilanganganjilgenap{
public static void main(String args[])
{
int angka;
System.out.println("Masukkan Angka:");
Scanner masukan = new Scanner(System.in);
angka = masukan.nextInt();
//Tanpa Kurawal
//if ( angka % 2 == 0 )
// System.out.println("Bilangan Genap");
//else
// System.out.println("Bilangan Ganjil");
//Dengan Kurawal
if ( angka % 2 == 0 ) {
System.out.println("Bilangan Genap");
}else {
System.out.println("Bilangan Ganjil");
}
}
}
