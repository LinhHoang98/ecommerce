package se.linhhn.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.linhhn.ecommerce.dto.StoreDto;
import se.linhhn.ecommerce.entity.AccountStores;
import se.linhhn.ecommerce.entity.Stores;
import se.linhhn.ecommerce.entity.enums.AccountStoreEnum;
import se.linhhn.ecommerce.repository.AccountRepository;
import se.linhhn.ecommerce.repository.AccountStoreRepository;
import se.linhhn.ecommerce.repository.StoreRepository;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountStoreRepository accountStoreRepository;

    public StoreDto createStore(StoreDto storeDto) {
        Stores store = new Stores();
        store.setName(storeDto.getStoreName());
        store.setImageUrl(storeDto.getImageUrl());
        store.setMall(false);
        store = storeRepository.save(store);

        AccountStores accountStores = new AccountStores();
        accountStores.setStore(store);
        accountStores.setAccount(accountRepository.findById(storeDto.getAdminId()).get());
        accountStores.setRole(AccountStoreEnum.SUPER_ADMIN);
        accountStoreRepository.save(accountStores);

        return storeDto;
    }

//    public StoreDto
}
