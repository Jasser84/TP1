/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jasser Soualhia
 */
public class cave {

    public cave() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        ArrayList<String> S = new ArrayList<String>();
        ArrayList<String> P = new ArrayList<String>();
        ArrayList<Boolean> B = new ArrayList<Boolean>();
        ArrayList<Integer> grid= new ArrayList<Integer>();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        Rooms r = new Rooms();
        r.dataRooms(S,P,B,grid,pos);
        for(int i=0;i<pos.size();i++){
            System.out.println(pos.get(i));
        }

    }

}
