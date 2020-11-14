package org.ccsunnyfd.design.state;

import org.ccsunnyfd.design.stateMachine.MarioStateMachine;

/**
 * FireMario
 *
 * @version 1.0
 */
public class FireMario extends AbstractMario {
    private static final FireMario instance = new FireMario();

    private FireMario() {
        super();
    }

    public static FireMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
