/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class Throwexample {
static void checkUmur(int umur) {
if (umur < 18) {
throw new ArithmeticException("Akses ditolak - Anda harus berusia minimal 18 tahun.");
} else {
System.out.println("Akses diberikan - Anda sudah cukup umur!");
}
}
public static void main(String[] args) {
checkUmur(20);
}
}