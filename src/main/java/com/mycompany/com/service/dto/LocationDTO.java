package com.mycompany.com.service.dto;


import javax.validation.constraints.*;

import com.mycompany.com.domain.Building;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Location entity.
 */
public class LocationDTO implements Serializable {

    private Long id;

    @NotNull
    private String content_location;
    
    private Set<BuildingDTO> buildings = new HashSet<>();
    
    public Set<BuildingDTO> getBuildingsDTO() {
        return buildings;
    }
    
    public void setBuildingsDTO(Set<BuildingDTO> buildings) {
        this.buildings = buildings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent_location() {
        return content_location;
    }

    public void setContent_location(String content_location) {
        this.content_location = content_location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LocationDTO locationDTO = (LocationDTO) o;
        if(locationDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), locationDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
            "id=" + getId() +
            ", content_location='" + getContent_location() + "'" +
            "}";
    }
}
