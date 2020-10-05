package com.ntt.crfactory.repository;

import com.ntt.crfactory.domain.ConfigMaster;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ConfigMaster entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConfigMasterRepository extends MongoRepository<ConfigMaster, String> {
}
