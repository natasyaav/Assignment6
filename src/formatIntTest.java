import org.junit.Assert;

public class formatIntTest {
    formatInt i = new formatInt();
    String expected_result = "00034";


    @org.junit.Test
    public void format() throws Exception {
        Assert.assertEquals("Expected result = 00034",expected_result, i.format(34,5));
    }

}