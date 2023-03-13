package br.com.henio.controleFinanceiro;

public class SingleLinkedListUsers implements Users{
    private SingleLinkedList<User> users;
    public SingleLinkedListUsers(User user){
        this.users = new SingleLinkedList(user);
    }
    public SingleLinkedListUsers(){
        this.users = new SingleLinkedList();
    }
    @Override
    public User authenticate(String userName, String passWord) {
        return this.users.find();
    }
}
