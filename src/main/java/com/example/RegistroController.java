package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController {

    @FXML
    private TextField usuario_registro;

    @FXML
    private PasswordField contraseña_registro;

    @FXML
    private PasswordField contraseña_repetir;

    @FXML
    private Button aceptar_registro;

    @FXML
    private Label text_error_registro;

    @FXML
    private void validar_registro() throws IOException {
        String usuario = usuario_registro.getText();
        String pass = contraseña_registro.getText();
        String pass_rep = contraseña_repetir.getText();

        if (usuario.isEmpty() || pass.isEmpty()|| pass_rep.isEmpty() ){
            text_error_registro.setText("Campos vacios");
        } else if (!pass.equals(pass_rep)){
            text_error_registro.setText("Las contraseñas no coinciden");
        } else {
            App.setRoot("Menu");
            
        }


    }
}