package com.darshana.Car_Rental_Project.services.auth;

import com.darshana.Car_Rental_Project.dto.SignupRequest;
import com.darshana.Car_Rental_Project.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
