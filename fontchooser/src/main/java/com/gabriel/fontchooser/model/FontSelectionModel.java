package com.gabriel.fontchooser.model;

import javax.swing.event.ChangeListener;
import java.awt.Font;

/**
 * A model that supports selecting a {@code Font}.
 *
 * @author Christos Bohoris
 * @see Font
 */
public interface FontSelectionModel {

    /**
     * Returns the selected {@code Font} which should be
     * non-{@code null}.
     *
     * @return the selected {@code Font}
     * @see #setSelectedFont
     */
    Font getSelectedFont();

    /**
     * Returns the name of the selected font
     *
     * @return the name of the selected font
     */
    String getSelectedFontName();

    /**
     * Returns the family name of the selected font
     *
     * @return the name of the selected font's family
     */
    String getSelectedFontFamily();

    /**
     * Returns the size of the selected font
     *
     * @return the size of the selected font
     */
    int getSelectedFontSize();

    /**
     * Sets the selected font to {@code font}.
     * Note that setting the font to {@code null}
     * is undefined and may have unpredictable results.
     * This method fires a state changed event if it sets the
     * current font to a new non-{@code null} font.
     *
     * @param font the new {@code Font}
     * @see #getSelectedFont
     * @see #addChangeListener
     */
    void setSelectedFont(Font font);

    /**
     * Adds {@code listener} as a listener to changes in the model.
     *
     * @param listener the {@code ChangeListener} to be added
     */
    void addChangeListener(ChangeListener listener);

    /**
     * Removes {@code listener} as a listener to changes in the model.
     *
     * @param listener the {@code ChangeListener} to be removed
     */
    void removeChangeListener(ChangeListener listener);

}
