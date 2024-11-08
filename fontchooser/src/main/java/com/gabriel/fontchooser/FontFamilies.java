package com.gabriel.fontchooser;

import java.awt.Font;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FontFamilies implements Iterable<FontFamily> {

    private static final FontFamilies INSTANCE = createFontFamilies();

    private static FontFamilies createFontFamilies() {
        return FontFamiliesFactory.create();
    }

    public static FontFamilies getInstance() {
        return INSTANCE;
    }

    private Map<String, FontFamily> families = new TreeMap<>();

    public void add(Font font) {
        String family = font.getFamily();
        FontFamily fontFamily = families.computeIfAbsent(family, FontFamily::new);
        fontFamily.add(font);
    }

    @Override
    public Iterator<FontFamily> iterator() {
        return families.values().iterator();
    }

    public FontFamily get(String name) {
        return families.get(name);
    }
}
