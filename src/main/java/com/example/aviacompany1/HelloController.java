package com.example.aviacompany1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exit;

    @FXML
    private Button login;

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    void initialize() {

        login.setOnAction(event -> {
            String loginText = username.getText().trim(); //trim - для удаления пробелов
            String loginPassword = password.getText().trim();

            if(!loginText.equals("")&& !loginPassword.equals("")){
                loginUser(loginText, loginPassword);
            } else{
                System.out.println("Login and Password is empty");
            }
        });
    }

    private void loginUser(String loginText, String loginPassword) {

    }

}
