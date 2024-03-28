package com.eazybytes.accounts.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.eazybytes.accounts.entities.Accounts}
 */
public record AccountsDto(Long accountNumber, String accountType, String branchAddress) implements Serializable {
}