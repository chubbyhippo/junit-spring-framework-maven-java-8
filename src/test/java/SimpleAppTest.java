import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleAppTest {
	private static final String APPLICATION_CONTEXT_XML_FILE_NAME = "classpath:application-context.xml";

	private ClassPathXmlApplicationContext context;
	
	private Passenger expectedPassenger;
	
	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML_FILE_NAME);
		expectedPassenger = getExpectedPassenger();
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
