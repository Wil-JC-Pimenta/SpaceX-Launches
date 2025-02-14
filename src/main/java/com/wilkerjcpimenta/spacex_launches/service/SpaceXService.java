package com.wilkerjcpimenta.spacex_launches.service;

import com.wilkerjcpimenta.spacex_launches.model.Launch;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;

@Service
public class SpaceXService {

    private final WebClient webClient;

    public SpaceXService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.spacexdata.com/v4").build();
    }

    public Mono<List<Launch>> getAllLaunches() {
        return webClient.get()
                .uri("/launches")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<>() {});
    }

    public Mono<Launch> getLaunchById(String id) {
        return webClient.get()
                .uri("/launches/{id}", id)
                .retrieve()
                .bodyToMono(Launch.class);
    }
}
