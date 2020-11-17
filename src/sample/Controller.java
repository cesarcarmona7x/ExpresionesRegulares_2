package sample;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    @FXML Label lbResultado;
    @FXML TextField tfRegex;
    public void comienzaEn_db(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("(?!db).*");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void terminaEn_count(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile(".*[count]$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void dosNombres(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("([\\w]+\\s?\\b){2}");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void macAddress(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("(([0-9a-fA-F]{2})[-]([0-9a-fA-F]{2})[-]([0-9a-fA-F]{2})[-]([0-9a-fA-F]{2})[-]([0-9a-fA-F]{2})[-]([0-9a-fA-F]{2}))|" +
                "(([0-9a-fA-F]{2})[:]([0-9a-fA-F]{2})[:]([0-9a-fA-F]{2})[:]([0-9a-fA-F]{2})[:]([0-9a-fA-F]{2})[:]([0-9a-fA-F]{2}))|" +
                "(([0-9a-fA-F]{4})[.]([0-9a-fA-F]{4})[.]([0-9a-fA-F]{4}))");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void esPalabrA(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("[A-Z].*.*[A-Z]$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void binario8Digitos(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("([0-1]{8})");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void hexadecimal0x(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^(0x)([0-9A-Fa-f]+)");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void operacion1Digito(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("([0-9]+)([+\\-*/%]+)([0-9]+)");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void numeroControl(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("([0-9]{2})(CG)([0-9]{4})");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void curp(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("([A-Z]{4})([0-9]{6})([M|H])[A-Z][A-Z&&[^AEIOU]]([A-Z&&[^AEIOU]]{3})[A-Z1-9][0-9]");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
}
