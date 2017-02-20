/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistikkogsimuleringprosjekt;

import java.lang.reflect.Field;
import javax.xml.stream.Location;

/**
 * This represents the Hare class of the eco-system
 * 
 * @author olemartintvad
 */
public class Hare {
    // Characteristics shared by all hares
    
    // The age which a hare can live
    private static final int MAX_AGE = 14;
    // The maximum number of births
    private static final int MAX_LITTER_SIZE = 6;

    // Individual characteristics (instance fields)
    
    // The hare's age
    private int age;
    // Whether the hare is alive or not
    private boolean alive;
    // The hare's position
    private Location location;
    // The field occupied
    private Field field;
    
    /**
     * Create a new hare. A new hare may be created with age zero or with
     * a random age.
     * 
    **/
    
    public Hare(boolean randomAge, Field field, Location location)
    {
        this.age = randomAge;
        this.field = field;
    }
}
