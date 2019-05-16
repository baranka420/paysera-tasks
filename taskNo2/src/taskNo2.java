import java.util.ArrayList;
import java.util.List;

public class taskNo2 {

    public static void main(String args[]){
        List<String> land = new ArrayList<>();
        land.add("XOOXO");
        land.add("XOOXO");
        land.add("OOOXO");
        land.add("XXOXO");
        land.add("OXOOO");
        System.out.println(landPerimeter(land));
    }

    public static String landPerimeter(List<String> rows){ // and this is all assuming we have a rectangular map
        int perimeter = 0;
        String row;
        for (int x = 0; x < rows.size(); x++) { // assuming all the rows are equal length
            row = rows.get(x);
            for (int i = 0; i < row.length(); i++) {
                if(row.charAt(i) == 'X' || row.charAt(i) == 'x'){ // pridedu visas 4 puses ir jei is sono uzdengia kita zeme atimu
                    perimeter+=4;
                    if (x != 0){
                        if(rows.get(x-1).charAt(i) == 'X' || rows.get(x-1).charAt(i) == 'x'){
                            perimeter--;
                        }
                    }
                    if (x != rows.size()-1){
                        if(rows.get(x+1).charAt(i) == 'X' || rows.get(x+1).charAt(i) == 'x'){
                            perimeter--;
                        }
                    }
                    if(i != 0){
                        if(rows.get(x).charAt(i-1) == 'X' || rows.get(x).charAt(i-1) == 'x'){
                            perimeter--;
                        }
                    }
                    if (i != row.length()-1){
                        if(rows.get(x).charAt(i+1) == 'X' || rows.get(x).charAt(i+1) == 'x'){
                            perimeter--;
                        }
                    }
                }
            }
        }
        return "Total land perimeter: " + perimeter;
    }
}
