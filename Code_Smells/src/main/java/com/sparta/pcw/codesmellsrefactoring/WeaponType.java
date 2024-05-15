
package com.sparta.pcw.codesmellsrefactoring;

public enum WeaponType implements Shootable {
    LaserGun{
        public String shoot(){
            return "Splash!! ";
        }
    },
    WaterPistol{
        public String shoot(){
            return "Zing!! ";
        }
    },
    BubbleBlaster{
        public String shoot(){
            return "Bubbles... ";
        }
    },
    ShotGun{
        public String shoot(){
            return "BANG";
        }
    };
   
}
