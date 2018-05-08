package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

public class DriveAway extends TimedCommand {

    public DriveAway() {
        super(1);
        requires(Robot.driveBase);
    }

    @Override
    protected void initialize() {
    	Robot.driveBase.backwards();
    }

    @Override
    protected void end() {
        Robot.driveBase.stop();
    }
}
