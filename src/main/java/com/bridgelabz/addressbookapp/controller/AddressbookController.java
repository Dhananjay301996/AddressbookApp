package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.entity.User;
import com.bridgelabz.addressbookapp.service.AddressbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressbookService addressBookService;
    @GetMapping(value = {"", "/", "/get"})
    public ResponseEntity<List<User>> getAddressBookData() {
        return addressBookService.getAddressBookData();
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<User> getAddressBookData(@PathVariable("personId") int personId) {
        return addressBookService.getAddressBookDataById(personId);
    }

    @PostMapping("/create")
    public ResponseEntity<User> addAddressBookData(@RequestBody UserDTO addressBookDTO) {
        return addressBookService.createAddressBookData(addressBookDTO);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<User> updateAddressBookData(@PathVariable("personId") int personId,
                                                             @RequestBody UserDTO addressBookDTO) {
        return addressBookService.updateAddressBookData(personId,addressBookDTO);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("personId") int personId) {
        return addressBookService.deleteAddressBookData(personId);
    }
}
