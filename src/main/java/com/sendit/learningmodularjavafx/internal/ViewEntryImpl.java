package com.sendit.learningmodularjavafx.internal;


import com.sendit.learningmodularjavafx.api.ViewEntry;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public final class ViewEntryImpl implements ViewEntry {

    @Override
    public Parent load() {
        try {
            var loader = new FXMLLoader(getClass()
                            .getResource("/com/sendit/learningmodularjavafx/hello-view.fxml"));
            return loader.load();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}