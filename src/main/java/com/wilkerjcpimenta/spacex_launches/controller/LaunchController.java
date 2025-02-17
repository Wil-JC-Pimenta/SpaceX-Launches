package com.wilkerjcpimenta.spacex_launches.controller;

import com.wilkerjcpimenta.spacex_launches.model.Launch;
import com.wilkerjcpimenta.spacex_launches.service.SpaceXService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class LaunchController {

    private final SpaceXService spaceXService;

    public LaunchController(SpaceXService spaceXService) {
        this.spaceXService = spaceXService;
    }

    @GetMapping("/launches")
    public Flux<Launch> getAllLaunches() {
        return spaceXService.getAllLaunches();
    }

    @GetMapping("/launches/{id}")
    public Mono<Launch> getLaunchById(@PathVariable String id) {
        return spaceXService.getLaunchById(id);
    }
}
