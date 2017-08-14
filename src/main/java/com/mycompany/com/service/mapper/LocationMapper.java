package com.mycompany.com.service.mapper;

import com.mycompany.com.domain.*;
import com.mycompany.com.service.dto.LocationDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Location and its DTO LocationDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface LocationMapper extends EntityMapper <LocationDTO, Location> {
    
    @Mapping(target = "buildings", ignore = true)
    Location toEntity(LocationDTO locationDTO); 
    default Location fromId(Long id) {
        if (id == null) {
            return null;
        }
        Location location = new Location();
        location.setId(id);
        return location;
    }
}
