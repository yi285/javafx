package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Crear_pageController {
    
    @FXML
    private ComboBox <String> categoriaPrompt;

    @FXML
    private TextField nombrePrompt;

    @FXML
    private TextArea descripcionPrompt;

    
    @FXML
    private void guardarPrompt(){
        System.out.println("Se ha guardado");
    }
    
    @FXML
    private void cancelarPrompt(){
        System.out.println("Se ha cancelado");
    }

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnAceptar;

    


}
