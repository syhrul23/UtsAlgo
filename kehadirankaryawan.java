/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Karyawan {
    private final String nama;
    private final int gaji;
    private final String jadwalKerja;
    private boolean hadir;

    public Karyawan(String nama, int gaji, String jadwalKerja) {
        this.nama = nama;
        this.gaji = gaji;
        this.jadwalKerja = jadwalKerja;
        this.hadir = false;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    public String getJadwalKerja() {
        return jadwalKerja;
    }

    public boolean isHadir() {
        return hadir;
    }

    public void setHadir(boolean hadir) {
        this.hadir = hadir;
    }
}

public class kehadirankaryawan {
    public static void main(String[] args) {
        List<Karyawan> karyawanList = new ArrayList<>();
        karyawanList.add(new Karyawan("Syahrul", 5000000, "Senin - Sabtu"));
        karyawanList.add(new Karyawan("Zaky", 4000000, "Senin - Sabtu"));
        karyawanList.add(new Karyawan("Hilmi", 5000000, "Senin - Sabtu"));
        karyawanList.add(new Karyawan("arran",60000,"senin-kamis"));
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Daftar Karyawan:");
        for (int i = 0; i < karyawanList.size(); i++) {
            System.out.println(i + 1 + ". " + karyawanList.get(i).getNama());
        }
        
        System.out.print("Pilih karyawan yang akan diubah kehadirannya(contoh : 1): ");
        int pilihanKaryawan = scanner.nextInt();
        
        System.out.print("Apakah " + karyawanList.get(pilihanKaryawan - 1).getNama() + " hadir? (iya/tidak): ");
        String pilihanHadir = scanner.next();
        
        if (pilihanHadir.equals("iya")) {
            karyawanList.get(pilihanKaryawan - 1).setHadir(true);
        } else {
            karyawanList.get(pilihanKaryawan - 1).setHadir(false);
        }
        
        System.out.println("Daftar Karyawan:");
        for (int i = 0; i < karyawanList.size(); i++) {
            System.out.println(karyawanList.get(i).getNama() + " (" + karyawanList.get(i).getJadwalKerja() + "): " + (karyawanList.get(i).isHadir() ? "hadir" : "tidak hadir"));
        }
    }
}