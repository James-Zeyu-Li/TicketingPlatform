package org.java.ticketingplatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.net.URI;

@Configuration
public class DynamoDbConfig {

	@Bean
	public DynamoDbClient dynamoDbClient() {
		return DynamoDbClient.builder()
				.endpointOverride(URI.create("http://localhost:8000"))
				.region(Region.US_WEST_2)
				.credentialsProvider(
						StaticCredentialsProvider.create(
								AwsBasicCredentials.create("dummy", "dummy")
						)
				)
				.build();
	}
}
