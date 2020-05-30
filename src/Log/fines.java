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
public class fines {
     private int index;
    private int roomN;
    private int fine;
    private String fdate;
     private String fac;
    private String hostel;
    private int year;
   
     private String discrip;
     
     public fines(int index,int roomN, int fine,String fdate, String fac, String hostel, int year, String discrip ){
         this.index = index;
         this.roomN = roomN;
         this.fine = fine;
         this.fdate = fdate;
         this.fac = fac;
         this.hostel = hostel;
         this.year = year;
         this.discrip = discrip;
       
     }

   public int getind(){
         return index;
     }
     
     public int getroomN(){
         return roomN;
     }
     public int getfine(){
         return fine;
     }
     public String getfdate(){
         return fdate;
     }
     public String getfac(){
         return fac;
     }
     public String getfhos(){
         return hostel;
     }
     public int getfyear(){
         return year;
     }
     public String getdiscrip(){
         return discrip;
     }
    
}
