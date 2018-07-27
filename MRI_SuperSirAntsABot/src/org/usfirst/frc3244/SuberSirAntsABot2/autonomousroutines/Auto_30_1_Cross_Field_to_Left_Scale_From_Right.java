package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;

import org.usfirst.frc3244.SuperSirAntsABot2.Constants;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_For_Distance;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Drive_Turn_To_Setpoint;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Intake_Launch;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Scissor_To_Setpoint;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.Wrist_Down;
import org.usfirst.frc3244.SuperSirAntsABot2.subsystems.Scissor;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitForChildren;

/**
 *
 */
public class Auto_30_1_Cross_Field_to_Left_Scale_From_Right extends CommandGroup {

	private static final double ROBOT_DISTANCE_PASS_SWITCH 		= 29.0;
	private static final double ROBOT_PASS_SWITCH_TURN_ANGLE 	= -90.0;  	//Angles are Field Orientated
	private static final double ROBOT_DISTANCE_CROSS_FIELD 		= 15.0;
	
	
    public Auto_30_1_Cross_Field_to_Left_Scale_From_Right() {
    	addSequential(	new Drive_For_Distance(0.0, 0.7, 0.0, ROBOT_DISTANCE_PASS_SWITCH, 0.0)); 			//1 Drive Past Switch
    	addSequential(	new Drive_Turn_To_Setpoint(0.0, 0.0, ROBOT_PASS_SWITCH_TURN_ANGLE),2);//, 3); //2 Turn Behind Switch
    	
    	addParallel(	new Wrist_Down(1));
    	addParallel(	new Scissor_To_Setpoint(Scissor.SWITCH,true),3);//, 3)
    	addSequential(	new Drive_For_Distance(0.0, 0.7, 0.0, ROBOT_DISTANCE_CROSS_FIELD, ROBOT_PASS_SWITCH_TURN_ANGLE)); 			//3 Drive Past Switch *We could try to add some rotation
    	
    	//Make sure all Steps are complete
    	addSequential(new WaitForChildren());
    	
    	//addParallel(	new Wrist_Down(1),3);	
    	
    }
}
