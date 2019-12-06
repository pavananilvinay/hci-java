
import static org.junit.Assert.*;

import org.junit.Test;

import hci.Tv;

public class MyTests {

	    @Test
	    public void testfirstUnitTest() {
	        Tv tester = new hci.Tv(); // a Class to test
	        tester.init();
	        // assert statements
	        assertEquals(tester.isFeatureSupported("HDMI"), true);
	    }
	}
 