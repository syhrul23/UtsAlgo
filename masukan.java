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
class Masukan {
    public static void main(String[] args) {
            @SuppressWarnings("resource")
            Scanner masukan = new Scanner(System.in);
            String nama;

            System.out.println("Masukkan nama Anda");
            nama = masukan.nextLine(); // Coba ganti menjadi masukan.next();

            System.out.println("Selamat Datang, " + nama);
    }
}   