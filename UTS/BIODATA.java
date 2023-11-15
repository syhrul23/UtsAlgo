/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Toshiba
 */
import javax.swing.JOptionPane;
public class BIODATA {
    public static void main(String[] args) {

//Perintah meginputkan data
        String nim;
        nim=JOptionPane.showInputDialog("Inputkan NIM  : ");
        String nama;
        nama=JOptionPane.showInputDialog("Inputkan Nama : ");
        String alamat;
        alamat=JOptionPane.showInputDialog("Inputkan Alamat : ");
        String email;
        email=JOptionPane.showInputDialog("Inputkan E-Mail : ");
        String nohp;
        nohp=JOptionPane.showInputDialog("Inputkan No HP : ");

        //Menampilkan data yang telah di input
        javax.swing.JOptionPane.showMessageDialog(null,"NIM : "+nim
                +"\nNama : "+nama
                +"\nAlamat : "+alamat
                +"\nE-Mail : "+email
                +"\nNo HP : "+nohp);
    }
    
}
