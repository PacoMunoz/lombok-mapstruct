package es.pmg;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomMapper {

    CustomMapper INSTANCE = Mappers.getMapper(CustomMapper.class);

    @Mapping(source="movil", target="movilPhone")
    UserDto userToUserDto(User user);

    @Mapping(source = "numBastidor", target = "bastidor")
    @Mapping(source = "motor" , target = "modeloMotor")
    CarDto carToCarDto(Car car);
}
