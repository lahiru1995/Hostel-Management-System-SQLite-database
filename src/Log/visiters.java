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
public class visiters {
     private String name;
    private String nic;
    private String resperson;
    private String indate;
     private String outdate;
    private String hostel;
    private int room;
    private int vid;
     private String discrip;
     
     public visiters(int vid,String name, String nic, String resperson, String indate, String outdate, String hostel, int room, String discrip ){
         this.name = name;
         this.nic = nic;
         this.resperson = resperson;
         this.indate = indate;
         this.outdate = outdate;
         this.room = room;
         this.discrip = discrip;
         this.hostel = hostel;
         this.vid = vid;
     }

   public int getvid(){
         return vid;
     }
     
     public String getvisitername(){
         return name;
     }
     public String getnic(){
         return nic;
     }
     public String getresperson(){
         return resperson;
     }
     public String getindate(){
         return indate;
     }
     public String getoutdate(){
         return outdate;
     }
     public int getvisiterroom(){
         return room;
     }
     public String getdiscrip(){
         return discrip;
     }
     public String getvisiterhos(){
         return hostel;
     }
}
