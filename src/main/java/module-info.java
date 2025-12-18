module learning.javafx.view {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.sendit.learningmodularjavafx.api;
    exports com.sendit.learningmodularjavafx.internal;

    opens com.sendit.learningmodularjavafx.internal to javafx.fxml;

    provides com.sendit.learningmodularjavafx.api.ViewEntry
            with com.sendit.learningmodularjavafx.internal.ViewEntryImpl;
}
