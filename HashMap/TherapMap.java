import java.util.HashMap;

public class TherapMap {
    public static void main(String[] args)
    {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("C", 1);  
        int val = 4;
        empIds.put("Java", val);  
        val = val + 5;
        
        System.out.println(val+ " " + empIds.get("Java"));
    }
}
