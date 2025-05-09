package com.wilkerjcpimenta.spacex_launches.service;

import com.wilkerjcpimenta.spacex_launches.model.Launch;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.logging.Logger;

@Service
public class SpaceXService {

    private static final Logger logger = Logger.getLogger(SpaceXService.class.getName());
    private final WebClient webClient;

    public SpaceXService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.spacexdata.com/v4").build();
    }

    public Flux<Launch> getAllLaunches() {
        return webClient.get()
                .uri("/launches")
                .retrieve()
                .bodyToFlux(Launch.class)
                .doOnError(throwable -> logger.severe("Erro ao buscar lançamentos: " + throwable.getMessage()));
    }

    public Mono<Launch> getLaunchById(String id) {
        return webClient.get()
                .uri("/launches/{id}", id)
                .retrieve()
                .bodyToMono(Launch.class)
                .doOnError(throwable -> logger.severe("Erro ao buscar lançamento por ID: " + throwable.getMessage()));
    }
}
