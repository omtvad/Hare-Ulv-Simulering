/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistikkogsimuleringprosjekt;

import java.lang.reflect.Field;
import javax.xml.stream.Location;

/**
 * This class represents the Wolf class for the eco-system
 * 
 * @author olemartintvad
 */
public class Wolf {
    // Characteristics shared by all foxes (class variables).
    
    // Individual characteristics (instance fields)
    
    // The wolf's age.
    private int age;
    // Whether the wolf is alive or not
    private boolean alive;
    // The fox's position
    private Location location;
    // The field occupied
    private Field field;
    
    public Wolf ()
    {
        
    }
}
