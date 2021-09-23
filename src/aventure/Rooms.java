/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure;

import java.io.InputStream;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jasser Soualhia
 */
public class Rooms {
    private String nom;
    private String sorties;
    private boolean flag;

    public Rooms(){
        
    }
    public Rooms(String nom, String sorties, boolean flag) {
        this.nom = nom;
        this.sorties = sorties;
        this.flag = flag;
    }

    public String getNom() {
        return nom;
    }

    public String getSorties() {
        return sorties;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSorties(String sorties) {
        this.sorties = sorties;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public void dataRooms(ArrayList<String> nomSalle, ArrayList<String> possibleExit, ArrayList<Boolean> depart, ArrayList<Integer> GridSize, ArrayList<Integer> coord){
        InputStream inputRooms = this.getClass().getResourceAsStream("Rooms.dat");
        Scanner sc = new Scanner(inputRooms);
        String str;
        while(sc.hasNextLine()){
            Pattern p = Pattern.compile("\\d+");
            str = sc.nextLine();
            if(str.contains("!")){
                String[] sizeGrid = str.split("!");
                GridSize.add(parseInt(sizeGrid[1].split(",")[0]));
                GridSize.add(parseInt(sizeGrid[1].split(",")[1]));
            }
            if(!str.contains("#")&!str.contains("!")){
                String[] data = str.split(",");
                nomSalle.add(data[0]);
                possibleExit.add(data[1]);  
                depart.add(Boolean.parseBoolean(data[2]));
            }
            
            if(str.contains("#")){
                Matcher m = p.matcher(str);
                while(m.find()){
                    coord.add(parseInt(m.group()));
            }
            
        
    }           
    }
    
   
    
    
}
}