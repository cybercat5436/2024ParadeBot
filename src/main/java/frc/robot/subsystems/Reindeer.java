// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Reindeer extends SubsystemBase {
  private CANSparkMax motor = new CANSparkMax(8, MotorType.kBrushed);
  public Reindeer() {}

  public void start(){
    motor.set(0.15);
    System.out.println("Started");
  }

  public void stop (){
    motor.set(0);
    System.out.println("stopped");
  }
 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
