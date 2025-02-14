package com.wilkerjcpimenta.spacex_launches.resolver;

import com.wilkerjcpimenta.spacex_launches.model.Launch;
import com.wilkerjcpimenta.spacex_launches.service.SpaceXService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import java.util.List;

@Component
public class LaunchResolver implements GraphQLQueryResolver {

    private final SpaceXService spaceXService;

    public LaunchResolver(SpaceXService spaceXService) {
        this.spaceXService = spaceXService;
    }

    public Mono<List<Launch>> launches() {
        return spaceXService.getAllLaunches();
    }

    public Mono<Launch> launchById(String id) {
        return spaceXService.getLaunchById(id);
    }
}
