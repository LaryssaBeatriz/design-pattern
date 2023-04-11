package dio.projeto.designpattern.service;

import dio.projeto.designpattern.Model.User;
import org.springframework.stereotype.Repository;


public interface UserInterface {

    public void login(int id, String password );

    public void logout();

    public void editName();

    public void editPassword();

}
