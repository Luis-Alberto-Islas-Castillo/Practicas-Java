/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;

public class Main {

    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;
    
    private static ViewSuma viewSuma;
    private static ModelSuma modelSuma;
    private static ControllerSuma controllerSuma;
    
    public static void main(String[] args) {
       viewMessage = new ViewMessage();
       modelMessage = new ModelMessage();
       controllerMessage = new ControllerMessage(viewMessage, modelMessage);
       
       viewSuma = new ViewSuma();
       modelSuma = new ModelSuma();
       controllerSuma = new ControllerSuma(viewSuma, modelSuma);
       
       viewMain = new ViewMain();
       modelMain = new ModelMain();
       controllerMain = new ControllerMain(viewMain,viewMessage,viewSuma,  modelMain);
       
    }
}
