package com.rhallal.student;

public record StudentRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
