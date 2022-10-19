package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressbookImpl implements AddressbookService{
    @Override
    public ResponseEntity<List<User>> getAddressBookData() {
        List<User> addressBookList = new ArrayList<>();
        addressBookList.add(new User(101,"Dhananjay","Gadhave","9175696288","Mumbai"));
        addressBookList.add(new User(102,"Jay","Dumbre","9185343298","Pune"));
        return new ResponseEntity<>(addressBookList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> getAddressBookDataById(int personId) {
        User addressBook = new User(personId,"Dhananjay","Gadhave","9175696288","Mumbai");
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> createAddressBookData(UserDTO addressBookDTO) {
        User addressBook = new User(101, addressBookDTO);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> updateAddressBookData(int personId, User addressBookDTO) {
        User addressBook = new User(personId, addressBookDTO);
        return new ResponseEntity<>(addressBook, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteAddressBookData(int personId) {
        return new ResponseEntity<>("Deleted address book data for id : "+personId, HttpStatus.OK);
    }

}
