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
    public void pesosMexicanos(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^[$]([0-9]{1,})([.]?)([0.9]*).*[MXN|mxn]$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void tarjetaDeCredito(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("([0-9]{4})([-| ]?)([0-9]{4})([-| ]?)([0-9]{4})([-| ]?)([0-9]{4})");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void etiquetaHTML(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^<html(.*?)>(.*?)</html>$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void colorHexadecimal(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^[#]([0-9A-Fa-f]{1,8})");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void url(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^(http|https)://(?=.*(\\w\\.){1,}).*[\\w]$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void queryInsert(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^(INSERT INTO|INSERT into|insert INTO|Insert Into|Insert into|insert Into|insert into).*\\w.*(VALUES|values|Values).*([(]{1}).*([)]{1}).*([;]?)$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void ifDeVariable(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^if.*\\(.*\\w.*((==|<|>|>=|<=|!=)+).*\\w.*\\).*([{]{1})$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void fraseConNewline(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("\\w.*(?=\\\\n).*\\w");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void videoDeYouTube(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^(http|https)://.*(?=(www.youtube.com){1}).*([/]*)((watch\\?v\\=){1}).*[\\w]$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void nombreUsuario(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^[a-z0-9_-]{3,16}$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void claveDeProducto(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^[a-z0-9-]+$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void correoElectronico(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void contrasena(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void colorRGB(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("[Rr][Gg][Bb][(](((([\\d]{1,3})[1,]{0,1})[\\s]*){3})[)]");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void relojDe24Horas(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
    public void angulo(ActionEvent event){
        String texto=tfRegex.getText();
        Pattern patron=Pattern.compile("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)");
        Matcher matcher=patron.matcher(texto);
        lbResultado.setText((matcher.matches())?"Sí cumple":"No cumple");
    }
}
