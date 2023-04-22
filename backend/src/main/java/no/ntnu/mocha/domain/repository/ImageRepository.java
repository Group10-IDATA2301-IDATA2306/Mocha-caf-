package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import no.ntnu.mocha.domain.entities.Image;

/**
 * Represents ImageRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     Image
 */
@Repository
public interface ImageRepository extends CrudRepository<Image, Long>{
    
}