package com.saitech.java8features.stream.optional;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;
}
