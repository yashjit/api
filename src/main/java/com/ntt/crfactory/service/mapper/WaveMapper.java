package com.ntt.crfactory.service.mapper;


import com.ntt.crfactory.domain.*;
import com.ntt.crfactory.service.dto.WaveDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Wave} and its DTO {@link WaveDTO}.
 */
@Mapper(componentModel = "spring", uses = {WorkloadMapper.class, ProjectMapper.class})
public interface WaveMapper extends EntityMapper<WaveDTO, Wave> {

    @Mapping(source = "project.id", target = "projectId")
    @Mapping(source = "project.projectName", target = "projectProjectName")
    WaveDTO toDto(Wave wave);

    @Mapping(target = "removeWorkload", ignore = true)
    @Mapping(source = "projectId", target = "project")
    Wave toEntity(WaveDTO waveDTO);

    default Wave fromId(String id) {
        if (id == null) {
            return null;
        }
        Wave wave = new Wave();
        wave.setId(id);
        return wave;
    }
}
