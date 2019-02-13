package hu.blzsaa;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

    @Mapping(target = "metaClass", ignore = true)
    CarDto carToCarDto(Car car);
}