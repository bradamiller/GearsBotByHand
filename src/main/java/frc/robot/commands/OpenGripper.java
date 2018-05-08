package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

public class OpenGripper extends TimedCommand {

    public OpenGripper() {
        super(1.0);
        requires(Robot.gripper);
    }

    @Override
    protected void initialize() {
        Robot.gripper.open();
    }

    @Override
    public void end() {
        Robot.gripper.stop();
    }
}