package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import scenes.GamePlay;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new GamePlay(this));

	}

	@Override
	public void render () {
//		ScreenUtils.clear(1, 0, 0, 1);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();

		super.render();

	}

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
