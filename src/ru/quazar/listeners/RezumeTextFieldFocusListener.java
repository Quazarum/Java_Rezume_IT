package ru.quazar.listeners;

import java.awt.event.FocusEvent;
import ru.quazar.gui.MyJTextField;
import ru.quazar.gui.Rezume_IT;
import java.awt.Color;
import java.awt.event.FocusListener;

class RezumeTextFieldFocusListener implements FocusListener {

    private final MyJTextField field;

    public RezumeTextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(Rezume_IT.INPUT_TEXT_1);
            field.setForeground(Color.GRAY);
        }
    }

    @Override
    public String toString() {
        return "RezumeTextFieldFocusListener{" +
                "field=" + field +
                '}';
    }
}
