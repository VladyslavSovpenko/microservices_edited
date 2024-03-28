package com.eazybytes.accounts.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.eazybytes.accounts.entities.Customer}
 */
public record CustomerDto(String name, String email, String mobileNumber) implements Serializable {
}