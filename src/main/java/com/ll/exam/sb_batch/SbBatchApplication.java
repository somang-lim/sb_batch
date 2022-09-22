package com.ll.exam.sb_batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SbBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbBatchApplication.class, args);
	}

}
