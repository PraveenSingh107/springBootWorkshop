package com.example.workshop.com.example.workshop.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Trip {
    @Setter
    private String confirmationNumber;
    @Setter
    private String customerId;
    @Setter
    private String firstName;
    @Setter
    private String lastName;
    @Setter
    private String originCode;
    @Setter
    private String destinationCode;
}
