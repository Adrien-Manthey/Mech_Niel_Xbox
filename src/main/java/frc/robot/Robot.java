/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.Spark;
import org.opencv.core.Mat;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.robot.Camera;
//import java.util.ArrayList;
//import java.util.List;
/** 
import java.util.ArrayList;
import frc.robot.Camera;

import org.opencv.core.Mat;
import edu.wpi.cscore.AxisCamera;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.vision.VisionRunner;
import edu.wpi.first.wpilibj.vision.VisionThread;
import edu.wpi.first.vision.VisionPipeline;

import org.opencv.core.*;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.*;
import frc.robot.GripPipeline;
import edu.wpi.first.wpilibj.networktables.*;
*/





/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  //Drive Train Motor Declerations
  
  // Drive Train with sparks

  Spark M_F_L_Drive = new Spark(0);
  Spark M_F_R_Drive = new Spark(3);
  Spark M_B_L_Drive = new Spark(2);
  Spark M_B_R_Drive = new Spark(1);

  // Drive Train with Victor SPX

  /**
  VictorSPX M_F_L_Drive = new VictorSPX(0);
  VictorSPX M_F_R_Drive = new VictorSPX(3);
  VictorSPX M_B_L_Drive = new VictorSPX(2);
  VictorSPX M_B_R_Drive = new VictorSPX(1);
  */ 

  //Shooter Motor Declerations with victors

  VictorSPX m_v_1 = new VictorSPX(0);
  VictorSPX m_v_2 = new VictorSPX(1);

  //Shooter motor decleration with sparks

  //Spark m_v_1 = new Spark(0);
  //Spark m_v_2 = new Spark(1);
  


  // Drive Train Decleration
  MecanumDrive Robo_Drive = new MecanumDrive(M_F_L_Drive, M_B_L_Drive, M_F_R_Drive, M_B_R_Drive);

  // Xbox remote setup
  XboxController R_C = new XboxController(0);

    //Setting up pnumatics
    Compressor c = new Compressor(0);
  
    //Solenoids are called S# - number being what port there in
    Solenoid S0 = new Solenoid(0);
    //Solenoid S1 = new Solenoid(1);
    //Solenoid S2 = new Solenoid(2);
    Solenoid S3 = new Solenoid(3);




  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {

    Camera.camera();
    m_v_1.set(ControlMode.PercentOutput,0);
    m_v_2.set(ControlMode.PercentOutput,0);
    
    
    






    }




    




    




			
		
         
       
			

  

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    

  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {

    
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {

    //Driveing in teleop
    
    Robo_Drive.driveCartesian(R_C.getX(GenericHID.Hand.kLeft)*0.75, -1*R_C.getY(GenericHID.Hand.kLeft)*0.75, R_C.getX(GenericHID.Hand.kRight)*0.5);
    /**
    if(R_C.getRawButton(3)) {
      m_v_1.set(ControlMode.PercentOutput,1);
      m_v_2.set(ControlMode.PercentOutput,1);
			
			

    }
    else if(R_C.getRawButton(4)) {
      m_v_1.set(ControlMode.PercentOutput,-1);
      m_v_2.set(ControlMode.PercentOutput,-1);

    }

		else {
      m_v_1.set(ControlMode.PercentOutput,0);
      m_v_2.set(ControlMode.PercentOutput,0);
			
			

    }
    */
    
    //Pnumatics for pizza intake
     
    
    
		if(R_C.getRawButton(1)) {
			S0.set(true);
			Timer.delay(0.001);

		}

		else {
			S0.set(false);
			Timer.delay(0.001);

    }
    
    /**
    if(R_C.getRawButton(5)) {
      //S0.set(true);
      //S3.set(true);
      //c.setClosedLoopControl(true);
      //S2.set(true);
      //Timer.delay(0.001);
     
    }
    else if(R_C.getRawButton(1)){
      S0.set(true);
      S3.set(true);
      c.setClosedLoopControl(true);
      Timer.delay(0.001);
    }
    else if(R_C.getRawButton(6)) {
      c.setClosedLoopControl(false);
      S3.set(true);
      Timer.delay(0.0001);
    }
    else if(R_C.getRawButton(7)) {
      //S0.set(false);
      //S3.set(true);
      //c.setClosedLoopControl(true);
      //Timer.delay(0.001);
    }
    else if(R_C.getRawButton(8)) {
      //S2.set(false);
      //c.setClosedLoopControl(true);
      //Timer.delay(0.001);
    }
    else{
      S3.set(true);
      c.setClosedLoopControl(true);
      
    }
    */
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {

  }
}
