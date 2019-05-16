import java.util.ArrayList;
import java.util.List;

public class TaskNo1 {

    public static void main(String args[]){
        List<String> matches = new ArrayList<>();
        matches.add("3:1");
        matches.add("3:4");
        matches.add("3:1");
        matches.add("3:1");
        matches.add("3:3");
        matches.add("3:1");
        matches.add("3:1");
        matches.add("3:1");
        matches.add("3:1");
        matches.add("3:1");
        System.out.println(countPoints(matches));
    }



    public static int countPoints(List<String> matches){ // Assuming our team is team whose goals are denoted by x
        short points = 0;
        for (String match: matches // assuming the list has 10 matches in it for each works fine instead of for loop
             ) {
            if(match.charAt(0) > match.charAt(2)){ // assuming the strings are entered correctly and are less than 5 theres no need
                points+=3;                          // to check if it's not a random symbol instead of a number
            }else if(match.charAt(0) == match.charAt(2)){
                points++;
            }
        }
        return points;
    }
}
