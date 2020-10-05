package com.ntt.crfactory.service.impl;

import com.ntt.crfactory.service.ConfigMasterService;
import com.ntt.crfactory.domain.ConfigMaster;
import com.ntt.crfactory.repository.ConfigMasterRepository;
import com.ntt.crfactory.service.dto.ConfigMasterDTO;
import com.ntt.crfactory.service.mapper.ConfigMasterMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link ConfigMaster}.
 */
@Service
public class ConfigMasterServiceImpl implements ConfigMasterService {

    private final Logger log = LoggerFactory.getLogger(ConfigMasterServiceImpl.class);

    private final ConfigMasterRepository configMasterRepository;

    private final ConfigMasterMapper configMasterMapper;

    public ConfigMasterServiceImpl(ConfigMasterRepository configMasterRepository, ConfigMasterMapper configMasterMapper) {
        this.configMasterRepository = configMasterRepository;
        this.configMasterMapper = configMasterMapper;
    }

    @Override
    public ConfigMasterDTO save(ConfigMasterDTO configMasterDTO) {
        log.debug("Request to save ConfigMaster : {}", configMasterDTO);
        ConfigMaster configMaster = configMasterMapper.toEntity(configMasterDTO);
        configMaster = configMasterRepository.save(configMaster);
        return configMasterMapper.toDto(configMaster);
    }

    @Override
    public List<ConfigMasterDTO> findAll() {
        log.debug("Request to get all ConfigMasters");
        return configMasterRepository.findAll().stream()
            .map(configMasterMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    @Override
    public Optional<ConfigMasterDTO> findOne(String id) {
        log.debug("Request to get ConfigMaster : {}", id);
        return configMasterRepository.findById(id)
            .map(configMasterMapper::toDto);
    }

    @Override
    public void delete(String id) {
        log.debug("Request to delete ConfigMaster : {}", id);
        configMasterRepository.deleteById(id);
    }
}
