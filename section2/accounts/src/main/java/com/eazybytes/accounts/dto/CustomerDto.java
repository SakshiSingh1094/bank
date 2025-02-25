package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message="Name cannot be null or empty")
    @Size(min=5, max=30, message="length of customer name should be 5 to 30")
    private String name;

    @NotEmpty(message="Email cannot be null or empty")
    private String email;

    private String mobileNumber;

    private AccountsDto accountsDto;
}
