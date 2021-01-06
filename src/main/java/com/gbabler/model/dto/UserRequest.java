package com.gbabler.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String firstName;
    private String lastName;
    private Integer age;

    public static class UserRequestBuilder {
        private UserRequest userRequest;

        public UserRequestBuilder() {
            this.userRequest = new UserRequest();
        }

        public UserRequestBuilder firstName(String firstName) {
            this.userRequest.firstName = firstName;
            return this;
        }

        public UserRequestBuilder lastName(String lastName) {
            this.userRequest.lastName = lastName;
            return this;
        }

        public UserRequestBuilder age(Integer age) {
            this.userRequest.age = age;
            return this;
        }

        public UserRequest build() {
            return this.userRequest;
        }
    }
}
