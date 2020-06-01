package com.microservices.server;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private Environment environment;

    @GetMapping("/technologyInfo/{platform}")
    public ResponseModel retrieveTechnologyInfo(@PathVariable("platform") String platform) {
        ResponseModel responseModel = new ResponseModel();

        if (platform.equalsIgnoreCase("Java")) {
            responseModel.setTittle("Technology Stack");
            responseModel.setPlatform("Java");
            responseModel.setUsedFor("Secured Web Services");
        } else if (platform.equalsIgnoreCase("python")) {
            responseModel.setTittle("Technology Stack");
            responseModel.setPlatform("python");
            responseModel.setUsedFor("Machine Learning");
        } else {
            responseModel.setTittle("Technology Stack");
            responseModel.setPlatform(platform);
            responseModel.setUsedFor("Unknown platform");
        }

        responseModel.setServerPort(Short.parseShort(environment.getProperty("local.server.port")));

        return responseModel;

    }

    ;
}
