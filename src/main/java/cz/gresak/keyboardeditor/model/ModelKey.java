package cz.gresak.keyboardeditor.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelKey {
    private String keycode;
    private Map<Integer, List<String>> values;
    private String type;
    private double marginLeft;
    private double width = 1;
    private double height = 1;

    public String getKeycode() {
        return keycode;
    }

    public ModelKey setKeycode(String keycode) {
        this.keycode = keycode;
        return this;
    }

    public Map<Integer, List<String>> getValues() {
        return values;
    }

    public ModelKey setValues(Map<Integer, List<String>> values) {
        this.values = values;
        return this;
    }

    public List<String> getGroup(int group) {
        if (values == null) {
            values = new HashMap<>();
        }
        if (!values.containsKey(group)) {
            values.put(group, new ArrayList<>());
        }
        return values.get(group);
    }

    public String getType() {
        return type;
    }

    public ModelKey setType(String type) {
        this.type = type;
        return this;
    }

    public double getMarginLeft() {
        return marginLeft;
    }

    public ModelKey setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public ModelKey setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public ModelKey setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        return "ModelKey{" + "keycode='" + keycode + '\'' +
                ", values=" + values +
                '}';
    }
}