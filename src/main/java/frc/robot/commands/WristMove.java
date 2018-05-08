package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WristMove extends Command {

    private double m_setpoint;
 
    public WristMove(double setpoint) {
        m_setpoint = setpoint;
        requires(Robot.wrist);
    }

    @Override
    protected void initialize() {
        Robot.wrist.enable();
        Robot.wrist.setSetpoint(m_setpoint);
    }

    @Override
    protected boolean isFinished() {
       return Robot.wrist.onTarget();
    }
}
