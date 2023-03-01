package com.switchfully.cucumber.state;

import org.springframework.stereotype.Component;

@Component
public class LogIn {

    private Register register;

    public void setRegister(Register register) {
        this.register = register;
    }

    public Register getRegister() {
        return register;
    }
}
