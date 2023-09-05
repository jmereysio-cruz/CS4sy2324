/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthreysio.cruz;

/**
 *
 * @author TRUTH
 */
public class Cs4truthreysioCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
       String name1 = "Jordan Clarkson",nationality1 = "Filipino-American"; 
       String name2 = "Giannis Antetokounmpo", nationality2 = "Greek";
       String name3 = "Luka Doncic",   nationality3 = "Slovenian";
       
    double avepoints1 = 15.9;
    double avepoints2 = 22.6;
    double avepoints3 = 27.6;
    
        
       System.out.println("Player 1: " + System.lineSeparator());
       System.out.println("Name: " + name1);
  
       System.out.println("Average points: " + avepoints1);
       System.out.println("Nationality: " + nationality1 + System.lineSeparator());
       
       System.out.println("Player 2: ");
       System.out.println("Name: " + name2);
  
       System.out.println("Average points: " + avepoints2);
       System.out.println("Nationality: " + nationality2 + System.lineSeparator());
       
       System.out.println("Player 3: ");
       System.out.println("Name: " + name3);
  
       System.out.println("Average points: " + avepoints3);
       System.out.println("Nationality: " + nationality3 + System.lineSeparator());
       
      
       System.out.println("Total average points = " + (avepoints1 + avepoints2 + avepoints3));
       System.out.println("The 3 players have the same nationality = " + (nationality1 == nationality2 && nationality1 == nationality3 && nationality2 == nationality3));
       System.out.println("Jordan Clarkson averages the most points = " + (avepoints1 > avepoints2 && avepoints1 > avepoints3));
  
  
    }
    
    
    
    
