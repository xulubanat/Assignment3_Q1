package za.ac.cput.datastructures;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.datastructures.Impl.DatastructuresImpl;

/**
 * Created by student on 2016/06/03.
 */
public class DatastructuresTest {


    @Test
    public void test_Set() throws Exception{
        Datastructures set = new DatastructuresImpl();
        Assert.assertEquals(6, set.winningnumbers().size());
        Assert.assertTrue(set.winningnumbers().contains(34));


    }

    @Test
    public void test_List() throws Exception{
        Datastructures list = new DatastructuresImpl();

        Assert.assertEquals("Rollsroyce", list.cars().get(0));

    }

    @Test
    public void test_Map() throws Exception{

        Datastructures map = new DatastructuresImpl();
        Assert.assertEquals(6, map.winningnumbers().size());
        Assert.assertTrue(map.winningnumbers().contains(34));

        Assert.assertEquals("Java", map.myBooks().get("1"));

    }
}
