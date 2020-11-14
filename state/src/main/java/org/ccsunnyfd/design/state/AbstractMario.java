package org.ccsunnyfd.design.state;

import org.ccsunnyfd.design.stateMachine.MarioStateMachine;

/**
 * AbstractMario
 *
 * @version 1.0
 */
public class AbstractMario implements IMario {
    @Override
    public State getName() {
        return null;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {

    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {

    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {

    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {

    }
}
