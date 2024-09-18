package se.linhhn.ecommerce.mapper;

import org.springframework.stereotype.Component;
import se.linhhn.ecommerce.dto.AccountDto;
import se.linhhn.ecommerce.entity.Accounts;

@Component
public class AccountMapper {

    public AccountDto toDto(Accounts accounts) {
        AccountDto accountDto = new AccountDto();
        accountDto.setId(accounts.getId());
        accountDto.setUsername(accounts.getUsername());
        accountDto.setPassword(accounts.getPassword());
        return accountDto;
    }
}
