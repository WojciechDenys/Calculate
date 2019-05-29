package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button division;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button multiple;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    private Button plus;

    @FXML
    private Button AC;

    @FXML
    private TextField displayresult;

    @FXML
    double result = 0;
    double input1;
    double input2;
    int c;
    int point=0;

    @FXML
    void Calculation(ActionEvent event) {
        if (event.getSource() == one) {
            displayresult.appendText("1");
        } else if (event.getSource() == two) {
            displayresult.appendText("2");
        } else if (event.getSource() == three) {
            displayresult.appendText("3");
        } else if (event.getSource() == four) {
            displayresult.appendText("4");
        } else if (event.getSource() == five) {
            displayresult.appendText("5");
        } else if (event.getSource() == six) {
            displayresult.appendText("6");
        } else if (event.getSource() == seven) {
            displayresult.appendText("7");
        } else if (event.getSource() == eight) {
            displayresult.appendText("8");
        } else if (event.getSource() == nine) {
            displayresult.appendText("9");
        } else if (event.getSource() == zero) {
            displayresult.appendText("0");
        } else if (event.getSource() == AC) {

            displayresult.setText("");
            point = 0;
            input1 = 0;
            input2 = 0;
            c = 0;


        } else if (event.getSource() == plus) {

            input1 = Double.parseDouble(displayresult.getText());

            displayresult.setText("");
            c = 1;


        } else if (event.getSource() == minus) {

            input1 = Double.parseDouble(displayresult.getText());

            displayresult.setText("");
            c = 2;


        } else if (event.getSource() == multiple) {

            input1 = Double.parseDouble(displayresult.getText());

            displayresult.setText("");
            c = 3;


        } else if (event.getSource() == division) {

            input1 = Double.parseDouble(displayresult.getText());

            displayresult.setText("");
            c = 4;


        }
        else if(event.getSource() == dot && point == 0){

            displayresult.appendText(".");
            point = 1;




        }else if (event.getSource() == equal && c > 0) {

            input2 = Double.parseDouble(displayresult.getText());


            switch (c) {

                case 1:
                    result = input1 + input2;
                    displayresult.setText(String.valueOf((result)));
                    break;

                case 2:
                    result = input1 - input2;
                    displayresult.setText(String.valueOf((result)));
                    break;

                case 3:
                    result = input1 * input2;
                    displayresult.setText(String.valueOf((result)));
                    break;

                case 4:
                    result = input1 / input2;
                    displayresult.setText(String.valueOf((result)));
                    break;

            }

            c = 0;

        }


    }
}






