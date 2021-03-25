package com.loose.dsClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loose.dsClient.enteties.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}