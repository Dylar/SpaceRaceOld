package de.spacerace.game;

import com.badlogic.gdx.graphics.g2d.*;

public class Appearance
{
	private float height;
	private float width;
	TextureRegion texture;
	
	
	public void setRect(float w,float h){
		width = w;
		height = h;
	}

	public float getHeight()
	{
		return height;
	}

	public float getWidth()
	{
		return width;
	}
	
	public TextureRegion getTexture(){
		return texture;
	}

	public void setTexture(TextureRegion img){
		texture = img;
	}
}
