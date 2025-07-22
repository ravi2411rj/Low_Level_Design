package com.lld.Creational.Prototype_Registry.Example2;

import lombok.Getter;

@Getter
public class Configuration implements ClonableObject<Configuration> {
    private final String themeColor;
    private final Boolean autoSave;
    private final String language;
    private final Boolean darkMode;
    private final Integer fontSize;
    private final String fontFamily;
    private final ConfigurationType type;

    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize,
                         String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    @Override
    public Configuration cloneObject() {
        return new Configuration(themeColor, autoSave, language, darkMode, fontSize, fontFamily, type);
    }
}
