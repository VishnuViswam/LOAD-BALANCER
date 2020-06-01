package com.microservices.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller class for creating APIs which is present in the application.
 *
 * @author Vishnu Viswambharan
 * @version 1.0
 * @since 2020-06-01
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ApiProxy apiProxy;

    @GetMapping("/technologyInfo/{platform}")
    public ResponseModel getTechnologyInfo(@PathVariable("platform") String platform) {

        // API calling using proxy interface and mapping into ResponseModel named Object.
        ResponseModel responseModel = apiProxy.retrieveTechnologyInfo(platform);

        return responseModel;
    }
}
