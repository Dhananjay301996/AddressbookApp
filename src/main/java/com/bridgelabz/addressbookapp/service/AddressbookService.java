package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AddressbookService {
    ResponseEntity<List<User>> getAddressBookData();

    ResponseEntity<User> getAddressBookDataById(int personId);

    ResponseEntity<User> createAddressBookData(UserDTO addressBookDTO);

    ResponseEntity<User> updateAddressBookData(int personId, User addressBookDTO);

    ResponseEntity<String> deleteAddressBookData(int personId);
}
