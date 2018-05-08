package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

public class DriveForward extends TimedCommand {

    public DriveForward() {
        super(1);
        requires(Robot.driveBase);
    }

    @Override
    protected void initialize() {
    	Robot.driveBase.forward();
    }

    @Override
    protected void end() {
    	Robot.driveBase.stop();
    }
}
