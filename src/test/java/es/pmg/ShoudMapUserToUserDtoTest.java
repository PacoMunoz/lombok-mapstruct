package es.pmg;

import org.junit.Assert;
import org.junit.Test;


public class ShoudMapUserToUserDtoTest {

    @Test
    public void test1(){

        User user = new User();

        user.setFirstName("Paco");
        user.setLastName("Paco");
        user.setAddress("Avd. de la Estación 12");
        user.setMovil("878324897");
        user.setPhone("324098324");

        UserDto userDto = CustomMapper.INSTANCE.userToUserDto(user);

        System.out.println("Usuario: " + user.toString());
        System.out.println("UsuarioDto: " + userDto.toString());

        Assert.assertNotNull(userDto);


    }

    @Test
    public void test2(){
        Car car = new Car();

        car.setMarca("Seat");
        car.setMatricula("4432 DRF");
        car.setMotor("TDI 2.0 143 cv");
        car.setNumBastidor(12213);
        car.setModelo("León");

        CarDto carDto = CustomMapper.INSTANCE.carToCarDto(car);

        System.out.println("Car : " + car.toString());
        System.out.println("CarDto : " + carDto.toString());

        Assert.assertNotNull(carDto);

    }


}
