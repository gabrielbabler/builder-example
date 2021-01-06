package com.gbabler.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain {

    private String name;
    private String lastName;
    private Integer age;

    public static class UserDomainBuilder {
        private UserDomain userDomain;

        public UserDomainBuilder() {
            this.userDomain = new UserDomain();
        }

        public UserDomainBuilder name(String name) {
            this.userDomain.name = name;
            return this;
        }

        public UserDomainBuilder lastName(String lastName) {
            this.userDomain.lastName = lastName;
            return this;
        }

        public UserDomainBuilder age(Integer age) {
            this.userDomain.age = age;
            return this;
        }

        public UserDomain build() {
            return this.userDomain;
        }
    }
}
