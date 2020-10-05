package de.andreasriepl.requestlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class RequestController {

    Logger logger = LoggerFactory.getLogger(RequestController.class);

    @PostMapping("/")
    ResponseEntity<Void> request(@RequestBody String jsonObject) {
        logger.info(jsonObject);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}