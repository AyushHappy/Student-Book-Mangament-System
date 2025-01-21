package com.fss.demopodman;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"message=Test Message",
		"external.config.file=test-config.txt"
})
class DemopodmanApplicationTests {
	@Test
	void contextLoads() {
	}
}
