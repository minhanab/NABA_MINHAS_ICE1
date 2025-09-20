/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Name: Naba Minhas
 * Student ID: 991646905
 **/
public class CardTrick {
    
    public static void main(String[] args){
            
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
    
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
     
           c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
              magicHand[i] = c;
        }
        
        System.out.print("Enter a card value (1-13): ");
        int userValue = in.nextInt();
        
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs):");
        int userSuitIndex= in.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];
        
        boolean userFound = contains(magicHand, userValue, userSuit);
        System.out.println(userFound ? "You WIN!" : "Sorry, your card is not in the magic hand. ");
        
//Adding the LuckyCard function//
        
        int luckyValue= 2;
        String luckySuit = "Clubs";
        boolean luckyFound = contains(magicHand, luckyValue, luckySuit);
        System.out.println("Lucky Card: " + luckySuit + " " + luckyValue);
        System.out.println(luckyFound ? "Lucky card FOUND! You WIN!" : "Lucky Card not Found.");
        
        
        
    }
    
        
        
        
         private static boolean contains(Card[] hand, int value, String suit) {
        if (suit == null) return false;
        String want = suit.trim().toLowerCase();
        for (Card c : hand) {
            if (c != null && c.getSuit() != null) {
                if (c.getValue() == value &&
                    c.getSuit().trim().toLowerCase().equals(want)) {
                    return true;
                }
            }
        }
        return false;
    
        
        
         }
        
         }

         

       
        
            
           

