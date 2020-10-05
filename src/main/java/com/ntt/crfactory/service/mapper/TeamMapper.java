package com.ntt.crfactory.service.mapper;


import com.ntt.crfactory.domain.*;
import com.ntt.crfactory.service.dto.TeamDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Team} and its DTO {@link TeamDTO}.
 */
@Mapper(componentModel = "spring", uses = {OrganizationMapper.class})
public interface TeamMapper extends EntityMapper<TeamDTO, Team> {

    @Mapping(source = "organization.id", target = "organizationId")
    @Mapping(source = "organization.orgName", target = "organizationOrgName")
    TeamDTO toDto(Team team);

    @Mapping(source = "organizationId", target = "organization")
    Team toEntity(TeamDTO teamDTO);

    default Team fromId(String id) {
        if (id == null) {
            return null;
        }
        Team team = new Team();
        team.setId(id);
        return team;
    }
}
