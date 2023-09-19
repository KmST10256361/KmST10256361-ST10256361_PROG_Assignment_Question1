/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog6112_question_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author karan
 */

public class Student {
    
    //arraylists decalared to store information 
    //Array lists used due to it being very felixibel and not many for loops  are needed when you use them 
     public static   ArrayList<Integer> studentID = new ArrayList<Integer> ();      
    public static   ArrayList<String> studentNAME = new ArrayList<String> (); 
     public static   ArrayList<Integer> studentAGE = new ArrayList<Integer> ();
      public static   ArrayList<String> studentEMAIL = new ArrayList<String> ();
       public static   ArrayList<String> studentCOURSE = new ArrayList<String> ();
    
     //global delcalrations above 

    public String Apllication ()
{
        String choice =""; 
    
      
        System.out.println("Enter (1) to launch menu or any other key to exit  ");
        
        Scanner kb = new Scanner(System.in);
        
        choice=kb.next();
       
    
        return choice;
}
    
    public  Integer MENU ()
    {
        
        int choice=0;       //method brings up the menu 
        
        System.out.println("Please select one of the following menu items: ");
        System.out.println("(1)\tCapture a new student .");
        System.out.println("(2)\tSearch for a student .");
        System.out.println("(3)\tDelete a student .");
        System.out.println("(4)\tPrint student report .");
        System.out.println("(5)\tExit application");
        
        Scanner kb =new Scanner (System.in);
        choice=kb.nextInt();

        
        return choice;
    }
    
    public  void ExitStudentApplication()   //method exits application 
    {
        System.out.println("Thank you for using student management application");
        System.out.println("Goodbye ");
        System.exit(0);
        
    }
    
   public  String SaveStudent(  int sID,   String sname,String Semail , int CorrectAGE ,String course )  //method to save student 
   {
       
     
       
   
      
      Scanner kb = new Scanner(System.in);
      
     
            studentID.add(sID);
       
            studentNAME.add(sname);
                
            studentAGE.add(CorrectAGE);
       
           studentEMAIL.add(Semail);
          
           studentCOURSE.add(course);
           
           String show;
           show="STUDENT DETAILS SUCCESSFILLY SAVED";
           return show ;
   }
   
   public boolean StudentAge_StudentAgeValid (String AGE)  //student checks if age is greater than or equal to 16 
   {
       boolean check =false;
       int age=0;
       
       age=Integer.parseInt(AGE);
       
       if (age >= 16 ) { // checks if age is greater than or equal to 16 
           
           check=true;
           
       }
       
       return    check;             
   }
   
   public  boolean  StudentAge_StudentAgeInvalid (String AGE ) //student checks if age is less than  16 
   {
        boolean check =false;
       int age=0;
       
       age=Integer.parseInt(AGE);
       
       if (age < 16 ) { // checks if age is greater than or equal to 16 
           
           check=false;
           
       }
       
       return    check;      
       
       
   }
   
   
   public  boolean StudentAge_StudentAgeInvalidCharacter(String AGE) // check id age varible conatains any char varibles 
   {
             
                
       //useing try catch method
       
       try                                              //try -tries to convert the string to an integer 
       {
           Integer.parseInt(AGE);
           return true;
          
       }
       catch (Exception E)
       {
           return false;      //if the string cannot be converted then false is returned
       }
       
   }
   
   
   public boolean SearchStudent (int StudentID) // method used to search gor a student using an ID 
   {
      
      boolean matchcheck=false;
      
  
        
       for (int i = 0; i < studentID.size(); i++) {
           
           if (studentID.get(i).equals(StudentID) ) {
               
               matchcheck=true;
            
               System.out.println("---------------------------------------------------------------------------------");
               System.out.println("STUDENT ID:\t"+studentID.get(i));
               System.out.println("STUDENT NAME:\t"+studentNAME.get(i));
               System.out.println("STUDENT AGE:\t"+studentAGE.get(i));
               System.out.println("STUDENT EMAIL:\t"+studentEMAIL.get(i));
               System.out.println("STUDENT COURSE:\t"+studentCOURSE.get(i));
               System.out.println("-----------------------------------------------------------------------------------");
                 matchcheck=true;
           }
           
       }// end of for loop 
      
       
     return matchcheck;
   }  
   
   
   public void SearchStudent_StudentNotFound(int StudentID)   // method used if student is not found 
   {
       
          System.out.println("-----------------------------------------------------------------------------------");
          System.out.println("Student with student ID:  "+StudentID+" was not found");
           System.out.println("-----------------------------------------------------------------------------------");
       
       
   }
   
   
   
   public  void StudentReport ()     //method generate report of all students 
   {
       
       int Studentnum =1;
       
       for (int i = 0; i < studentID.size(); i++) {
           
           System.out.println("Student\t"+Studentnum);
           
           System.out.println("------------------------------------------------------------------------------------");
           
            System.out.println("STUDENT ID:\t"+studentID.get(i));
            System.out.println("STUDENT NAME:\t"+studentNAME.get(i));
            System.out.println("STUDENT AGE:\t"+studentAGE.get(i));
            System.out.println("STUDENT EMAIL:\t"+studentEMAIL.get(i));
            System.out.println("STUDENT COURSE:\t"+studentCOURSE.get(i));
           
            System.out.println("------------------------------------------------------------------------------------");
           
            Studentnum=Studentnum+1;
       }// end for loop 
       
   }
   
   
   
    public boolean DeleteStudent (  int IDcheck )  //method deletes all students 
    {
        boolean check=false;

     
            
             for (int i = 0; i < studentID.size(); i++) 
             {
                 
                 if (studentID.get(i).equals(IDcheck) ) {
                     
                     check =true;
                     studentID.remove(i);
                     studentNAME.remove(i);
                     studentAGE.remove(i);
                     studentEMAIL.remove(i);
                     studentCOURSE.remove(i);
                     
                     System.out.println("---------------------------------------------------------------------------");
                     
                     System.out.println("Student with student ID:  "+IDcheck+"  WAS DELETED!");
                     
                     System.out.println("---------------------------------------------------------------------------");
                            
                 
                 
             }// end of for loop 
          
             
        }// end of outer if
         
      
     return check;
    }
    
    
    public void  DeleteStudent_StudentNotFound(int IDcheck)// method used if no student is found to delete
    
    {
                  
                 System.out.println("That student with ID "+IDcheck +" does not exist ");
                      
    }
    
     
}// end of student class


