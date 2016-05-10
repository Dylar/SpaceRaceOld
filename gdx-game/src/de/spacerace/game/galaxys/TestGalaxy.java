package de.spacerace.game.galaxys;
import com.badlogic.gdx.math.*;
import de.spacerace.game.renderer.*;
import de.spacerace.core.*;
import de.spacerace.game.*;
import de.spacerace.game.renderer.*;
import java.util.*;




public class TestGalaxy extends BaseGalaxy
{

	@Override
	public List<GameObject> getBackground()
	{
		
		return background;
	}

	@Override
	public List<GameObject> getObjects()
	{
		return objects;
	}

	private List<GameObject> background;
	private List<GameObject> objects;

	public TestGalaxy()
	{
		objects = new ArrayList<>();
		background = new ArrayList<>();
		createBackground();
		//createAllDynamicObjects()
	}

	private void createBackground()
	{
		List<Vector2> vl = new ArrayList<Vector2>();
		
		for (int i = 0;i < 8;i++)
		{
			//for(int a = 0; a<6;a++){
				
			
			Appearance app = new Appearance();
			app.setRect(FieldRenderer.UNIT_SIZE_FIELD, FieldRenderer.UNIT_SIZE_FIELD);
			Behavior be = new Behavior();
			
			int x;
			int y;
			Vector2 v;
			do{
				x =Ultis.getRandom(1, 2);
				y= Ultis.getRandom(1, 8);
				v = new Vector2(x,y);
				
				if (!contains(vl, v))
				{
			
					vl.add(v);
				}
			}
			while(!contains(vl,v));
			
			be.setRotationSpeed(Ultis.getRandom(0, 200));
			FieldObject field = new FieldObject(FieldObject.FieldType.getRandom(), app , be);
			field.setPosition(y, x);
			background.add(field);
			}
		
	}

	public boolean contains(List<Vector2> list,Object obj){
		if(obj instanceof Vector2)
			for(Vector2 v : list){
				if(v.x == ((Vector2)obj).x && v.y == ((Vector2)obj).y)
					return true;
			}
		return false;
	}
}
