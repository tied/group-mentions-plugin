package ut.com.tuzhykov.jira.webwork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.tuzhykov.jira.webwork.MyActionClass;

import static org.mockito.Mockito.*;

/**
 * @since 3.5
 */
public class MyActionClassTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test(expected=Exception.class)
    public void testSomething() throws Exception {

        //MyActionClass testClass = new MyActionClass();

        throw new Exception("MyActionClass has no tests!");

    }

}
