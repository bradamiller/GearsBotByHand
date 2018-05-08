package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.commands.DefaultDrive;

public class DriveBase extends Subsystem {

    private DifferentialDrive differentialDrive;

    public DriveBase() {
        SpeedController leftFront = new WPI_TalonSRX(1);
        SpeedController leftRear = new WPI_TalonSRX(3);
        SpeedController leftMotors = new SpeedControllerGroup(leftFront, leftRear);

        SpeedController rightFront = new WPI_TalonSRX(0);
        SpeedController rightRear = new WPI_TalonSRX(2);
        SpeedController rightMotors = new SpeedControllerGroup(rightFront, rightRear);

        differentialDrive = new DifferentialDrive(rightMotors, leftMotors);

        differentialDrive.setSafetyEnabled(false);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDrive());
    }

    public void forward() {
        differentialDrive.arcadeDrive(0.5, 0);
    }

    public void stop() {
        differentialDrive.stopMotor();
    }

    public void backwards() {
        differentialDrive.arcadeDrive(-0.5, 0);
    }

    public void driveWithJoystick() {
        Joystick stick = Robot.oi.getStick();
        differentialDrive.arcadeDrive(-stick.getY(), -stick.getX());
    }
}
