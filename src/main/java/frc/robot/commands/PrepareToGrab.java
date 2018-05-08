package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PrepareToGrab extends CommandGroup {

    public PrepareToGrab() {
        addParallel(new ElevatorMove(1.5));
        addParallel(new OpenGripper());
        addParallel(new WristMove(3.4));
    } 
}
