/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import static random.Display.ShowClass;
import static random.Display.ShowGender;
import static random.Display.ShowRace;

/**
 *
 * @author Jared Boese
 */
public class Randomizer {
        public int mights,cons,dext,perse,intell,resolv;
        
        public void randomer(int[] rand) {
        int count = 6;
        int max = 57;
        int i;
        
        max -= count;
        for (i = 0; i < count - 1; i++) {
            rand[i] = ThreadLocalRandom.current().nextInt(0, max + 1);
        }
        rand[count - 1] = max - rand[count - 1];
        Arrays.sort(rand);
        for (i = count - 1; i > 0; i--) {
            rand[i] -= rand[i - 1];
        }
        //Sets the minimum to three
        for (i = 0; i < count; i++) {
            rand[i] += 3;
        }
        int total = 75 - IntStream.of(rand).sum();
        while (total > 0) {
            int rannum = ThreadLocalRandom.current().nextInt(0, 6);
            rand[rannum]++;
            total--;
        }
    }
        
        
    public void randomstats(){
                int count = 6;
        int[] rand = new int[count];
        do {
            randomer(rand);
        } while (rand[0] > 18 || rand[1] > 18 || rand[2] > 18 || rand[3] > 18 || rand[4] > 18 || rand[5] > 18);
        System.out.println(IntStream.of(rand).sum());
        mights = rand[0];
        dext = rand[1];
        cons = rand[2];
        perse = rand[3];
        intell = rand[4];
        resolv = rand[5];
       // might.setText(String.valueOf(rand[0]));
        //dex.setText(String.valueOf(rand[1]));
        //con.setText(String.valueOf(rand[2]));
        //Pers.setText(String.valueOf(rand[3]));
        //Intel.setText(String.valueOf(rand[4]));
        //resolve.setText(String.valueOf(rand[5]));
        //StatsGen.setText("Reroll Stats");
    }
    public int getMight(){
        return mights;
    }
    public int getDex(){
        return dext;
    }
    public int getCon(){
        return cons;
    }
    public int getPers(){
        return perse;
    }
    public int getInt(){
        return intell;
    }
    public int getRes(){
        return resolv;
    }
    
                    
    public void randomrace()
    {
        List<Enum> races = new ArrayList<>();
        races.addAll(Arrays.asList(Races.values()));
        int random = ThreadLocalRandom.current().nextInt(0,races.size());
        ShowRace.setText(String.valueOf(races.get(random)));
         //Racegen.setText("Reroll Race");
        
        
       
    }
    public void randomclass(){
        List<Enum> classes = new ArrayList<>();
        classes.addAll(Arrays.asList(Classes.values()));
        int random = ThreadLocalRandom.current().nextInt(0,classes.size());
        ShowClass.setText(String.valueOf(classes.get(random)));
       // ClassGen.setText("Reroll Class");
    }
    public void randomgender(){
        Boolean random = ThreadLocalRandom.current().nextBoolean();
        if (random == true)ShowGender.setText("Female");
        else ShowGender.setText("Male");
       // GenGen.setText("Reroll Gender");
    }
 
        

    
}
