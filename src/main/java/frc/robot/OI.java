
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.CloseGripper;
import frc.robot.commands.OpenGripper;

public class OI {

	private Joystick stick;

	public OI() {
		stick = new Joystick(1);

		JoystickButton button1 = new JoystickButton(stick, 1);
		button1.whenPressed(new OpenGripper());

		JoystickButton button2 = new JoystickButton(stick, 2);
		button2.whenPressed(new CloseGripper());
	}

	public Joystick getStick() {
		return stick;
	}
}
