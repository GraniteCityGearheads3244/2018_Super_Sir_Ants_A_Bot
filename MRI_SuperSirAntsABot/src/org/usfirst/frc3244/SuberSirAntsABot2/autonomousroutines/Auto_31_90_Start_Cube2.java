// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;

import org.usfirst.frc3244.SuperSirAntsABot2.Constants;
import org.usfirst.frc3244.SuperSirAntsABot2.Robot;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;


/**
 *
 */
public class Auto_31_90_Start_Cube2 extends ConditionalCommand {

    public Auto_31_90_Start_Cube2() {
      super(new Finnished(), new Auto_31_91_Get_Cube_6());
    }

    
    @Override
    protected boolean condition(){
    	Integer multiCubeChoice = (Integer) Robot.multiCubeChooser.getSelected();
    	DriverStation.reportError("RUNING: Auto_31_90_Start_Cube2", false);
    	
    	if(multiCubeChoice != null) {
    		if(multiCubeChoice == 0){
    		DriverStation.reportError("No Second Cube", false);
    			return true;
    		}else{
    			DriverStation.reportError("Start Second Cube Auto", false);
    			return false;
    		}
        }else {
        	DriverStation.reportError("multiCubeChooser Null", false);
        	return true;
        }
    }
}