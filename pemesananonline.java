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

public class pemesananonline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();
        
        System.out.print("Masukkan menu (contoh: Nasi Goreng 2, Sate Ayam 3): ");
        String menu = scanner.nextLine();
        
        System.out.print("Masukkan waktu pengiriman (contoh: 14.00): ");
        String waktuPengiriman = scanner.nextLine();
        
        System.out.print("Masukkan nomor telepon: ");
        String nomorTelepon = scanner.nextLine();
        
        System.out.println("\nPesanan dari " + namaPelanggan + " (" + nomorTelepon + ")");
        System.out.println("Alamat: " + alamat);
        System.out.println("Menu: " + menu);
        System.out.println("Waktu Pengiriman: " + waktuPengiriman);
        System.out.println("Total: 50.000");
    }
}