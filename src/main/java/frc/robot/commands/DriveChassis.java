// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Chassis;

public class DriveChassis extends Command {
  /** Creates a new DriveChassis. */
  private DoubleSupplier driveFunction;
  private DoubleSupplier spinFunction;
  private Chassis chassis;

  public DriveChassis(DoubleSupplier func, DoubleSupplier spinFunc,Chassis chassis) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.driveFunction = func;
    this.chassis = chassis;
    this.spinFunction = spinFunc;
    addRequirements(chassis);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = driveFunction.getAsDouble();
    chassis.drive(speed);
    double spin = spinFunction.getAsDouble();
   if (Math.abs(spin) >= 0.1){
    chassis.spin(spin);
   } 
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
