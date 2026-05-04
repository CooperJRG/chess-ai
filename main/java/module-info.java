module com.example.chessui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires deeplearning4j.core;
    requires nd4j.api;
    requires deeplearning4j.nn;
    requires slf4j.api;
    requires deeplearning4j.vertx;
    requires deeplearning4j.ui.model;

    opens com.example.chessui to javafx.fxml;
    exports com.example.chessui;
}