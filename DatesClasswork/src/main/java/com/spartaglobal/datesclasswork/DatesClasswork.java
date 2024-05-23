
package com.spartaglobal.datesclasswork;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class DatesClasswork {

    public static void main(String[] args) {
        LocalDate bdayThisYear = LocalDate.of(2024, Month.NOVEMBER, 2);
        LocalDate bornDate = LocalDate.of(1989, Month.NOVEMBER, 2);
        
        Period ageThisYear = Period.between(bornDate, bdayThisYear);
        Period ageRightNow = Period.between(bornDate, LocalDate.now());
        

        long daysUntilBday = ChronoUnit.DAYS.between(LocalDate.now(), bdayThisYear);
        
        System.out.println("Nish is going to be "+ageThisYear.getYears()+ " this year.");
        System.out.println("Nish is "+ageRightNow.getYears()+ " yeears old");
        
        
        System.out.println("Nish's birthday is in "+daysUntilBday+" days");
  
        
        
        
    }
}
