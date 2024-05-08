package com.spartaglobal.refactoring;




/*
==== OLD REQUIREMENTS ====
If someone is under 12 - U, PG and 12 films are available !! 12 should not be avalible to under 12
If someone is under under 15 - U, PG, 12 and 15 films are available !! 12 should not be avalible to under 15
Over 18 - all films are available


https://www.bbfc.co.uk
==== NEW REQUIREMENTS ====
R1) If someone is under 12: U, PG
R2) If someone is 12 or over: U, PG, 12
R3) If someone is 15 or over: U, PG, 12, 15
R4) If someone is 18 or over: All


==== Equivalence Partitions ====
00 -> 11 = R1
12 -> 14 = R2
15 -> 17 = R3
18 -> ?? = R4


==== 3 BVA ====
(Test input) --> (Expected Output)
00 --> R1
01 --> R1
10 --> R1
11 --> R1
12 --> R2
13 --> R2
14 --> R2
15 --> R3
16 --> R3
17 --> R3
18 --> R4
19 --> R4
*/




public class FilmClassification {

    public static String getClassificationsByAge(int ageOfViewer)
    {
        String result;
        if (ageOfViewer >= 18)
        {
            result = "All films are available.";
           
        }
        else if (ageOfViewer >= 15)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else if (ageOfViewer >= 12)
        {
             result = "U, PG & 12 films are available.";
        }
        else {
            result = "U & PG films are available.";
        }
        return result;
    }
}
 