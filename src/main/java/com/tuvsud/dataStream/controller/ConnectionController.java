package com.tuvsud.dataStream.controller;

import com.tuvsud.dataStream.domain.Connection;
import com.tuvsud.dataStream.repository.ConnectionRepository;
import com.tuvsud.dataStream.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConnectionController {

    @Autowired
    ConnectionService connectionService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity process(@RequestBody Connection connection) {
        Connection response = connectionService.save(connection);
        return response != null ? new ResponseEntity(HttpStatus.CREATED) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public void start(@RequestParam("connectionName") String connectionName) {
        connectionService.startStream(connectionName);
    }

}

