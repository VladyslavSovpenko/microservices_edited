package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entities.Accounts;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface AccountsMapper {
    Accounts toEntity(AccountsDto accountsDto);
    AccountsDto toDto(Accounts accounts);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Accounts partialUpdate(AccountsDto accountsDto, @MappingTarget Accounts accounts);
}
