package org.emsi.Client;

import org.emsi.Client.model.Client;
import org.emsi.Client.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient

public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);}

		@Bean
		CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){
			return args -> {
				clientRepository.save(new Client(Long.parseLong("1"),"SOUMAYA EL OUALID", Float.parseFloat("23")));
				clientRepository.save(new Client(Long.parseLong("2"),"SOUMA EL OUALID", Float.parseFloat("40")));
				clientRepository.save(new Client(Long.parseLong("3"),"KHADIJA EL OUALID", Float.parseFloat("15")));
			};
		}
	}


