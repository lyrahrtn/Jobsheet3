/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;
/**
 *
 * @author SMK TELKOM
 */
public class UjiPraktikum {
    public static void main(String[] args) {
        Produktif p = new Produktif();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan alamat sekolah : ");
        String alamat = sc.next();
        System.out.print("Masukkan nomor telepon sekolah : ");
        String no = sc.next();
        System.out.print("Masukkan akreditasi sekolah : ");
        String akreditasi = sc.next();
        System.out.print("Masukkan materi yang diajar : ");
        String materi = sc.next();
        System.out.print("Masukkan alokasi waktu : ");
        int alokasi = sc.nextInt();
        System.out.print("Masukkan nama pengajar : ");
        String pengajar = sc.next();
        
        p.setAlamat(alamat);
        p.setNo(no);
        p.setAkreditasi(akreditasi);
        p.setMateri(materi);
        p.setALokasi(alokasi);
        p.setPengajar(pengajar);
        
        p.tampilkan();
    }
}
