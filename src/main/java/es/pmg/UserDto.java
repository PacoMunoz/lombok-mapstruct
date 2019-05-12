package es.pmg;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String movilPhone;
}