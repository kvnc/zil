import java.util.*;

public class AutomobileSorter
{ 
    List<Automobile> sort(Collection<Automobile> autos, String sortBy, Boolean asc)
    { 
        List<Automobile> sorted = new ArrayList<Automobile>(autos);
        ComparatorFactory comparatorFactory = new ComparatorFactory();
        
        Collections.sort(sorted, comparatorFactory.getComparator(sortBy, asc));

        return sorted;
    } 
} 