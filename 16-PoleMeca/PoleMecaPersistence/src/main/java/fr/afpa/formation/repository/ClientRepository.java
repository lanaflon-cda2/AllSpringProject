package fr.afpa.formation.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{


}
