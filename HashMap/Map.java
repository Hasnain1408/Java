import java.util.HashMap;

public class Map 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> empIds = new HashMap<>();
                    // not primitive

        empIds.put("John", 12345);  
        empIds.put("Carl", 54978);      //doesn't follow order
        empIds.put("Jerry", 876504321);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Hasnain"));
        System.out.println(empIds.containsValue(12345));

        empIds.put("John", 98765); //overwrite John
        empIds.replace("John", 777); //replace John
        empIds.replace("Kramer", 777); 
        empIds.putIfAbsent("Steve", 222);
        empIds.remove("Jerry");

    }
}
