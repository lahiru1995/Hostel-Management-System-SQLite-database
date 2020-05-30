/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log;

/**
 *
 * @author lenovo
 */
public class kuruvita {
    private int roomNo;
    private int bed1;
    private int bed2;
    private int bed3;
    private int bed4;
    
    public kuruvita(int roomNo, int bed1, int bed2,int bed3,int bed4){
        this.roomNo = roomNo;
        this.bed1 = bed1;
        this.bed2=bed2;
        this.bed3 = bed3;
        this.bed4=bed4;
    }
    
    public int getroom(){
        return roomNo;
    }
    public int getbed1(){
        return bed1;
    }
    public int getbed2(){
        return bed2;
    }
     public int getbed3(){
        return bed3;
    }
      public int getbed4(){
        return bed4;
    }
    
}