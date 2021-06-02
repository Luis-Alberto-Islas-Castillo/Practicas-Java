/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewSuma;
import models.ModelSuma;

public class ControllerSuma {
    ViewSuma view_suma;
    ModelSuma model_suma;
    
public ControllerSuma(ViewSuma view_suma, ModelSuma model_Suma){
    this.view_suma= view_suma;
    this.model_suma= model_Suma;
    initView();
}

public void initView() {
    view_suma.jTextField_numero1.setText(String.valueOf(model_suma.getNumero1()));
    view_suma.jTextField_numero2.setText(String.valueOf(model_suma.getNumero2()));
    view_suma.jTextField_resultado.setText(String.valueOf(model_suma.getResultado()));
    view_suma.jButton_suma.addActionListener(e -> jButton_suma_click());
    view_suma.jButton_resta.addActionListener(e -> jButton_resta_click());
    view_suma.jButton_multiplicacion.addActionListener(e -> jButton_multiplicacion_click());
    view_suma.jButton_divicion.addActionListener(e -> jButton_divicion_click());
    view_suma.setVisible(true);
  }

public void jButton_suma_click(){
    model_suma.setNumero1(Double.parseDouble(view_suma.jTextField_numero1.getText()));
    model_suma.setNumero2(Double.parseDouble(view_suma.jTextField_numero2.getText()));
    model_suma.suma();
    view_suma.jTextField_resultado.setText(String.valueOf(model_suma.getResultado()));
  }

public void jButton_resta_click(){
     model_suma.setNumero1(Double.parseDouble(view_suma.jTextField_numero1.getText()));
     model_suma.setNumero2(Double.parseDouble(view_suma.jTextField_numero2.getText()));
     model_suma.resta();
     view_suma.jTextField_resultado.setText(String.valueOf(model_suma.getResultado()));
}

public void jButton_multiplicacion_click(){
     model_suma.setNumero1(Double.parseDouble(view_suma.jTextField_numero1.getText()));
     model_suma.setNumero2(Double.parseDouble(view_suma.jTextField_numero2.getText()));
     model_suma.multiplicacion();
     view_suma.jTextField_resultado.setText(String.valueOf(model_suma.getResultado()));
}

public void jButton_divicion_click(){
     model_suma.setNumero1(Double.parseDouble(view_suma.jTextField_numero1.getText()));
     model_suma.setNumero2(Double.parseDouble(view_suma.jTextField_numero2.getText()));
     model_suma.divicion();
     view_suma.jTextField_resultado.setText(String.valueOf(model_suma.getResultado()));
}
}
