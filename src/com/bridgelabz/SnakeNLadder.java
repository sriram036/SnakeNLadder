package com.bridgelabz;

import javax.annotation.processing.SupportedSourceVersion;

public class SnakeNLadder {
    final int STARTPOSITION = 0;
    final int ENDPOINT = 100;
    int dieRoll(){
        return (int) (Math.random()*(6-1+1)+1);
    }
    int checkOption(){
        return (int) (Math.random()*(3-1+1)+1);
    }
    public static void main(String[] args) {
        SnakeNLadder s = new SnakeNLadder();
        int playerPosition = s.STARTPOSITION;
        while(playerPosition < s.ENDPOINT){
            int dieRollNum = s.dieRoll();
            System.out.println("The Dice Number is " + dieRollNum);
            if(playerPosition+dieRollNum > s.ENDPOINT){
                playerPosition = playerPosition - dieRollNum;
            }
            else{
                playerPosition = playerPosition + dieRollNum;
            }
            int option = s.checkOption();
            System.out.println("The option is " + option);
            switch (option) {
                case 1: {
                    playerPosition = playerPosition;
                }
                break;
                case 2: {
                    playerPosition = playerPosition + dieRollNum;
                    if(playerPosition > s.ENDPOINT){
                        playerPosition = playerPosition - dieRollNum;
                    }
                }
                break;
                case 3: {
                    playerPosition = playerPosition - dieRollNum;
                }
                break;
            }
            System.out.println("The player position is " + playerPosition);
            if(playerPosition < 0){
                playerPosition = s.STARTPOSITION;
            }
        }
        if (playerPosition == s.ENDPOINT) {
            System.out.println("The player is reached "+playerPosition+" and win the game.");
        }
    }
}
