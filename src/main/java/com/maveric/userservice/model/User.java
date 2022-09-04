package com.maveric.userservice.model;


import com.maveric.userservice.enumeration.Gender;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;


@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String _id;

    private String firstName;

    private String lastName;
    private String middleName;
    private String phoneNumber;

    private String email;
    private String address;
    private String dateOfBirth;
    private Gender gender;
    private String role;
    private String Password;

}
