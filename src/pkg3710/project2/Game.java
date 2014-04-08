package pkg3710.project2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cdavila
 */
import java.util.Random;


public class Game {
    int correct;
    int guesses;
    int level;
    Player p = new Player();
    final int SWAPS = 5;
    double money;
    Cup cups[]={new Cup(0,false,1), new Cup(1,false,2),new Cup(2,false,3)};
    
    public Game()
    {
        correct = 0;
        guesses = 0;
        level = 0;
        money = 0;
    }
    
    public Game(int right,int total, int diff, double cash)
    {
        correct =right;
        guesses = total;
        level = diff;
        money = cash;
    }
    
    public int getCorrect()
    {
        return correct;
    }
    
    public int getGuesses()
    {
        return guesses;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public double getMoney()
    {
        return money;
    }
    
    public void setCorrect(int right)
    {
        correct = right;
    }
    
    public void setGuesses(int total)
    {
        guesses = total;
    }
    
    public void setLevel(int diff)
    {
        level = diff;
    }
    
    public void setMoney(int cash)
    {
        money=cash;
    }
    
    public double calculateWinPercentage(){
        int correct1 = getCorrect();
        int guesses1 = getGuesses();
        double winPercentage = correct1 / guesses1;
        return winPercentage;
    }
    
    public int[] runRound(int place)
    {
        cups[place].setContains(true);
        int swap[] = new int[SWAPS];
        Random R = new Random();
        for (int i = 0;i<SWAPS;i++)
        {
            int a = R.nextInt(3);
            int b = a;
            while(b==a)
            {  
                b = R.nextInt(3);
            }

            if(b<a){
                int temp = b;
                b = a;
                a = temp;
            }
            
            Cup c = new Cup(cups[b]);
            cups[b].copyCup(cups[a]);
            cups[a].copyCup(c);
            cups[a].setPosition(a);
            cups[b].setPosition(b);
            
            int swapCall = (cups[a].getNumber()*1000)+(a*100)+(cups[b].getNumber()*10)+b;
            swap[i] = swapCall;
            
            //System.out.println(a + " " + b+" "+swapCall + cups[0].getNumber() + " " +cups[1].getNumber() + " " +cups[2].getNumber());
        }
        
        return swap;
    }
}
