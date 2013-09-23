import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SortTest 
{	
	AutomobileSorter sorter = new AutomobileSorter();
  Collection automobiles = new ArrayList<Automobile>() 
  {{
    add(new Automobile("Subcompact", 10000, 25));
    add(new Automobile("Sports", 30000, 15));
    add(new Automobile("Compact", 20000, 30));
    add(new Automobile("Luxury", 40000, 20));
	}};

	@Test
  public void initTest() 
  {
		assertNotNull(sorter);
		assertEquals(4,automobiles.size());
  }

  @Test
	public void testPriceAsc() 
  {
    List<Automobile> sorted = sorter.sort(automobiles, "price", true); 
    assertEquals(new Integer(10000), sorted.get(0).price);
    assertEquals(new Integer(20000), sorted.get(1).price);
    assertEquals(new Integer(30000), sorted.get(2).price);
    assertEquals(new Integer(40000), sorted.get(3).price);
  }

	@Test
	public void testPriceDesc() 
  {
    List<Automobile> sorted = sorter.sort(automobiles, "price", false); 
    assertEquals(new Integer(40000), sorted.get(0).price);
    assertEquals(new Integer(30000), sorted.get(1).price);
    assertEquals(new Integer(20000), sorted.get(2).price);
    assertEquals(new Integer(10000), sorted.get(3).price);
  }

	@Test
	public void testNameAsc() 
  {
    List<Automobile> sorted = sorter.sort(automobiles, "name", true); 
    assertEquals("Compact", sorted.get(0).name);
    assertEquals("Luxury", sorted.get(1).name);
    assertEquals("Sports", sorted.get(2).name);
    assertEquals("Subcompact", sorted.get(3).name);
	}

	@Test
	public void testNameDesc() 
  {
    List<Automobile> sorted = sorter.sort(automobiles, "name", false); 
   	assertEquals("Subcompact", sorted.get(0).name);
    assertEquals("Sports", sorted.get(1).name);
    assertEquals("Luxury", sorted.get(2).name);
    assertEquals("Compact", sorted.get(3).name);
	}

	@Test
	public void testMpgAsc() 
  {
    List<Automobile> sorted = sorter.sort(automobiles, "milesPerGallon", true); 
    assertEquals(new Integer(15), sorted.get(0).milesPerGallon);
    assertEquals(new Integer(20), sorted.get(1).milesPerGallon);
    assertEquals(new Integer(25), sorted.get(2).milesPerGallon);
    assertEquals(new Integer(30), sorted.get(3).milesPerGallon);
	}

	@Test
	public void testMpgDesc() 
  {
    List<Automobile> sorted = sorter.sort(automobiles, "milesPerGallon", false); 
    assertEquals(new Integer(30), sorted.get(0).milesPerGallon);
    assertEquals(new Integer(25), sorted.get(1).milesPerGallon);
    assertEquals(new Integer(20), sorted.get(2).milesPerGallon);
    assertEquals(new Integer(15), sorted.get(3).milesPerGallon);
	}
}