module org.example.tubesbisayuk {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.example.tubesbisayuk to javafx.fxml;
    exports org.example.tubesbisayuk;
    exports org.example.tubesbisayuk.admin;
    opens org.example.tubesbisayuk.admin to javafx.fxml;
    exports org.example.tubesbisayuk.user;
    opens org.example.tubesbisayuk.user to javafx.fxml;
}