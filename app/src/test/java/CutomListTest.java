import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CutomListTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1,list.getCount());
    }

    /**
     * 下面我加的
     */
    @Test
    public void testHasCity() {
        boolean b1= list.hasCity(new City("Charlottetown", "PEI"));
        assertEquals(true, b1);
        City city = new City("Mississauga", "On");
        list.addCity(city);
        boolean b2 = list.hasCity(city);
        assertEquals(true,b2);
    }
    @Test
    public void testDeleteCity(){
        int listSize = list.getCount();
        City city = new City("Mississauga", "On");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(listSize+1-1, list.getCount());;
    }
    @Test
    public void testCount(){
        assertEquals(0,list.countCities());
        list.addCity(new City("Mississauga","On"));
        assertEquals(1,list.countCities());
    }


}

