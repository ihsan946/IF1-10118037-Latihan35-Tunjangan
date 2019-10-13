/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunjangan;
import java.util.Scanner;

/**
 *
 * @author Muhammad Ihsan
 * Nama : Muhammad Ihsan
 * Nim   : 10118037
 * Kelas : IF-1 2018
 * Deskripsi program : Program ini menampilkan tunjangan dari karyawan
 */
public class Tunjangan {

    public static double gajiPokok;
    public static String status;
    
    public static void main(String[] args) {
       Karyawan kry = new Karyawan();
       Scanner scanner = new Scanner(System.in);
       
       //input
        System.out.println("===========Program tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gajiPokok = scanner.nextDouble();
                              
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        status = scanner.next();
        
        
        //proses
        kry.hitungGaji(gajiPokok, status);
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("GajiPokok\t\t\t:Rp.  " + gajiPokok);
        System.out.println("Tunjangan\t\t\t: Rp. " + kry.tunjangan);
        System.out.println("Total Gaji\t\t\t: Rp. " + kry.totalGaji);
        
       
    }
    
}
