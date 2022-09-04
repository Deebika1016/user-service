package com.maveric.userservice.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maveric.userservice.enumeration.Gender;
import lombok.*;
import javax.validation.constraints.*;
@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor

public class UserResponse {

    private String _id;
    @NotBlank(message = "First name should not be blanck")
    @Size(min=2)
    private String firstName;
    @NotBlank(message="Last name should not be blanck")
    @Size(min=2)
    private String lastName;
    @Size(min = 0)
    private String middleName;
    @Pattern(regexp = "(0/91)?[7-9][0-9]{9}",message = "Please enter valid number")
    @NotBlank
    private String phoneNumber;
    @Email(message = "email should be valid")
    @NotBlank(message = "email is mandatory")
    private String email;
    @NotBlank(message="Address is mandatory")
    private String address;
    private String dateOfBirth;
    private Gender gender;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String role;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String Password;
}

