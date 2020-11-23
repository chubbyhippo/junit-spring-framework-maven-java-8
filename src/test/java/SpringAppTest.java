import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
public class SpringAppTest {

	@Autowired
	private Passenger passenger;
	private Passenger expectedPassenger;

	@BeforeEach
	public void setUp() {
		expectedPassenger = PassengerUtil.getExpectedPassenger();
	}

	@Test
	public void testInitPassenger() {
		assertEquals(expectedPassenger, passenger);
	}

}
