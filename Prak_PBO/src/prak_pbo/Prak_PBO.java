/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_pbo;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */

public class Prak_PBO {
    private static Pasien[] patients;
    private static Object Interger;

    public static void main(String[] args) {
        Pasien[] patients = new Pasien[150];
        int counter = 0;
        boolean Check = false;
        
        while(!Check){
            int Isi = Integer.parseInt(JOptionPane.showInputDialog("Daftar Pasien?"
                    + " 1. Ya"
                    + " 2. Tidak"));
            if(Isi == 1){
                mainMenu(patients[counter]);
            }else{
                Check = true;
            }          
        }
    }

    private static void mainMenu(Pasien patient) {
        String namaPasien, namaKelas = null, namaPerawatan;
        int kelas, hargakelas = 0, perwatan, hargaperawatan;
        boolean BPJS;
        
        namaPasien = JOptionPane.showInputDialog("Masukan Nama = ");
        kelas = Integer.parseInt(JOptionPane.showInputDialog("Silakan Pilih Kelas = "
                + " 1. VIP I "
                + " 2. VIP II "
                + " 3. VIP III "));
        
        if(kelas == 1){
            namaKelas = "VIP I";
            hargakelas = 100000;
        }else if(kelas == 2){
            namaKelas = "VIP II";
            hargakelas = 200000;
        }else if(kelas == 3){
            namaKelas = "VIP III";
            hargakelas = 300000;
        }
    }
}
