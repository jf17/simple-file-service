package ru.jf17.file.simplefileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.jf17.file.simplefileservice.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SimpleFileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFileServiceApplication.class, args);
	}

}
