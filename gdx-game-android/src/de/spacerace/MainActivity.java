package de.spacerace;

import android.os.*;
import com.badlogic.gdx.backends.android.*;
import de.spacerace.game.*;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        
        initialize(new GalaxyRaceGame(), cfg);
    }
}
