/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoanSo;

/**
 *
 * @author ASUS
 */
public class GuessGame {
     Player p1;
     Player p2;
     Player p3;
     
     public void startGame(){
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();
         
         int guessp1 = 0;
         int guessp2 = 0;
         int guessp3 = 0;
         
         boolean p1R = false;
         boolean p2R = false;
         boolean p3R = false;
         int chonNumber = (int)(Math.random() * 10);
         System.out.println("I'm thinking of a number between 0 and 9...");
         while(true){
             System.out.println("Number guess is " + chonNumber);
             
             p1.guess();
             p2.guess();
             p3.guess();
             
             guessp1 = p1.number;
             System.out.println("Player 1 guessed " + guessp1);
             guessp2 = p2.number;
             System.out.println("Player 2 guessed " + guessp2);
             guessp3 = p3.number;
             System.out.println("Player 3 guessed " + guessp3);
             
             if (guessp1 == chonNumber){
                 p1R = true;
             }
             if (guessp2 == chonNumber){
                 p2R = true;
             }
             if (guessp3 == chonNumber){
                 p3R = true;
             }
             if (p1R || p2R || p3R){
                 System.out.println("We have a winner !!!");
                 System.out.println("Player 1 got it right " + p1R);
                 System.out.println("Player 2 got it right " + p2R);
                 System.out.println("Player 3 got it right " + p3R);
                 System.out.println("Game over");
                 break;
             }  else {
                 System.out.println("Player will have to try again");
             }
         }
     }
}
