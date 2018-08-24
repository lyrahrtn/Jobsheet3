/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author SMK TELKOM
 */
public class Produktif extends Matpel{
    public String materi;
    
    public void setMateri(String materi){
        this.materi = materi;
    }
    public void setAlokasi(int alokasi){
        super.alokasi = alokasi;
    }
    public void setPengajar(String pengajar){
        super.pengajar = pengajar;
    }
    public void tampilkan(){
        System.out.println("========================================");
        System.out.println("Data Mata Pelajaran di SMK Telkom Malang");
        System.out.println("========================================");
        System.out.println("Nama Sekolah : "+namaSekolah);
        System.out.println("Alamat : "+alamat);
        System.out.println("Nomor Telepon Sekolah : "+no);
        System.out.println("Akreditasi : "+akreditasi);
        System.out.println("Materi : "+materi);
        System.out.println("Alokasi : "+alokasi+" jam");
        System.out.println("Nama Pengajar : "+pengajar);
    }
}
