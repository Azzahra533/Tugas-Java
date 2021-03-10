/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azzahra.program;

/**
 *
 * @author 26218
 */
public class Halo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] ruang = {
            {"1", "2", "3", "4", "X"},
            {"1", "2", "3", "4", "5"},
            {"1", "2", "3", "4", "5"},
            {"1", "2", "3", "X", "5"},
    };
        
      int kamarkosong = 0;
      for (int i = 0; i < ruang.length; i++) {
        for (int j = 0; j < ruang[i].length; j++) {
            if ("X". equals(ruang[i][j])) {
                System.out.println(" Tamu Berada Dilantai " + (i+1) + " Kamar " + (j+1) );
        }else {
                kamarkosong += 1;
                }
      }
      } System.out.println("");
      System.out.println(" Kamar Yang Tersedia Ada " + kamarkosong);
    }
}
