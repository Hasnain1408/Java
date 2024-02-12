package slide_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest
{
    public static void main(String[] args)
    {
        new CollectionTest ();
    }
    static final String[] colorsArr = {"red","green","blue","brown"};
    static final String[] removecolorsArr = {"red","brown"};

    public CollectionTest()
    {
        List<String> colorsList = new ArrayList<String> ( );
        List<String> removecolorsList = new ArrayList<String> ( );


        for(String x : colorsArr)
            colorsList.add ( x );

        System.out.println ( "colorsList After adding colors : " );
        System.out.println ( colorsList );


        for(String x : removecolorsArr)
            removecolorsList.add ( x );

        System.out.println ( "removecolorsList After adding colors : " );
        System.out.println ( removecolorsList );

        RemoveColors ( colorsList,removecolorsList );

        System.out.println ( "colorsList After removing colors : " );
        for(int i=0; i<colorsList.size (); i++)
        {
            System.out.printf ("%s ",colorsList.get ( i ) );
        }


    }

    private void RemoveColors( Collection<String> colorsList, Collection<String> removecolorsList )
    {
        Iterator<String> iterator = colorsList.iterator ();


        while(iterator.hasNext ( ))

            if(removecolorsList.contains ( iterator.hasNext () ))
                iterator.remove ();
    }
}
