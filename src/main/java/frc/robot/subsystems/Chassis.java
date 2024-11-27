// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Chassis extends SubsystemBase {
  private CANSparkMax leftFront = new CANSparkMax(2, MotorType.kBrushless);
  private CANSparkMax leftRear = new CANSparkMax(3,MotorType.kBrushless);
  private CANSparkMax rightFront = new CANSparkMax(4,MotorType.kBrushless);
  private CANSparkMax rightRear = new CANSparkMax(5, MotorType.kBrushless);
  
  /** Creates a new Chassis. */
  public Chassis() {
     rightFront.setInverted(true);
     rightRear.setInverted(true);
     System.out.println("just created chassis");
  }

  public void drive(double speed) {
    speed *= 0.3;
    leftFront.set(speed);
    leftRear.set(speed);
    rightFront.set(speed);
    rightRear.set(speed);
  }
   public void spin(double spin) {
    spin *= 0.3;
    leftFront.set(spin);
    leftRear.set(spin);
    rightFront.set(-spin);
    rightRear.set(-spin);
   }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
