package br.com.henio.controleFinanceiro;

public class User {
    private String passWord;
    private String name;
    public User (String name, String passWord){
        this.name = name;
        this.passWord = passWord;
    }

    public int getBalance() {
        return 0;
    }
}
