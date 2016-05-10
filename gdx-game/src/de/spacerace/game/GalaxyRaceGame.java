package de.spacerace.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import de.spacerace.game.galaxys.*;
import java.util.*;
import de.spacerace.game.renderer.*;

public class GalaxyRaceGame implements ApplicationListener
{

	@Override
	public void dispose()
	{
		// TODO: Implement this method
	}


	private BaseGalaxy galaxy;
    private SpriteBatch         batch;

    @Override
    public void create()
	{
        galaxy = new TestGalaxy();

        batch = new SpriteBatch();
	}

	
	
    @Override
    public void render()
	{
		clearBackground();
		List<GameObject> background = galaxy.getBackground();
		List<GameObject> objects = galaxy.getObjects();
		float delta = Gdx.graphics.getDeltaTime();
		
        batch.begin();
		
		for (int i = 0; i < background.size(); i++)
		{
			GameObject obj = background.get(i);
			drawToBatch(obj,delta);
         }
		
		for (int i = 0; i < objects.size(); i++)
		{
			GameObject obj = objects.get(i);
			drawToBatch(obj,delta);
	    }
        batch.end();
    }
	
	private void drawToBatch(GameObject obj , float delta){
		obj.rotate(delta);
		batch.draw(obj.getTexture(), obj.getPositionX(), obj.getPositionY(), obj.getWidth() / 2, obj.getHeight() / 2, obj.getWidth(), obj.getHeight(), 1, 1, obj.getRotation());
	}


	private void clearBackground()
	{
		Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}


	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
