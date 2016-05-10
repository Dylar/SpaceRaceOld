package de.spacerace.game.renderer;
import de.spacerace.game.*;
import com.badlogic.gdx.graphics.g2d.*;

import de.spacerace.game.renderer.FieldObject.*;
import java.util.*;
import de.spacerace.core.*;


public class FieldObject extends GameObject
{

	private FieldObject.FieldType type;
	public enum FieldType
	{
		LOOSE,WIN,PICK,STORE,NONE;
		
		public static FieldType getRandom(){
			int rnd = Ultis.getRandom(1,3);
			switch(rnd){
				case 1:
					return LOOSE;
				case 2:
					return WIN;
				case 3:
					return STORE;
				case 4:
					return PICK;
			}
			return NONE;
		}
	}

	public FieldObject(FieldType ttype, Appearance app, Behavior be)
	{
		super(app,be);
		type = ttype;
		app.setTexture(FieldRenderer.getTexture(type));
	}

	@Override
	public void setPosition(int x, int y)
	{
		super.setPosition(x * FieldRenderer.UNIT_SIZE_FIELD, y * FieldRenderer.UNIT_SIZE_FIELD);
	}

}
