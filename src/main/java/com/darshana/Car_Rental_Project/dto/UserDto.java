package com.darshana.Car_Rental_Project.dto;

import com.darshana.Car_Rental_Project.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
}
