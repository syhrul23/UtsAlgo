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
class FormatTanggal{
public static void main(String args[])
{
Date tanggal = new Date();
System.out.printf("Cetak Tanggal : %td %<tB %<tY", tanggal);
}
}