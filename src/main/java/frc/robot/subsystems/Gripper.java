package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gripper extends Subsystem {

    private Victor motor = new Victor(1);

	@Override
	protected void initDefaultCommand() {
    }

    public void open() {
        motor.set(-1);
    }

    public void stop() {
        motor.set(0);
    }

    public void close() {
        motor.set(1);
    }
}
