package com.darshana.Car_Rental_Project.dto;

import com.darshana.Car_Rental_Project.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private UserRole userRole;
    private Long userId;
}
