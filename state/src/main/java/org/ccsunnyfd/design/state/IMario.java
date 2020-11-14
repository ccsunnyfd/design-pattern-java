package org.ccsunnyfd.design.state;

import org.ccsunnyfd.design.stateMachine.MarioStateMachine;

/**
 * IMario
 *
 * @version 1.0
 */
public interface IMario {
    State getName();
    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}
