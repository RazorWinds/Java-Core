package curling_exercise;

import java.util.ArrayList;
import java.util.List;

public class CurlingSquad {

    private int capacity = 5;
    private List<String> theCurlers = new ArrayList<>();

    private String squadName;

    public CurlingSquad(String squadName) {
        this.squadName = squadName;
    }

    // adds a single curler to the squad if there is space
    public void addCurler(String newCurler) throws Exception {
        if (theCurlers.size() == capacity) {
            throw new Exception("Squad is full");
        }
        theCurlers.add(newCurler);
    }

    // add curlers from the array newCurlers to the squad until the squad is full
    // returns the number of curlers now in the squad
    public int addCurlers(String[] newCurlers) {
        for (String curler : newCurlers) {
            try {
                addCurler(curler);
            }catch (Exception e){
                System.out.println("Could not add "+curler+". Reason: "+e.getMessage());
            }
        }
        return theCurlers.size();
    }
}
