package br.com.fernandoalmeida.demo.servicebroker;

import org.springframework.cloud.servicebroker.model.catalog.Catalog;
import org.springframework.cloud.servicebroker.model.catalog.Plan;
import org.springframework.cloud.servicebroker.model.catalog.ServiceDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceCatalogConfiguration {

	@Bean
	public Catalog catalog() {
		Plan plan = Plan.builder()
				.id("b973fb78-82f3-49ef-9b8b-c1876974a6cd")
				.name("basic")
				.description("Basic Plan")
				.free(true)
				.build();

		ServiceDefinition serviceDefinition = ServiceDefinition.builder()
				.id("bdb1be2e-360b-495c-8115-d7697f9c6a9e")
				.name("hello")
				.description("Hello service")
				.bindable(true)
				.tags("hello", "demo", "sample")
				.plans(plan)
				.metadata("displayName", "hello")
				.metadata("longDescription", "Hello service")
				.metadata("providerDisplayName", "Presto")
				.build();

		return Catalog.builder()
				.serviceDefinitions(serviceDefinition)
				.build();
	}
}