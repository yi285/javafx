package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class LoginController {
    
    @FXML
    private TextField usuario;
    @FXML
    private PasswordField contrasena;
    @FXML
    private Label text_error_log_in;
    @FXML
    private void validar_log_in() throws IOException {
        String user = usuario.getText();
        String pass = contrasena.getText();

        if (user.equals("admin") && pass.equals("admin")) {
            App.setRoot("Menu");
        } else {
            text_error_log_in.setText("Usuario o contraseña incorrectos");
        }
    }
}
