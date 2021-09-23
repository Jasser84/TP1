/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jasser Soualhia
 */
public class Characters {
    public Characters(){
        
    }
    
    public void dataCharacters(ArrayList<String> nomSalle, ArrayList<String> charac, ArrayList<String> Talis){
        InputStream inputCharacters = this.getClass().getResourceAsStream("Characters.dat");
        Scanner sc = new Scanner(inputCharacters);
        String str;
        while(sc.hasNextLine()){
            str = sc.nextLine();
            if(!str.contains("#")){
                String[] data = str.split(",");
                nomSalle.add(data[0]);
                charac.add(data[1]);  
                Talis.add(data[2]);
            }
        
    }
                
    }
}
