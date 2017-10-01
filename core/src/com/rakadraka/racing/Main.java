package com.rakadraka.racing;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.rakadraka.racing.view.GameScreen;

public class Main extends Game {

    private Screen gameScreen;

    @Override
    public void create() {
        gameScreen = new GameScreen();
        setScreen(gameScreen);
    }
}
