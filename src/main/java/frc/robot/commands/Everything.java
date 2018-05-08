package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Everything extends CommandGroup {

    public Everything() {
        addSequential(new PrepareToGrab());
        addSequential(new Grab());
        addSequential(new DriveForward());
        addSequential(new PlaceSoda());
        addSequential(new DriveAway());
    } 
}
