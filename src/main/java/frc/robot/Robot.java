package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.CloseGripper;
import frc.robot.commands.DefaultDrive;
import frc.robot.commands.DriveAway;
import frc.robot.commands.DriveForward;
import frc.robot.commands.ElevatorMove;
import frc.robot.commands.Everything;
import frc.robot.commands.Grab;
import frc.robot.commands.OpenGripper;
import frc.robot.commands.PlaceSoda;
import frc.robot.commands.PrepareToGrab;
import frc.robot.commands.WristMove;
import frc.robot.subsystems.DriveBase;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Gripper;
import frc.robot.subsystems.Wrist;

public class Robot extends TimedRobot {

	public static Gripper gripper = new Gripper();
	public static Elevator elevator = new Elevator();
	public static Wrist wrist = new Wrist();
	public static DriveBase driveBase = new DriveBase();

	public static final double elevatorUpSetpoint = 0.0;
	public static final double elevatorDownSetpoint = 0.0;
	public static final double wristUpSetpoint = 0.0;
	public static final double wristDownSetpoint = 0.0;

	public static OI oi;
	private Command autoCommand;

	@Override
	public void robotInit() {
        SmartDashboard.putData("Autonomous Command", new Everything());
        SmartDashboard.putData("OpenGripper", new OpenGripper());
        SmartDashboard.putData("CloseGripper", new CloseGripper());
        SmartDashboard.putData("ElevatorMove: up", new ElevatorMove(2.7));
        SmartDashboard.putData("ElevatorMove: down", new ElevatorMove(1.5));
        SmartDashboard.putData("WristUp: horizontal", new WristMove(3.4));
        SmartDashboard.putData("WristUp: up", new WristMove(4.1));
        SmartDashboard.putData("PlaceSoda", new PlaceSoda());
        SmartDashboard.putData("PrepareToGrab", new PrepareToGrab());
        SmartDashboard.putData("Grab", new Grab());
        SmartDashboard.putData("Everything", new Everything());
        SmartDashboard.putData("DriveFoward", new DriveForward());
        SmartDashboard.putData("DriveAway", new DriveAway());
        SmartDashboard.putData("DefaultDrive", new DefaultDrive());
		oi = new OI();
	}

	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
		autoCommand = new Everything();
		autoCommand.start();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		if (autoCommand != null) {
			autoCommand.cancel();
		}
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
	}
}
