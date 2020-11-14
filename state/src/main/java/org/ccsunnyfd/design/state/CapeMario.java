package org.ccsunnyfd.design.state;

import org.ccsunnyfd.design.stateMachine.MarioStateMachine;

/**
 * CapeMario
 *
 * @version 1.0
 */
public class CapeMario extends AbstractMario {
    private static final CapeMario instance = new CapeMario();

    private CapeMario() {
        super();
    }

    public static CapeMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
