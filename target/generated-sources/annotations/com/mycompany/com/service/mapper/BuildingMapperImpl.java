package com.mycompany.com.service.mapper;

import com.mycompany.com.domain.Building;

import com.mycompany.com.domain.Location;

import com.mycompany.com.service.dto.BuildingDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2017-08-14T23:08:21+0700",

    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 1.2.100.v20160418-1457, environment: Java 1.8.0_131 (Oracle Corporation)"

)

@Component

public class BuildingMapperImpl implements BuildingMapper {

    @Autowired

    private LocationMapper locationMapper;

    @Override

    public List<Building> toEntity(List<BuildingDTO> dtoList) {

        if ( dtoList == null ) {

            return null;
        }

        List<Building> list = new ArrayList<Building>();

        for ( BuildingDTO buildingDTO : dtoList ) {

            list.add( toEntity( buildingDTO ) );
        }

        return list;
    }

    @Override

    public List<BuildingDTO> toDto(List<Building> entityList) {

        if ( entityList == null ) {

            return null;
        }

        List<BuildingDTO> list = new ArrayList<BuildingDTO>();

        for ( Building building : entityList ) {

            list.add( toDto( building ) );
        }

        return list;
    }

    @Override

    public BuildingDTO toDto(Building building) {

        if ( building == null ) {

            return null;
        }

        BuildingDTO buildingDTO_ = new BuildingDTO();

        buildingDTO_.setLocationId( buildingLocationId( building ) );

        buildingDTO_.setId( building.getId() );

        buildingDTO_.setContent_building( building.getContent_building() );

        return buildingDTO_;
    }

    @Override

    public Building toEntity(BuildingDTO buildingDTO) {

        if ( buildingDTO == null ) {

            return null;
        }

        Building building_ = new Building();

        building_.setLocation( locationMapper.fromId( buildingDTO.getLocationId() ) );

        building_.setId( buildingDTO.getId() );

        building_.setContent_building( buildingDTO.getContent_building() );

        return building_;
    }

    private Long buildingLocationId(Building building) {

        if ( building == null ) {

            return null;
        }

        Location location = building.getLocation();

        if ( location == null ) {

            return null;
        }

        Long id = location.getId();

        if ( id == null ) {

            return null;
        }

        return id;
    }
}

