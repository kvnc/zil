import java.lang.reflect.*;
import java.util.*;

public class ComparatorFactory
{
    Comparator<Automobile> getComparator(final String sortBy, final Boolean asc)
    {    
        return new Comparator<Automobile>() 
        {
            public int compare(Automobile a1, Automobile a2) 
            {
                try 
                {
                    for(Field f : a1.getClass().getDeclaredFields()) 
                    {
                        if (f.getName() == sortBy.toString())
                        {
                            if (asc) 
                            {
                                return f.get(a1).toString().compareTo(f.get(a2).toString());
                            } 
                            else 
                            {
                                return f.get(a2).toString().compareTo(f.get(a1).toString());
                            }
                        }
                    }
                } 
                catch (Throwable e) { }
                
                return -1;
            }
        };  
    }
}