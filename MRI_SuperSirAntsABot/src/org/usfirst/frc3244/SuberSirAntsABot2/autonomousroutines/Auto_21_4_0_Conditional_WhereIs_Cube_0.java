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
public class Auto_21_4_0_Conditional_WhereIs_Cube_0 extends ConditionalCommand {

    public Auto_21_4_0_Conditional_WhereIs_Cube_0() {
    	super(new Auto_21_4_1_Left_Get_Cube_0(), new Auto_21_4_2_Right_Get_Cube_0());
    }

    @Override
    protected boolean condition(){
    	String s = Robot.gameData;
    	DriverStation.reportError("RUNING: Auto_21_2_Conditional_WhatSwitch()", false);
    	if(s.length() > 0){
    		if(s.charAt(Constants.kGameDataOurSwitchChar) == 'L'){
    			DriverStation.reportError("Switch IS L", false);
    			return true;
    		}else{
    			DriverStation.reportError("Switch NOT L", false);
    			return false;
    		}
        }else {
        	DriverStation.reportError("Game Data EMPTY", false);
        	return false;
        }
    }
}