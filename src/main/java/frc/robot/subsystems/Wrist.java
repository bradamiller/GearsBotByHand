package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class Wrist extends PIDSubsystem {

    private static final int WristPotPort = 2;
    private static final int WristMotorPort = 0;
    private static final double Kp = 1.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;

    private Victor motor = new Victor(WristMotorPort);
    private AnalogPotentiometer pot = new AnalogPotentiometer(WristPotPort);
    
    public Wrist() {
        super(Kp, Ki, Kd);
        setAbsoluteTolerance(0.2);
    }

	@Override
	protected double returnPIDInput() {
		return pot.get();
	}

	@Override
	protected void usePIDOutput(double output) {
		motor.set(output);
	}

	@Override
	protected void initDefaultCommand() {	
	}
}
