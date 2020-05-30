/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author lenovo
 */
public class student {
     private ByteArrayOutputStream img;
    private String name;
    private int indexNo;
    private String address;
    private String phone;
    private String email;
    private String parent_name;
    private String parent_phone;
     private String gender;
    private String religion;
    private String faculty;
     private int year;
     //private byte pic;
     private int room;
     private int bed;
     private String date;
      private String vmodel;
       private String vnumber;
        private String hostel;
        private byte[] pic;
     
     public student(int indexNo, String name, String address, String phone, String email, String parent_name,String parent_phone, String gender,String religion, String faculty,int year, byte[] pic,int room,int bed, String date,String vmodel,String vnumber){
         this.indexNo = indexNo;
         this.name = name;
         this.address = address;
         this.email = email;
         this.phone = phone;
         this.parent_name = parent_name;
         this.parent_phone = parent_phone;
         this.gender = gender;
         this.religion = religion;
         this.faculty = faculty;
         this.year = year;
        this.pic = pic;
         this.room = room;
         this.bed = bed;
         this.date = date;
         this.vmodel = vmodel;
         this.vnumber = vnumber;
        // this.hostel = hostel;
     }
     
     public int getindexNo(){
         return indexNo;
     }
     public String getname(){
         return name;
     }
     public String getaddress(){
         return address;
     }
      public String getemail(){
         return email;
     }
      public String getphone(){
         return phone;
     }
      public String getparent_name(){
         return parent_name;
     }
       public String getparent_phone(){
         return parent_phone;
     }
        public String getgender(){
         return gender;
     }
          public String getreligion(){
         return religion;
     }
          public String getfaculty(){
         return faculty;
     }
            public int getyear(){
         return year;
     }
          public byte [] getPic()
    {
        if(img != null)
            return img.toByteArray();
        else 
            return pic;
    }
              public int getroom(){
         return room;
     }
                 public int getbed(){
         return bed;
     }
                    public String getdate(){
         return date;
     }
                     public String getvmodel(){
         return vmodel;
     }
                      public String getvnum(){
         return vnumber;
     }
                        public String gethostel(){
         return hostel;
     }
                    
    
}
