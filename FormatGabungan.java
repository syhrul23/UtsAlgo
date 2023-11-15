/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.Date;
class FormatGabungan{
public static void main(String args[])
{
String teks = "Jumlah Mahasiswa :";
int jml = 20;
Date tgl = new Date();
System.out.printf("Tampilkan %S %d di hari %tA", teks,jml,tgl);
}
}