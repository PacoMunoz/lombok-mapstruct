package es.pmg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CarDto {

    private String marca;
    private String modelo;
    private String modeloMotor;
    private int bastidor;
    private String matricula;

}
