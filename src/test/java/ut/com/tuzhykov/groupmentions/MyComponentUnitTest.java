package ut.com.tuzhykov.groupmentions;

import org.junit.Test;
import com.tuzhykov.groupmentions.api.MyPluginComponent;
import com.tuzhykov.groupmentions.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}