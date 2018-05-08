package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Grab extends CommandGroup {

    public Grab() {
        addSequential(new CloseGripper());
        addParallel(new ElevatorMove(2.7));
        addParallel(new WristMove(4.1));
    } 
}
