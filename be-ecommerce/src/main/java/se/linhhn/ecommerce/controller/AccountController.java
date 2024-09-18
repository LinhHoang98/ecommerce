package se.linhhn.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.linhhn.ecommerce.dto.AccountDto;
import se.linhhn.ecommerce.dto.RegistrationDto;
import se.linhhn.ecommerce.service.AccountService;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody RegistrationDto registrationDto) {
        return new ResponseEntity<>(accountService.createAccount(registrationDto), HttpStatus.CREATED);
    }
}
