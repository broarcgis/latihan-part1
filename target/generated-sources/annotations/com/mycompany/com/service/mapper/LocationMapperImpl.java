package com.mycompany.com.service.mapper;

import com.mycompany.com.domain.Location;

import com.mycompany.com.service.dto.LocationDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2017-08-14T23:15:47+0700",

    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 1.2.100.v20160418-1457, environment: Java 1.8.0_131 (Oracle Corporation)"

)

@Component

public class LocationMapperImpl implements LocationMapper {

    @Override

    public LocationDTO toDto(Location arg0) {

        if ( arg0 == null ) {

            return null;
        }

        LocationDTO locationDTO = new LocationDTO();

        locationDTO.setContent_location( arg0.getContent_location() );

        locationDTO.setId( arg0.getId() );

        return locationDTO;
    }

    @Override

    public List<LocationDTO> toDto(List<Location> arg0) {

        if ( arg0 == null ) {

            return null;
        }

        List<LocationDTO> list = new ArrayList<LocationDTO>();

        for ( Location location : arg0 ) {

            list.add( toDto( location ) );
        }

        return list;
    }

    @Override

    public List<Location> toEntity(List<LocationDTO> arg0) {

        if ( arg0 == null ) {

            return null;
        }

        List<Location> list = new ArrayList<Location>();

        for ( LocationDTO locationDTO : arg0 ) {

            list.add( toEntity( locationDTO ) );
        }

        return list;
    }

    @Override

    public Location toEntity(LocationDTO locationDTO) {

        if ( locationDTO == null ) {

            return null;
        }

        Location location_ = new Location();

        location_.setContent_location( locationDTO.getContent_location() );

        location_.setId( locationDTO.getId() );

        return location_;
    }
}

