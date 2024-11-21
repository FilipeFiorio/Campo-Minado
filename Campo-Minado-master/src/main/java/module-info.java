module br.edu.ifsp.campominado {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.ifsp.campominado.app2 to javafx.fxml;
    opens br.edu.ifsp.campominado.controller to javafx.fxml;
    exports br.edu.ifsp.campominado.app2;
}
