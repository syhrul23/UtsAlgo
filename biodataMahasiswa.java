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
public class biodataMahasiswa {
    public static void main(String[] args) {
      //deklarasi variabel
      String nama;
      String nim;
      //memberikan nilia pada varibel secara dinamis
      //memanggil class scanner
      Scanner input_bio=new Scanner (System.in);
      //nama
      System.out.print("Nama:");
      nama=input_bio.nextLine();
      //nim
      System.out.print("Nim:");
      nim=input_bio.nextLine();
      //cetak nama dan nim
      System.out.println("nama"+nama);
      System.out.println("nim"+nim); 
    }
}