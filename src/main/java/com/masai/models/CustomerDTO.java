package com.masai.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
	
	@NotNull
	@Pattern(regexp = "[6789][0-9]{9}", message = "Enter valid mobile number")
	private String mobileId;
	
	@NotNull(message = "Please enter the password")
	private String password;
	
	@Email
	private String emailId;
	
}
