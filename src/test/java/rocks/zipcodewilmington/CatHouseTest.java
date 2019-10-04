package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        Cat cat = new Cat(null,null,2);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(cat,actual);
    }

    @Test
    public void removeCatTest() {
        Cat cat = new Cat(null,null,3);
        CatHouse.add(cat);
        CatHouse.remove(3);
        Cat actual = CatHouse.getCatById(3);
        Assert.assertNull(actual);
        // TODO - Create tests for `void remove(Integer id);
        }
        @Test
    public void idRemoveTest(){
        Cat cat = new Cat(null,null,4);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(4);
        Assert.assertNull(actual);
        }
        @Test
    public void getById(){
        Cat cat = new Cat(null,null,5);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(5);
        Assert.assertEquals(cat,actual);
        }
        @Test
    public void getNumberOfCatsTest(){
        Cat cat = new Cat(null,null,null);
        int getNumOfCats = CatHouse.getNumberOfCats();
        CatHouse.add(cat);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        }
        // TODO - Create tests for `void remove(Cat cat)`
        // TODO - Create tests for `Cat getCatById(Integer id)`
        // TODO - Create tests for `Integer getNumberOfCats()`
    }

