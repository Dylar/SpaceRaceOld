package de.spacerace.game;

public class Behavior
{
	public static final Behavior NO_BEHAVIOR = new Behavior();
	
	private float rotationSpeed;
	private float speed;
	
	public float getRotationSpeed(){
		return rotationSpeed;
	}
	
	public void setRotationSpeed(float speed){
		rotationSpeed = speed;
	}
	
	public float getSpeed(){
		return speed;
	}
	
	public void setSpeed(float movement){
		speed = movement;
	}
}
