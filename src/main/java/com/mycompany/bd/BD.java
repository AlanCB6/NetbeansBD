package com.mycompany.bd;

import Dao.MarcaDao;
import Pantalla.ForMarca;
import Pantalla.ForPuesto;
import Pantalla.Formularios;
import java.util.List;

public class BD {

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        Formularios fPrincipal = new Formularios();
        ForPuesto fPuesto = new ForPuesto();
        ForMarca fMarca = new ForMarca();

        fPrincipal.setLocation(50, 100);
        fPuesto.setLocation(500, 100);
        fMarca.setLocation(950, 100);
        fPrincipal.setVisible(true);
        fPuesto.setVisible(true);
        fMarca.setVisible(true);
    });
}
}