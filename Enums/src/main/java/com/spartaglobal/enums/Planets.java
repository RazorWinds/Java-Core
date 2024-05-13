
package com.spartaglobal.enums;

public enum Planets {
    VENUS(1,4),
    MERCURY(2,3),
    EARTH(3,2),
    MARS(4,1),
    JUIPTER(5,8),
    SATURN(6, 7),
    NEPTUNE0(7, 5),
    URANUS(8, 6);
    
    private double distFromSun;
    private double mass;
    
    
    Planets(double sunDist, double mass){
        this.distFromSun = sunDist;
        this.mass = mass;
    }
}
