package com.bridgelabz;

import javax.annotation.processing.SupportedSourceVersion;

public class SnakeNLadder {
    final int STARTPOSITION = 0;
    int dieRoll(){
        return (int) (Math.random()*(6-1+1)+1);
    }
    int checkOption(){
        return (int) (Math.random()*(3-1+1)+1);
    }
    public static void main(String[] args) {
        SnakeNLadder s = new SnakeNLadder();
        int playerPosition = s.STARTPOSITION;
        int dieRollNum = s.dieRoll();
        System.out.println("The Dice Number is "+dieRollNum);
        playerPosition = dieRollNum;
        int option = s.checkOption();
        System.out.println("The option is "+option);
        switch (option){
            case 1: {
                playerPosition = playerPosition;
            }break;
            case 2: {
                playerPosition = playerPosition + dieRollNum;
            }break;
            case 3: {
                playerPosition = playerPosition - dieRollNum;
            }break;
        }
        System.out.println("The player position is "+ playerPosition);
    }
}
