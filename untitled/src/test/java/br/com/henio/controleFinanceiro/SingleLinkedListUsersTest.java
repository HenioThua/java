package br.com.henio.controleFinanceiro;


import org.junit.jupiter.api.Test;

class SingleLinkedListUsersTest {

    @Test
    void emptyUsersDontAuthenticate() {
        SingleLinkedListUsers singleLinkedListUsers = new SingleLinkedListUsers();
        assert singleLinkedListUsers.authenticate("henio", "henio123") == null;
    }
    @Test
    void correctUsersAuthenticate(){
        SingleLinkedListUsers singleLinkedListUsers = new SingleLinkedListUsers(new User("henio","henio123"));
        assert singleLinkedListUsers.authenticate("henio", "henio123") != null;

        }








}