package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DefaultDrive extends Command {

    public DefaultDrive() {
        requires(Robot.driveBase);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    		Robot.driveBase.driveWithJoystick();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
