package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ElevatorMove extends Command {

    private double m_setpoint;
 
    public ElevatorMove(double setpoint) {
        m_setpoint = setpoint;
        requires(Robot.elevator);
    }

    @Override
    protected void initialize() {
        Robot.elevator.enable();
        Robot.elevator.setSetpoint(m_setpoint);
    }

    @Override
    protected boolean isFinished() {
       return Robot.elevator.onTarget();
    }
}
