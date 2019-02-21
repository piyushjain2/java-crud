package com.tuvsud.dataStream.repository;

import com.tuvsud.dataStream.domain.Connection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Long> {
}
