import org.junit.Assert;
class ContTest {
    @org.junit.jupiter.api.Test
    public void get() {
        Cont<String> con = new Cont<String>();
        con.add("hello");
        Assert.assertEquals("hello", con.get(0));
    }
    @org.junit.jupiter.api.Test
    public void add() {
        Cont<Integer> con = new Cont<Integer>();
        con.add(154);
        con.add(152);
        Assert.assertEquals(154, con.get(0).intValue());
        Assert.assertEquals(152, con.get(1).intValue());
    }

}
