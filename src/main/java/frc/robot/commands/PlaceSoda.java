package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PlaceSoda extends CommandGroup {


    public PlaceSoda() {
        addSequential(new WristMove(3.4));
        addSequential(new ElevatorMove(2.7));
        addSequential(new OpenGripper());
    }
}
