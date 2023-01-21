package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
//import frc.robot.subsystems.IntakeSubsystem;

    //Manipulator code by Danial and Zabir

public class IntakeWheels extends CommandBase{
    public IntakeWheels(){
        addRequirements(RobotContainer.intakeSubsystem);
    }
  
    @Override
  public void initialize() {
    
  }

  public void test(){

    RobotContainer.intakeSubsystem.set(Constants.INTAKE_SPEED_FOWARD);
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //If left bumper is pressed, turns the motor on in order to take the game piece in, and grip it
    RobotContainer.intakeSubsystem.set(Constants.INTAKE_SPEED_FOWARD);

  }
  @Override
  public void end(boolean interrupted) {
    RobotContainer.intakeSubsystem.set(Constants.STOP_MOTOR);
  }
  //gets returned true when the command ends
  @Override
  public boolean isFinished() {
    return false;
  }
}