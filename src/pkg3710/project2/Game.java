//package pkg3710.project2;

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
    Player p;
    int SWAPS = 5;
    double money;
    Cup cups[]={new Cup(0,false,1), new Cup(1,false,2),new Cup(2,false,3)};
    
    public Game()
    {
        correct = 0;
        guesses = 0;
        level = 1;
        money = 1000;
        p = new Player(level,money); //creates an instance of the player class
    }
    
    public Game(int right,int total, int diff, double cash)
    {
        correct =right;
        guesses = total;
        level = diff;
        money = cash;
        p = new Player(level,money);
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
    
    public void setMoney(double cash)
    {
        money=cash;
    }
    
    public Cup[] getCups(){
        return cups;
    }
    
    public int getPlaceOfBall(){
    	for(int i =0;i<cups.length;i++){
    		if(cups[i].containsBall())
    			return i;
    	}
    	
    	return -1;
    }
    
    //calculate the win percentage
    public double calculateWinPercentage(){
        if(guesses != 0)
        	return (correct/(double)(guesses)) *100;
        else
        	return 0;
    }
    
    public void setCups(Cup[] c){
    	for(int i = 0;i<c.length;i++){
    		cups[i] = c[i];
    	}
    }
    
    //In: the position of which the ball will be hiding under
    //Out: an array of swaps in the format "abcd"
    //Essentially: cup 'a' is moving to position 'b' and cup 'c' is moving to position 'd'
    public int[] runRound(int place)
    {
    	SWAPS = (int) (5 + .5*(double)level);
        //reset the cups so none of them 'contain the ball'
        for(int i = 0;i<cups.length;i++){
            cups[i].setContains(false);
        }
        //set the cup at place to contain the ball
        cups[place].setContains(true);
        
        
        int swap[] = new int[SWAPS];
        
        //generate random numbers to be swapped, making sure they are different
        Random R = new Random();
        for (int i = 0;i<SWAPS;i++)
        {
            int a = R.nextInt(3);
            int b = a;
            while(b==a)
            {  
                b = R.nextInt(3);
            }

            //swap the numbers of necessary so 'b' is the larger number
            if(b<a){
                int temp = b;
                b = a;
                a = temp;
            }
            
            //swap the cup objects int the array
            Cup c = new Cup(cups[b]);
            cups[b].copyCup(cups[a]);
            cups[a].copyCup(c);
            cups[a].setPosition(a);
            cups[b].setPosition(b);
            
            //The swapCall creates a 4 digit integer 'abcd' which basically says Cup 'a' moves 
            //to position 'b' and Cup 'c' moves to position 'd' to represent 1 move. All of these 
            //combos are added to an array and sent to the newJFrame to make the swaps happen graphically
            int swapCall = (cups[a].getNumber()*1000)+(a*100)+(cups[b].getNumber()*10)+b;
            swap[i] = swapCall;
            
            //System.out.println(a + " " + b+" "+swapCall+" " + cups[0].getNumber() + " " +cups[1].getNumber() + " " +cups[2].getNumber());
        }
        
        return swap;
    }
    
    public boolean guess(int cup, double wager){
    	guesses++;   	
    	if(cups[cup].containsBall()){
    		money += wager;
    		correct++;
    		level++;
    		p.deposit(wager);
    		return true;
    	}else{
    		money -= wager;
    		p.withdraw(wager);
    		return false;
    	}
    }
    
    public Player getPlayer(){
    	return p;
    }
}
