import org.junit.Test;

import org.junit.Assert;

/**
 * Merely getting these tests to pass is all you need to do, but that should be a quick assignment.
 * Really mess around with the type parameters and see what happens.
 * One example is in the `testGetters()` method, change the String type parameter to Integer and then run it.
 *   What happens?
 * Then uncomment the println and see what happens.
 * Really try and digest what's happening behind the scenes.
 */
public class PairTest {

    @Test
    public void testGetters() throws Exception {
        Pair<String, Integer> p = new Pair("Foo", 1);
//        System.out.println(p.getFirst().getClass());
        Assert.assertEquals("Foo", p.getFirst());
        Assert.assertEquals(new Integer(1),  p.getSecond());
    }

    @Test
    public void testSetters() throws Exception {
        Pair<Integer, String> p = new Pair();
        p.setFirst(new Integer(1));
        p.setSecond("foobar");
        Assert.assertEquals(new Integer(1), p.getFirst());
        Assert.assertEquals("foobar", p.getSecond());
    }

    @Test
    public void testNoTypeDeclaration() throws Exception {
        Pair p = new Pair(1, "Foobar");
        Assert.assertEquals(1, p.getFirst());
        Assert.assertEquals("Foobar", p.getSecond());
        p.setSecond(2.34);
        Assert.assertEquals(2.34, p.getSecond());
    }

    @Test
    public void testNoTypeDecAndSetters() throws Exception {
        Pair p = new Pair();
        p.setFirst("FooBar");
        p.setSecond(2);
        Assert.assertEquals("FooBar", p.getFirst());
        Assert.assertEquals(2, p.getSecond());
        p.setFirst(1);
        Assert.assertEquals(1, p.getFirst());
    }

}