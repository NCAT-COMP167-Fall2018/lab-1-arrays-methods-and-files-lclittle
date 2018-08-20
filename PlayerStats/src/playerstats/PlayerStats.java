/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lanyi
 */
public class PlayerStats {
    
    public static void readNamesandScores(String[] names, int[] scores, String fileName ){
        try {
            //perform some operation that could cause an exception
            Scanner reader = new Scanner(new File(fileName));
            int count=0;
            
            while(reader.hasNext()){
                String[] dataLine =reader.nextLine().split(" ");
                names[count]=dataLine[0];
                scores[count]=Integer.parseInt(dataLine[1].trim());
                count++;
            
            }
            
           // for(int i=0; i<79; i++){
             //   names[i]=reader.next();
               // scores[i]=reader.nextInt();
            //}
        }
    
        catch ( java.io.FileNotFoundException exception ) {
            //Actions to perform if there is an exception
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, exception);
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = new String[80];
        int[] scores = new int[80];
        String fileName="playerData2.txt";
    }
    
}
