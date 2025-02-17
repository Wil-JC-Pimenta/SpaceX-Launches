package com.wilkerjcpimenta.spacex_launches.resolver;

import com.wilkerjcpimenta.spacex_launches.model.Launch;
import com.wilkerjcpimenta.spacex_launches.service.SpaceXService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class LaunchResolver {

    private final SpaceXService spaceXService;

    public LaunchResolver(SpaceXService spaceXService) {
        this.spaceXService = spaceXService;
    }

    @QueryMapping
    public Flux<Launch> launches() {
        return spaceXService.getAllLaunches();
    }

    @QueryMapping
    public Mono<Launch> launchById(@Argument String id) {
        return spaceXService.getLaunchById(id);
    }
}
