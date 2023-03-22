package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button six;

    @FXML
    private TextArea textarea;

    @FXML
    private Button three;

    @FXML
    private Button two;
    @FXML
    private TextArea txt1;
    @FXML
    private TextArea txt2;
    @FXML
    private TextArea txt3;
    @FXML
    private Button zero;

    @FXML
    private Button div;
    @FXML
    private Button mul;

    @FXML
    private Button pt;
    @FXML
    private Button equal;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;


    boolean b=false;

    String st1="";
    StringBuilder b1=new StringBuilder(st1);
    String st2="";
    StringBuilder b2=new StringBuilder(st2);
    String st3="";
    boolean gg=false;
    StringBuilder b3=new StringBuilder(st3);
    String st4="";
    StringBuilder b4=new StringBuilder(st3);
    @FXML
    void calculat(String x) {
        double num1;
        double y;
        double r;
        String rr = String.valueOf(b1);
        String op;

        if (b1==null || b1.length()==0 && (b2==null || b2.length()==0)) {
            b4.append(x);
            textarea.appendText(x);
        }
        else if (gg){
             textarea.appendText(x);
             gg=false;
         }


        else if (b2==null ||b2.length()==0){

            b3.append(x);
            textarea.appendText(x);

        } else if (b2.equals("=") ||b2.length()==1) {
            num1= Double.parseDouble(String.valueOf(b4));
            y= Double.parseDouble(String.valueOf((b3)));
            op= String.valueOf(b1);
            switch (op){
                case "+":{
                     r=num1+y;
                      clear();
                    textarea.setText(String.valueOf(num1+op+y+"= "+r));
                    b=true;
                    break;
                }
                case "-":{
                    r=num1-y;
                    clear();
                    textarea.setText(String.valueOf(num1+op+y+"= "+r));
                    b=true;
                    break;
                }
                case "*":
                   {
                    r=num1*y;
                    clear();
                    textarea.setText(String.valueOf(num1+op+y+"= "+r));
                       b=true;
                    break;
                }
                case "/": {
                    r=num1/y;
                    clear();
                    textarea.setText(String.valueOf(num1+op+y+"= "+r));
                    b=true;
                    break;
                }
                default:textarea.setText("please select the correct oprator");
                break;


            }
        }
    }
private  void clear(){
    textarea.clear();
    b4.replace(0,b4.length(),"");
    b3.replace(0,b3.length(),"");
    b1.replace(0,b1.length(),"");
    b2.replace(0,b2.length(),"");

}
    @FXML
    void divide(ActionEvent event) {
        gg=true;
        b1.append(div.getText());
     calculat(div.getText());


    }
    @FXML
    void multiply(ActionEvent event) {
        b1.append(mul.getText());
        gg=true;
        calculat(mul.getText());

    }
    @FXML
    void pt(ActionEvent event) {
   calculat(pt.getText());
    }
    @FXML
    void zero(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
  calculat(zero.getText());
    }
    @FXML
public  void five(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( five.getText());
      }


    @FXML
    public  void four(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( four.getText());


    }
    @FXML
    void equal(ActionEvent event) {
       b2.append(equal.getText());
        calculat(equal.getText());
        b2.replace(0,1,"");


    }
    @FXML
    void one(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( one.getText());
    }

    @FXML
    void six(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( six.getText());
    }

    @FXML
    void subtruct(ActionEvent event) {
        b1.append(minus.getText());
        gg=true;
        calculat(minus.getText());


    }
    @FXML
    void add(ActionEvent event) {
        b1.append(plus.getText());
        gg=true;
        calculat(plus.getText());

    }

    @FXML
    void three(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( three.getText());
    }

    @FXML
    void two(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( two.getText());
    }
    @FXML
    void eight(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( eight.getText());
    }
    @FXML
    void nine(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( nine.getText());
    }
    @FXML
    void seven(ActionEvent event) {
        if (b){
            clear();
            b=false;
        }
        calculat( seven.getText());
    }
}
