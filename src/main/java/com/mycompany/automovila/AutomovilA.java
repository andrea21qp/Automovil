/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovila;

import com.mycompany.automovila.Enum.TipoAutomovil;
import com.mycompany.automovila.Enum.TipoColor;
import com.mycompany.automovila.Enum.TipoCombustible;
import com.mycompany.automovila.clase.Automovil;

/**
 *
 * @author DELL
 */
public class AutomovilA {

    public static void main(String[] args) {
        Automovil auto = new Automovil("Mazda", 2021, "3", TipoCombustible.BIODESEL, TipoAutomovil.COMPACTO, 4, 5, 20, TipoColor.ROJO, 40);
       auto.setVelocidadActual(100);
        auto.mostrarAtributos();
        auto.tiempoEstimado();
        auto.acelerar(20);

        auto.desacelerar(50);

    }
}
