package com.tuvsud.dataStream.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "connectionDetails")
@Data
public class Connection {

    @Id
    private String connectionId;

    private String connectionName;
    private String address;
    private String connectionType;
    private String topic;
}
