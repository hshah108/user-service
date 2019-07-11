package com.techotip.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Document(collection = "users")
public class User {

    @Id
    Integer userId;
    String firstName;
    String lastName;

}
