import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection 
{
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Stella",6);

        Field[] catFields=myCat.getClass().getDeclaredFields();

        for(Field field : catFields)
        {
            if(field.getName().equals("name"))
            {
                field.setAccessible(true);
                field.set(myCat, "Jimmy McGill");
            }
        }
        
        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for(Method method : catMethods)
        {
            if(method.getName().equals("thisIsAPrivateStaticMethod"))
            {
                method.setAccessible(true);
                method.invoke(myCat);
               // method.invoke(null); //for static method
            }else  if(method.getName().equals("guessAge"))
            {
                method.setAccessible(true); 
                System.out.println(method.invoke(myCat,7));
            }
        }
    }
}
