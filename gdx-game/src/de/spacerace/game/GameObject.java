package de.spacerace.game;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public abstract class GameObject
{
	private int positionX;
	private int positionY;
	
	private float currentRotation;
	
	private Behavior behavior;
	private Appearance appearance;
	
	
	public GameObject( Appearance app, Behavior be)
	{
		behavior = be;
		appearance=app;
	}
	public float getRotation()
	{
		return currentRotation;
	}
	
	public void rotate(float delta)
	{
		currentRotation += (behavior.getRotationSpeed() * delta);
	}

	public void setPosition(int x, int y)
	{
		positionX = x;
		positionY = y;
	}
	

	public float getPositionY()
	{
		return positionY;
	}

	public float getPositionX()
	{
		return positionX;
	}

	public float getWidth(){
		return appearance.getWidth();
	}
	
	public float getHeight(){
		return appearance.getHeight();
	}
	
	public TextureRegion getTexture(){
		return appearance.getTexture();
	}
	
	public Appearance getAppearance(){return appearance;}
	public Behavior getBehavior(){return behavior;}
}
