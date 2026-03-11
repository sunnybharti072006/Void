package network.steganography;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootTest
class NetworkSteganographyApplicationTests {

	@Test
	void contextLoads() {
	}

}
