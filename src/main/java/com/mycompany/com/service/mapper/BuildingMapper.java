package com.mycompany.com.service.mapper;

import com.mycompany.com.domain.*;
import com.mycompany.com.service.dto.BuildingDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Building and its DTO BuildingDTO.
 */
@Mapper(componentModel = "spring", uses = {LocationMapper.class, })
public interface BuildingMapper extends EntityMapper <BuildingDTO, Building> {

    @Mapping(source = "location.id", target = "locationId")
    BuildingDTO toDto(Building building); 

    @Mapping(source = "locationId", target = "location")
    Building toEntity(BuildingDTO buildingDTO); 
    default Building fromId(Long id) {
        if (id == null) {
            return null;
        }
        Building building = new Building();
        building.setId(id);
        return building;
    }
}
