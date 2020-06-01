package com.microservices.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Interface which act as a proxy, for communicating with API server.
 *
 * @author Vishnu Viswambharan
 * @version 1.0
 * @since 2020-06-01
 */
@FeignClient(name = "micro-service-server")
@RibbonClient(name = "micro-service-server")
public interface ApiProxy {

    @GetMapping("/server/technologyInfo/{platform}")
    ResponseModel retrieveTechnologyInfo(@PathVariable("platform") String platform);
}
