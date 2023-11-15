/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @syahrul's author
 */
import javax.swing.*;
public class ContohOptionPane {
public static void main(String[] args) {
JFrame kotak;
kotak=new JFrame();
String name = JOptionPane.showInputDialog(kotak,"Masukkan Nama Anda");
JOptionPane.showMessageDialog(kotak,"Selamat Datang, "+name);
}
}