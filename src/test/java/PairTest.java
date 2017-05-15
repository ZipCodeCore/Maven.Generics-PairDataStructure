import org.junit.Test;

import org.junit.Assert;

public class PairTest {
    @Test
    public void testGetFirst() throws Exception {
        Pair<String> p = new Pair("Foo", "Bar");
        Assert.assertEquals("Foo", p.getFirst());
    }

    @Test
    public void testGetSecond() throws Exception {
        Pair<String> p = new Pair("Foo", "Bar");
        Assert.assertEquals("Bar", p.getSecond());
    }

    @Test
    public void testSetFirst() throws Exception {
        Pair<String> p = new Pair();
        p.setFirst("Foo");
        Assert.assertEquals("Foo", p.getFirst());
        Assert.assertEquals(null, p.getSecond());
    }

    @Test
    public void testSetSecond() throws Exception {
        Pair<String> p = new Pair();
        p.setSecond("Bar");
        Assert.assertEquals(null, p.getFirst());
        Assert.assertEquals("Bar", p.getSecond());
    }

    @Test
    public void testOverwriting() throws Exception {
        Pair<String> p = new Pair();
        Assert.assertEquals(null, p.getFirst());
        Assert.assertEquals(null, p.getSecond());
        p.setFirst("Foo");
        p.setSecond("Bar");
        Assert.assertEquals("Foo", p.getFirst());
        Assert.assertEquals("Bar", p.getSecond());
        p.setFirst("Zip");
        p.setSecond("Code");
        Assert.assertEquals("Zip", p.getFirst());
        Assert.assertEquals("Code", p.getSecond());
    }

}