/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure;

import java.util.ArrayList;

/**
 *
 * @author Jasser Soualhia
 */
public class Joueur {
    private Integer[] position;
    private ArrayList<Talismans> inventaire;
    private ArrayList<Integer> GridSize;
    private ArrayList<Rooms> salleArray;
    private String nom;
    private Rooms r;
    
    public Joueur(String n){
        this.nom = n;
    }

    public Joueur(Integer[] position, ArrayList<Talismans> inventaire, ArrayList<Integer> G, String n) {
        this.position = position;
        this.inventaire = inventaire;
        this.GridSize = G;
        this.nom = n;
    }

    public Integer[] getPosition() {
        return position;
    }

    public ArrayList<Integer> getGridSize() {
        return GridSize;
    }

    public Rooms getR() {
        return r;
    }

    public void setGridSize(ArrayList<Integer> GridSize) {
        this.GridSize = GridSize;
    }

    public void setR(Rooms r) {
        this.r = r;
    }

    public ArrayList<Talismans> getInventaire() {
        return inventaire;
    }

    public void setPosition(Integer[] position) {
        this.position = position;
    }

    public void setInventaire(ArrayList<Talismans> inventaire) {
        this.inventaire = inventaire;
    }
    
    public Position[] move(){
        
    }
    public Boolean isOnGrid(){
        if(position[0]>this.getGridSize().get(0)||position[1]>this.getGridSize().get(1)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void ramasser(Talismans T){
        this.inventaire.add(T);
    }
    
    
}
