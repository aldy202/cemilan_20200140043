/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cemilan13;

/**
 *
 * @author hp
 */
public class proses {
    int hargadibayar;
    int jumlahdiskon;
    int totaldiskon;
    int hrgawal; 
    int byrawal;
    public void prss(int hrgbyr)
    {

        if(hrgbyr< 16000)
        {
            jumlahdiskon = 0;
            totaldiskon = (int)(0.0 * hrgbyr);
            hargadibayar = (int) (hrgbyr - totaldiskon);
        }
        else if (hrgbyr > 16000 && hrgbyr < 25000)
        {
            jumlahdiskon =  10;
            totaldiskon = (int)(0.1 * hrgbyr);
            hargadibayar = (int) (hrgbyr - totaldiskon);
        }
        else if (hrgbyr > 25000 )
        {
            jumlahdiskon = 15;
            totaldiskon = (int)(0.15 * hrgbyr);
            hargadibayar = (int) (hrgbyr - totaldiskon);
        }
        
    }
    public String back(int costomer)
    {
        int kembalian;
        int uang = costomer;
        if(uang > hargadibayar)
        {
            kembalian = uang - hargadibayar;
            return "Uang kembalian : " + "Rp "+kembalian;
        }
        else  if(uang < hargadibayar)
        {
            kembalian = hargadibayar - uang;
            return "Uang costomer kurang jumlah kekurangan : " + "Rp "+kembalian;
        }
        else  if(uang == hargadibayar)
        {
            
            return "Uang anda sudah pas" ;
        }
        return "";
    }
    
}
