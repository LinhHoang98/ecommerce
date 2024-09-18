package se.linhhn.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.linhhn.ecommerce.dto.AccountDto;
import se.linhhn.ecommerce.dto.RegistrationDto;
import se.linhhn.ecommerce.entity.Accounts;
import se.linhhn.ecommerce.entity.enums.AccountRoleEnum;
import se.linhhn.ecommerce.mapper.AccountMapper;
import se.linhhn.ecommerce.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountMapper accountMapper;

    public AccountDto createAccount(RegistrationDto registrationDto) {
        Accounts accounts = new Accounts();
        accounts.setUsername(registrationDto.getUsername());
        accounts.setPassword(registrationDto.getPassword());
        accounts.setRole(AccountRoleEnum.USER);
        accounts = accountRepository.save(accounts);

        return accountMapper.toDto(accounts);
    }
}
