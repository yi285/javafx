package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;

public class MenuController {
    
    @FXML
    private ListView <String> lista_elementos;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnEliminar;

    @FXML
    private void crearPrompt () throws IOException{
        try {
            App.setRoot("Crear_page");
        } catch (Exception e) {
            System.err.println("Error al cargar la plantilla");
        }
    }
    
    @FXML
    private void eliminarPrompt (){
    System.out.println("Se ha eliminado");
    }


}
