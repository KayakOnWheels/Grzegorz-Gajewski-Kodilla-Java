package com.kodilla.good.patterns.challenges.productOrderService.users;

public class BusinessUser extends User {
    private String nip;


    public BusinessUser(String username, String firstName, String lastName, String email, String phoneNumber, String id, String nip) {
        super(username, firstName, lastName, email, phoneNumber, id);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }
}