package com.tim.bong.game.playercontrol;

import com.tim.bong.game.actor.StickAnchor;

public abstract class PlayerController {
    final StickAnchor anchor;

    public PlayerController(StickAnchor anchor ) {
        this.anchor = anchor;
    }

    public void update(float deltaT) {
    }
}
