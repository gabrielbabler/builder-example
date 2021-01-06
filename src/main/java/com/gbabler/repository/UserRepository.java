package com.gbabler.repository;

import com.gbabler.model.entity.UserDomain;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public UserDomain save(UserDomain domain) {
        return domain;
    }

}
