package com.tuvsud.dataStream.service;

import com.tuvsud.dataStream.domain.Connection;
import com.tuvsud.dataStream.repository.ConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConnectionService {

    @Autowired
    ConnectionRepository connectionRepository;

    public Connection save(Connection connection) {
        return connectionRepository.save(connection);
    }

    public void startStream(String connectionName) {
    }
}
