// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Autonomous.TimedBasedAuto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants;

import edu.wpi.first.wpilibj.Timer;

public class TimedAuto extends CommandBase {
  /** Creates a new TimedAuto. */
  Timer arcadeDriveTimer = null; 


  public TimedAuto() {
    // Use addRequirements() here to declare subsystem dependencies.
    // DriveTrain Subsystem required for arcade drive 
    addRequirements(RobotContainer.driveTrainSubsystem);

    arcadeDriveTimer = new Timer();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    arcadeDriveTimer.start();


  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (arcadeDriveTimer.get() <= Constants.RUN_INITAL_AUTO){
      RobotContainer.driveTrainSubsystem.arcadeDrive(1, 0);

    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    arcadeDriveTimer.stop();

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
