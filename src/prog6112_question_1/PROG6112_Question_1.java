/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog6112_question_1;

import java.util.Scanner;

/**
 *
 * @author karan
 */
public class PROG6112_Question_1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    
    Fullname : Karan Moodley 
    BCAD GROUP 2 
    PROG6112-Assignment 
    
    
      The referances used for project    
        
  https://www.youtube.com/watch?v=cCgOESMQe44
https://www.youtube.com/watch?v=L1htVG3xP5Y
  https://www.youtube.com/watch?v=j0lBrYSlYaU
https://www.youtube.com/watch?v=d08oJlwVgyo&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=17
https://www.youtube.com/watch?v=6wVmqY-CrGM
https://www.youtube.com/watch?v=Mm06BuD3PlY
    
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student ST = new Student(); // object of student class
        
        boolean appchoice=true;
        String applicationChoice;
       
          System.out.println("STUDENT MANAGEMENT APLLICATION");
        System.out.println("*******************************************************************************");
       applicationChoice=ST.Apllication(); //stores appliants choices to exit or use menu
       
       
   while (appchoice != false){   
        if (applicationChoice.equals("1")) {
           
            int menuCH;
            
           menuCH= ST.MENU();// stores menu choice
           
           switch (menuCH)
           {
               case 1 :  //save student 
                       Scanner kb = new Scanner(System.in);
                     
                        int sID;   
                        String sname;
                        String Semail;                      //varibles to collect student details
                        String AGE;
                        int correctAGE = 0; 
                         String course;
               
                         System.out.println("");
            System.out.println("CAPTURE  A NEW STUDENT ");
       System.out.println("****************************************************************");
                         
                     System.out.print("Enter the student ID :  ");
                     sID=kb.nextInt();
                       
                     System.out.print("Enter the student name : ");
                     sname=kb.next();
                   
                    System.out.print("Enter the student age : ");
                     AGE=kb.next();
                     
                        // age section 
                    boolean finalcheck=false;

                       while(finalcheck!=true)                                                          //methods call in if statement to check age for char char charaters
                       {
                          if (ST.StudentAge_StudentAgeInvalidCharacter(AGE)==false  ) {

                              System.out.println("You have entered a incoorect student  age ! ! !");
                              System.out.print("Please RE-enter the student age >> ");
                              AGE=kb.next();




                          }else{
                           
                                // innner if starts here
                                      if (ST.StudentAge_StudentAgeValid(AGE) == false ) // methd checks if age is valid and if not the invalid method will take over 
                                      {
                                          
                                                    if (ST.StudentAge_StudentAgeInvalid(AGE)==false)
                                                    {
                                                         
                                                                 System.out.println("You have entered a incoorect student  age ! ! !");
                                                                 System.out.print("Please RE-enter the student age >> ");
                                                                 AGE=kb.next();
                                                                 
                                                     }
                                                  
                                      }else{

                                         
                                        
                                          correctAGE=Integer.parseInt(AGE);  //changes string into integer
                                      
                                          finalcheck=true;  //set to true to end while loop 
                                      }

                          }// end of inner if else


                       }// end of while
                       
                   
                       System.out.print("Enter the student email : ");
                       Semail=kb.next();
                       
                    System.out.print("Enter the student course : ");
                    course=kb.next();
      
                   
                    String show;
                    show=ST.SaveStudent( sID, sname, Semail ,  correctAGE , course);
                    
                    System.out.println(show);
                   
                   break;
                   
               case 2: 
                 //Search for student
                     
                 Scanner bk = new Scanner(System.in);// had to kb as IDE did not allow me to use KB
                   int StudentID;
                   boolean matchcheck=false;                    
      
                     System.out.print("Enter the student ID to search : ");
                    StudentID =bk.nextInt();
                    
                  matchcheck=ST.SearchStudent(StudentID);           //to check of ID entered is correct or not 
                  
                   if (matchcheck==false) 
                   {
                       
                       ST.SearchStudent_StudentNotFound(StudentID);// will say that snice matchcheck is false that means
                                                                                // the method will say that no student was found 
                   }// end of if                                                                 
                  
                   break;
                   
                   
               case 3 :
                     //Delete a student
                   
                     int IDcheck;
                     boolean check ;
                     String decCHECK;  // to check if y is entered by the user 
                     
                         Scanner db = new Scanner(System.in);
        
        
                        System.out.print("Enter the student ID to delete:\t");
                        IDcheck=db.nextInt(); 
                        
                        System.out.println("Are you sure you want to delete student  "+IDcheck+" from the system YES (y) to delete.");
                        decCHECK=db.next();
                        
                        
                     if(decCHECK.equals("y"))   // if statement checking for y 
                     {
                               check=ST.DeleteStudent(IDcheck);   //method call to check if student is found and can be deeleeted if not it will return false 
                               
                               if (check==false)
                               {
                                    ST.DeleteStudent_StudentNotFound(IDcheck);   //if false methods returns not found 
                                }
                   
                        }    
                               
                   break;
                   
               case 4:
                   
                   //print student report
                   ST.StudentReport();
                   System.out.println("");
                    
                   break;
                   
               case 5 :
                   //Exit application
                   System.out.println("");
                   ST.ExitStudentApplication();
                   break;
                   
                   
               default:  
                    
                        System.out.println("Incorrct please choode one of the choices");  // checks if any wrong choice was entered 
           
           }
            System.out.println("");
           applicationChoice=ST.Apllication();  // brings up application choice method wether to exit or to continue
            
        }else{
            System.out.println("");    
            appchoice=true;
            ST.ExitStudentApplication();  //method called and exits application 
        }// end of if else statement 
       
   }// end of while 
   
   
    }
    
}
