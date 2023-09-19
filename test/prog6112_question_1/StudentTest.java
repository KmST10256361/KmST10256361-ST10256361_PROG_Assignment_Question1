/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog6112_question_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karan
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of SaveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() { 
        System.out.println("SaveStudent");
        int sID = 12;
        String sname = "KM";
        String Semail = "@moodley";
        int CorrectAGE = 34;
        String course = "MSI";
       
        
        Student instance = new Student();
        
     
        String expResult = "STUDENT DETAILS SUCCESSFILLY SAVED";
        
      String result = instance.SaveStudent(sID, sname, Semail, CorrectAGE, course);
     
        
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of StudentAge_StudentAgeValid method, of class Student.
     */
    @Test
    public void testStudentAge_StudentAgeValid() {
        System.out.println("StudentAge_StudentAgeValid");
        
             Student instance = new Student();
        
        
         instance.SaveStudent(12, "KM", "@moodley", 24, "MSI"); 
        
        boolean result = instance.StudentAge_StudentAgeValid("24");
        
        boolean expResult = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of StudentAge_StudentAgeInvalid method, of class Student.
     */
    @Test
    public void testStudentAge_StudentAgeInvalid() {
        System.out.println("StudentAge_StudentAgeInvalid");
       
  
             Student instance = new Student();
        
        
         instance.SaveStudent(12, "KM", "@moodley", 4, "MSI"); 
        
        boolean result = instance.StudentAge_StudentAgeValid("4");
        
        boolean expResult = false;
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of StudentAge_StudentAgeInvalidCharacter method, of class Student.
     */
    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        System.out.println("StudentAge_StudentAgeInvalidCharacter");
        String AGE = "sdfkshjdf345";
        Student instance = new Student();
          
         //cannot use the instance.saveStudent as it will not save the invalid charater  
  
        boolean result = instance.StudentAge_StudentAgeInvalidCharacter(AGE);
        
          boolean expResult = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of SearchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("SearchStudent");
     
        Student instance = new Student();
        
        instance.SaveStudent(12, "KM", "@moodley", 24, "MSI");
        
        boolean result = instance.SearchStudent(12);
        
        boolean expResult =true ;
   
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of SearchStudent_StudentNotFound method, of class Student.
     */
    @Test
    public void testSearchStudent_StudentNotFound() {
        System.out.println("SearchStudent_StudentNotFound");
        
           Student instance = new Student();
        
        instance.SaveStudent(12, "KM", "@moodley", 24, "MSI");
        
        boolean result = instance.SearchStudent(121);
        
        boolean expResult =false ;
   
        assertEquals(expResult, result);
     
     
        // TODO review the generated test code and remove the default call to fail.
      
    }

  
    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        int IDcheck = 12;
        Student instance = new Student();
        
         instance.SaveStudent(12, "KM", "@moodley", 24, "MSI");
   
        boolean result = instance.DeleteStudent(IDcheck);
        
             boolean expResult = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of DeleteStudent_StudentNotFound method, of class Student.
     */
    @Test
    public void testDeleteStudent_StudentNotFound() {
        System.out.println("DeleteStudent_StudentNotFound");
        int IDcheck = 55555;
        Student instance = new Student();
  
       
         instance.SaveStudent(12, "KM", "@moodley", 24, "MSI");
   
        boolean result = instance.DeleteStudent(IDcheck);
        
        boolean expResult = false;
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
