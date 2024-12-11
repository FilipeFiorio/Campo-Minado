module br.edu.ifsp.campominado {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires javafx.graphics;
    requires com.google.gson;

    opens br.edu.ifsp.campominado.app2 to javafx.fxml;
    opens br.edu.ifsp.campominado.controller to javafx.fxml;
    opens br.edu.ifsp.campominado.entidades to com.google.gson;
    exports br.edu.ifsp.campominado.app2;
}
