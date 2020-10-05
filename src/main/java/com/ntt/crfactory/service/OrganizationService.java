package com.ntt.crfactory.service;

import com.ntt.crfactory.service.dto.OrganizationDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.ntt.crfactory.domain.Organization}.
 */
public interface OrganizationService {

    /**
     * Save a organization.
     *
     * @param organizationDTO the entity to save.
     * @return the persisted entity.
     */
    OrganizationDTO save(OrganizationDTO organizationDTO);

    /**
     * Get all the organizations.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<OrganizationDTO> findAll(Pageable pageable);


    /**
     * Get the "id" organization.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<OrganizationDTO> findOne(String id);

    /**
     * Delete the "id" organization.
     *
     * @param id the id of the entity.
     */
    void delete(String id);
}
