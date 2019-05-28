/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus_apl;

/**
 *
 * @author BintangMeKa
 */
public class Tanggal {
    private int hari;
    private int bulan;
    private int tahun;

    public Tanggal(int hari, int bulan, int tahun){
        int batas=0;
        if(bulan==2){
            if(tahun%4==0){
                batas=29;
            }else{
                batas=28;
            }
        }else if ( ((bulan%2 == 1 )&&(bulan < 8)) || ((bulan%2 == 0)&&(bulan >=8)) ){
            batas = 31;
        }else if ( ((bulan%2 == 0 )&&(bulan < 8)) || ((bulan%2 == 1)&&(bulan >=8)) ){
            batas = 30;
        }
            
        if(hari>batas){
            this.hari = hari%batas;
            bulan = bulan+1;
        }else{
            this.hari = hari;
        }
        if(bulan>12){
            this.bulan=bulan%12;
            this.tahun = tahun+1;
        }else{
            this.bulan=bulan;
            this.tahun = tahun;
        }
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public void printTgl(){
        System.out.println(this.hari+"-"+this.bulan+"-"+this.tahun);
    }
    
    public int jarakHari(Tanggal A){
        int hari=0;
        while(A.tahun>this.tahun){
            if(A.tahun%4==0){
                hari=hari+366;
            }else{
                hari=hari+365;
            }
            A.tahun--;
        }
        
        while(A.bulan>this.bulan){
            if(bulan==2){
                if(tahun%4==0){
                    hari=hari+29;
                }else{
                    hari=hari+28;
                }
            }else if ( ((bulan%2 == 1 )&&(bulan < 8)) || ((bulan%2 == 0)&&(bulan >=8)) ){
                hari = hari+31;
            }else if ( ((bulan%2 == 0 )&&(bulan < 8)) || ((bulan%2 == 1)&&(bulan >=8)) ){
                hari = hari+30;
            }
            A.bulan--;
        }
        
        hari=hari+(A.hari-this.hari);
        
        return hari;
    }
}
