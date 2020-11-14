package org.ccsunnyfd.design;

import org.ccsunnyfd.design.state.State;
import org.ccsunnyfd.design.stateMachine.MarioStateMachine;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);

        mario.obtainFireFlower();
        score = mario.getScore();
        state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);

        mario.meetMonster();
        score = mario.getScore();
        state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
