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
    private Label text_error;
    @FXML
    private void validar_log_in() throws IOException {
        String user = usuario.getText();
        String pass = contrasena.getText();

        if (user.equals("admin") && pass.equals("admin")) {
            App.setRoot("Registro");
        } else {
            text_error.setText("Usuario o contraseña incorrectos");
        }
    }
}
