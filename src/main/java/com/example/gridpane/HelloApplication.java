package com.example.gridpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    //metodo para las dimensiones de los botones
    public void adddimensionesBoton(Button btn, int ancho, int alto) {
        btn.setPrefHeight(alto);
        btn.setPrefWidth(ancho);
    }

    //metodo para la maxima dimension de los botones
    public void addMaxDimensionBoton(Button btn) {
        btn.setMaxWidth(Double.MAX_VALUE);
        btn.setMaxHeight(Double.MAX_VALUE);
    }

    @Override
    public void start(Stage stage) throws IOException {

        //botones numericos
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        //botones operaciones
        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnMulti = new Button("X");
        Button btnDivision = new Button("/");

        Button btnIgual = new Button("=");
        Button btnBorrar = new Button("C");

        //operaciones
        TextField textoOperaciones = new TextField();

        GridPane gridPane = new GridPane(); //creación del gridpane

        //alineado al centro
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);


        //fila 0
        GridPane.setConstraints(textoOperaciones, 0, 0, 4, 1);

        //fila 1
        GridPane.setConstraints(btn7, 0, 1);
        GridPane.setConstraints(btn8, 1, 1);
        GridPane.setConstraints(btn9, 2, 1);
        GridPane.setConstraints(btnSuma, 3, 1);

        //fila 2
        GridPane.setConstraints(btn6, 0, 2);
        GridPane.setConstraints(btn5, 1, 2);
        GridPane.setConstraints(btn4, 2, 2);
        GridPane.setConstraints(btnResta, 3, 2);

        //fila 3
        GridPane.setConstraints(btn3, 0, 3);
        GridPane.setConstraints(btn2, 1, 3);
        GridPane.setConstraints(btn1, 2, 3);
        GridPane.setConstraints(btnMulti, 3, 3);

        //fila 4
        GridPane.setConstraints(btnBorrar, 0, 4);
        GridPane.setConstraints(btn0, 1, 4);
        GridPane.setConstraints(btnIgual, 2, 4);
        GridPane.setConstraints(btnDivision, 3, 4);


        //dimensiones botones
        textoOperaciones.setPrefHeight(35);

        adddimensionesBoton(btn0, 55, 35);
        adddimensionesBoton(btn1, 55, 35);
        adddimensionesBoton(btn2, 55, 35);
        adddimensionesBoton(btn3, 55, 35);
        adddimensionesBoton(btn4, 55, 35);
        adddimensionesBoton(btn5, 55, 35);
        adddimensionesBoton(btn6, 55, 35);
        adddimensionesBoton(btn7, 55, 35);
        adddimensionesBoton(btn8, 55, 35);
        adddimensionesBoton(btn9, 55, 35);
        adddimensionesBoton(btnMulti, 55, 35);
        adddimensionesBoton(btnSuma, 55, 35);
        adddimensionesBoton(btnResta, 55, 35);
        adddimensionesBoton(btnDivision, 55, 35);
        adddimensionesBoton(btnBorrar, 55, 35);
        adddimensionesBoton(btnIgual, 55, 35);

        //maximas dimensiones botones
        addMaxDimensionBoton(btn0);
        addMaxDimensionBoton(btn1);
        addMaxDimensionBoton(btn2);
        addMaxDimensionBoton(btn3);
        addMaxDimensionBoton(btn4);
        addMaxDimensionBoton(btn5);
        addMaxDimensionBoton(btn6);
        addMaxDimensionBoton(btn7);
        addMaxDimensionBoton(btn8);
        addMaxDimensionBoton(btn9);
        addMaxDimensionBoton(btnSuma);
        addMaxDimensionBoton(btnResta);
        addMaxDimensionBoton(btnDivision);
        addMaxDimensionBoton(btnMulti);
        addMaxDimensionBoton(btnBorrar);
        addMaxDimensionBoton(btnIgual);


        /*esto es para añadir los botones al gridpane*/
        gridPane.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6,
                btn7, btn8, btn9, btnSuma, btnResta, btnMulti, btnDivision, textoOperaciones, btnIgual, btnBorrar);


        /*esto es para que sea redimensionable en vertical y horizontal*/
        GridPane.setVgrow(textoOperaciones ,Priority.ALWAYS);//con la prioridad always se hace siempre que se expanda la ventana
        GridPane.setVgrow(btn7 ,Priority.ALWAYS);
        GridPane.setVgrow(btn4 ,Priority.ALWAYS);
        GridPane.setVgrow(btn1 ,Priority.ALWAYS);
        GridPane.setVgrow(btnBorrar ,Priority.ALWAYS);

        GridPane.setHgrow(btn7 ,Priority.ALWAYS);
        GridPane.setHgrow(btn8 ,Priority.ALWAYS);
        GridPane.setHgrow(btn9 ,Priority.ALWAYS);
        GridPane.setHgrow(btnSuma ,Priority.ALWAYS);

        //utilizo stackPane para un poco de margen
        StackPane.setMargin(gridPane, new Insets(10));
        StackPane root = new StackPane(gridPane);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Calculadora GridPane");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}