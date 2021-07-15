package com.example.loginforma.loginservise;

import com.example.loginforma.logindomain.Login;
import com.example.loginforma.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServise {
    @Autowired
    private LoginRepository repo;
    public Login login (String username,String pasword){
        Login user=repo.findByUsernameAndPassword(username,pasword);
        return user;
    }

}
