package de.spacerace.game.renderer;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import java.util.*;
import de.spacerace.game.*;


public class FieldRenderer
{
	private static final String IMAGE_PATH = "objects.png";
	
	private static Texture         texture;
	
	public static TextureRegion brownField;
	public static TextureRegion grayField;
	public static TextureRegion blueField;
	public static TextureRegion greenField;
	public static TextureRegion redField;
	public static TextureRegion yellowField;
	
	private static List<TextureRegion> allTexture;

	public static int UNIT_SIZE_FIELD = 128;

	static{
		createTexture();
	}

	public FieldRenderer(){
		
	}

	public static void createTexture(){
		texture = new Texture(Gdx.files.internal(IMAGE_PATH));
		brownField = new TextureRegion(texture, 0, 0, 64, 64);      // #3
        grayField = new TextureRegion(texture, 64, 0, 64, 64);    // #4
        blueField = new TextureRegion(texture, 128, 0, 64, 64);     // #5
        greenField = new TextureRegion(texture, 0, 64, 64, 64);    // #6
		redField = new TextureRegion(texture, 64, 64, 64, 64);    // #6
		yellowField = new TextureRegion(texture, 128, 64, 64, 64);    // #6
		
		allTexture = new ArrayList<>();
		allTexture.add(brownField);
		allTexture.add(grayField);
		allTexture.add(blueField);
		allTexture.add(greenField);
		allTexture.add(redField);
		allTexture.add(yellowField);
	}
	
	public static List<TextureRegion> getAllTextures()
	{
		return allTexture;
	}  
	
	public static TextureRegion getTexture(FieldObject.FieldType type){
		
		switch(type){
			case WIN:
				return greenField;
			case LOOSE:
				return redField;
			case PICK:
				return yellowField;
			case STORE:
				return grayField;
			default:
				return brownField;
		}
	}
}
