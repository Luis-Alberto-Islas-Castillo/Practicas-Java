/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.ModelMayor;
import views.ViewMayor;
import controllers.ControllerMayor;

public class Main {
    
    public static void main (String mvc[]){
    ModelMayor model_mayor = new ModelMayor();
    ViewMayor view_mayor = new ViewMayor();
    ControllerMayor controller_mayor = new ControllerMayor(model_mayor,view_mayor);
    }
}
