package com.trishawrites;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.Color;

/**
 * A class to work with a color chooser. 
 * It uses a JColorChooser to let the user
 * pick a color and returns the chosen color object.
 *
 */
public class ColorChooser
{

  /**
   * Method to let the user pick a color and return
   * the color object. 
   * @return the picked color or red if no color was picked
   */
  public static Color pickAColor()
  {
    Color color = Color.white;

    // create a JFrame to be the parent of the color chooser open dialog
    // if we don't do this then we may not see the dialog.
    JFrame frame = new JFrame();
    frame.setAlwaysOnTop(true);


    // use the color chooser to pick the color
    color = JColorChooser.showDialog(frame,"Pick a color",color);

    return color;
  }

  /** Main method for testing the ColorChooser */
  public static void main(String[] args)
  {
    Color pickedColor = ColorChooser.pickAColor();
    System.out.println(pickedColor);
  }

}