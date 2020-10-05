package com.ntt.crfactory.service;

import com.ntt.crfactory.service.dto.WaveDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.ntt.crfactory.domain.Wave}.
 */
public interface WaveService {

    /**
     * Save a wave.
     *
     * @param waveDTO the entity to save.
     * @return the persisted entity.
     */
    WaveDTO save(WaveDTO waveDTO);

    /**
     * Get all the waves.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<WaveDTO> findAll(Pageable pageable);

    /**
     * Get all the waves with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    Page<WaveDTO> findAllWithEagerRelationships(Pageable pageable);


    /**
     * Get the "id" wave.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<WaveDTO> findOne(String id);

    /**
     * Delete the "id" wave.
     *
     * @param id the id of the entity.
     */
    void delete(String id);
}
