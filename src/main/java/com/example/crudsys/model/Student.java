package com.example.crudsys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
             @Id
             @GeneratedValue(strategy = GenerationType.IDENTITY)


             private  Long id;
             @NotBlank
             private String name;

             @jakarta.persistence.Column(unique = true)
             @Email (message = "Invalid email format ")
             private String email;
             @NotBlank
             private String password;


}
