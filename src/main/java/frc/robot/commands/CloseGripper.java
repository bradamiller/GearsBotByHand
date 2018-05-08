package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

public class CloseGripper extends TimedCommand {

    public CloseGripper() {
        super(1);
        requires(Robot.gripper);
    }

    @Override
    protected void initialize() {
        Robot.gripper.close();
    }

    @Override
    public void end() {
        Robot.gripper.stop();
    }
}