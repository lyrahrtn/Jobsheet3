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
public class Matpel extends Sekolah{
    public String pengajar;
    public int alokasi;
    
    public void setALokasi(int alokasi){
        this.alokasi = alokasi;
    }
    public void setPengajar(String pengajar){
        this.pengajar = pengajar;
    }
    public void setNamaSekolah(String namaSekolah){
        super.namaSekolah = namaSekolah;
    }
    public void setAlamat(String alamat){
        super.alamat = alamat;
    }
    public void setNo(String no){
        super.no = no;
    }
    public void setAkreditasi(String akreditasi){
        super.akreditasi = akreditasi;
    }
}
