// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // GLOBAL STOP MOTOR
    public static final int STOP_MOTOR = 0; 

    // GLOBAL INVERT
    public static final int GLOBAL_INVERT = -1; 

    // DRIVE TRAIN MOTORS
    public static final int DRIVETRAIN_TOP_RIGHT_MOTOR = 2;
    public static final int DRIVETRAIN_BOTTOM_RIGHT_MOTOR = 3;
    public static final int DRIVETRAIN_TOP_LEFT_MOTOR = 4;
    public static final int DRIVETRAIN_BOTTOM_LEFT_MOTOR = 5;

    // Xbox Controller 
    public static final int DRIVER_CONTROLLER_PORT = 0;

    // Arcade Drive Commands
    public static final double ARCADE_DRIVE_MULTIPLIER = 0.5; 
    public static final int POW_VALUE = 3; 

    // Timer Based Auto Variables
    public static final double RUN_INITAL_AUTO = 2.0; 

  public static class OperatorConstants {
   // public static final int kDriverControllerPort = 0;

  }
}
