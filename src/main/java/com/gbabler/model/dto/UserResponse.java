package com.gbabler.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String name;
    private Integer age;

    public static class UserResponseBuilder {
        private UserResponse userResponse;

        public UserResponseBuilder() {
            this.userResponse = new UserResponse();
        }

        public UserResponseBuilder name(String name) {
            this.userResponse.name = name;
            return this;
        }

        public UserResponseBuilder age(Integer age) {
            this.userResponse.age = age;
            return this;
        }

        public UserResponse build() {
            return this.userResponse;
        }
    }
}
