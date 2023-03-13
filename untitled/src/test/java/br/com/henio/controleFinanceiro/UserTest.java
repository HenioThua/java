package br.com.henio.controleFinanceiro;

import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void newuserhasemptybalance(){
        User newuser = new User ("henio","henio123");
        assert newuser.getBalance() == 0;
    }


}