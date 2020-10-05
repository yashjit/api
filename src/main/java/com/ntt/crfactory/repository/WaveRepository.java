package com.ntt.crfactory.repository;

import com.ntt.crfactory.domain.Wave;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data MongoDB repository for the Wave entity.
 */
@Repository
public interface WaveRepository extends MongoRepository<Wave, String> {

    @Query("{}")
    Page<Wave> findAllWithEagerRelationships(Pageable pageable);

    @Query("{}")
    List<Wave> findAllWithEagerRelationships();

    @Query("{'id': ?0}")
    Optional<Wave> findOneWithEagerRelationships(String id);
}
