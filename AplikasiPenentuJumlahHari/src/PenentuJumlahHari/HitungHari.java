/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenentuJumlahHari;

/**
 *
 * @author ASUS
 */
public class HitungHari {
    public String Hitung(String tahun, String bulan){
        String[] bln31 = {"Januari", "Maret","Mei","Juli","Agustus","Oktober","Desember"};
        int getTahun = Integer.parseInt(tahun);
        String getHari = "";
        for (String i : bln31) {
            if(bulan == null ? i == null : bulan.equals(i)){
                getHari = "31";
                break;
            }
        }
        if("".equals(getHari)){
            if("Februari".equals(bulan)){
                if(getTahun % 4 == 0){
                    getHari = "29";
                }else{
                    getHari = "28";
                }
            }else{
                getHari = "30";
            }
        }
            
        return "Jumlah hari pada bulan "+bulan+" tahun "+ tahun +" adalah "+getHari;
    }
}
