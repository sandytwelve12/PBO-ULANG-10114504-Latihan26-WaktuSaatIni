/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan26.waktusaatini;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi tentang tanggal dan waktu saat ini
 */
import java.util.*;
import java.text.*;

public class PBOULANG10114504Latihan26WaktuSaatIni{
   public static void main(String args[]) {

      Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E, dd.MM.yyyy hh:mm:ss ");

      System.out.println("Hari ini adalah hari: " + ft.format(HariSekarang));
   }
}