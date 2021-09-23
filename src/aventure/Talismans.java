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
public class Talismans {
    private Rooms r; 
    private String nom;

    public Talismans(Rooms r, String nom) {
        this.r = r;
        this.nom = nom;
    }

    Talismans() {
        
    }

    public Rooms getR() {
        return r;
    }

    public String getNom() {
        return nom;
    }

    public void setR(Rooms r) {
        this.r = r;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void dataTalismans(ArrayList<String> nomSalle, ArrayList<String> nomsTalisman){
        InputStream inputTalismans = this.getClass().getResourceAsStream("Talismans.dat");
        Scanner sc = new Scanner(inputTalismans);
        String str;
        while(sc.hasNextLine()){
            str = sc.nextLine();
            if(!str.contains("#")){
                String[] data = str.split(",");
                nomSalle.add(data[0]);
                nomsTalisman.add(data[1]);                
            }
        
    }
                
    }
    
    
}
