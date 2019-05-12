package es.pmg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Car {

    private String marca;
    private int numBastidor;
    private String motor;
    private String matricula;
    private String modelo;

}
