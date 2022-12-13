package com.example.bob;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.wavefront.WavefrontConfig;
import io.micrometer.wavefront.WavefrontMeterRegistry;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoBobApplication {

	private static final Log logger = LogFactory.getLog(DemoBobApplication.class);

	@RequestMapping("/")
	String home() {
		logger.info("home() has been called");
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoBobApplication.class, args);
	}

}
