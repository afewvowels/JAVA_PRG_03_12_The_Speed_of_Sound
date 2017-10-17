/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_12_the_speed_of_sound;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * The following table shows the approximate speed of sound in air, water, and
 * steel:
 * 
 *      Medium          Speed
 *      Air             1,100 feet per second
 *      Water           4,900 feet per second
 *      Steel           16,400 feet per second
 * 
 * Write a program that asks the user to enter "air", "water", or "steel", and
 * the distance that a sound wave will travel in the medium. The program should
 * then display the amount of time it will take. You can calculate the amount
 * of time it takes sound to travel in air with the following formula:
 * 
 *      Time = Distance / 1,100
 * 
 * You can calculate the amount of time it takes sound to travel in water with
 * the following formula:
 * 
 *      Time = Distance / 4,900
 * 
 * You can calculate the amount of time it takes sound to travel in steel with
 * the following formula:
 * 
 *      Time = Distance / 16,400
 */
public class JAVA_PRG_03_12_The_Speed_of_Sound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare string to hold directly hold user inputs
        String strDistance;
        String strMedium;
        String strMediumLowerCase;
        String strFormattedOutput;
        
        // Declare constants for rate of speed in different mediums
        final float FLT_RATE_AIR = 1100.0f;
        final float FLT_RATE_WATER = 4900.0f;
        final float FLT_RATE_STEEL = 16400.0f;
        
        // Declare floats to hold converted user input of distance
        // and calculated time
        float fltDistance;
        float fltTime;
        
        // Get user inputs
        strDistance = JOptionPane.showInputDialog("Please enter the distance" +
                "\nyour sound wave will travel.");
        strMedium = JOptionPane.showInputDialog("Please enter what medium"
                + " your sound wave\nwill travel through (air, water, or steel.)");
        
        // Conver user input the float and all lower-case string for switch
        // statement
        fltDistance = Float.parseFloat(strDistance);
        strMediumLowerCase = strMedium.toLowerCase();
        
        // Take formatted input string type and use a switch statement
        // to determine which constant to use in calculating fltTime
        switch(strMediumLowerCase)
        {
            case "air":
                fltTime = fltDistance / FLT_RATE_AIR;
                break;
            case "water":
                fltTime = fltDistance / FLT_RATE_WATER;
                break;
            case "steel":
                fltTime = fltDistance / FLT_RATE_STEEL;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please enter only"
                        + " air, water, or steel.");
                fltTime = 0.0f; // To silence any errors
                System.exit(0); // Terminate early and don't show output message
                break;
        }
        
        // Format result for output to message dialog
        strFormattedOutput = String.format("It will take %.2f seconds for\n" +
                "your sound wave to travel through " + strMediumLowerCase + ".",
                fltTime);
        JOptionPane.showMessageDialog(null, strFormattedOutput);
        
        // For JOptionPane
        System.exit(0);
    }
    
}
