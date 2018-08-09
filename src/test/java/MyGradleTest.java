import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyGradleTest {
    @Test
    public void name() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        FirstGradleClass.print(new PrintStream(out));
        String s=out.toString();
        Assert.assertEquals("Hejsan världen!\r\n",s);
    }
}
