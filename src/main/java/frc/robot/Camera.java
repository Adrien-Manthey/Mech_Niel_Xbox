package frc.robot;

import frc.robot.Robot;
import frc.robot.GripPipethree;
//import frc.robot.PixyTest;
//import frc.robot.Main;
import org.opencv.core.*;
import edu.wpi.first.cameraserver.CameraServer;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import org.opencv.core.Point;
//import org.opencv.core.Rect;
//import org.opencv.core.Scalar;
import org.opencv.imgproc.*;
//import frc.robot.GripPipeline;
//import edu.wpi.first.wpilibj.networktables.*;
import java.util.ArrayList;
import java.util.List;
//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import org.opencv.core.Mat;
//import edu.wpi.cscore.AxisCamera;
//import edu.wpi.cscore.UsbCamera;
//import edu.wpi.first.wpilibj.vision.VisionRunner;
//import edu.wpi.first.wpilibj.vision.VisionThread;
//import edu.wpi.first.vision.VisionPipeline;

public final class Camera {
    public Camera() {

    }
  
    /**
     * Main initialization function. Do not perform any initialization here.
     *
     * <p>If you change your main robot class, change the parameter type.
     */
    public static void camera() {
        //CameraServer.getInstance().addAxisCamera("10.42.29.90"); //axis camera
        CameraServer.getInstance().startAutomaticCapture(); //USB camera
        
        Mat image = new Mat();
        /**
        
        
        GripPipethree pipeline = new GripPipethree();
        
        pipeline.process(source0);
    
        ArrayList<MatOfPoint> contours = pipeline.findContoursOutput();
        
        List<RotatedRect> rectangles = new ArrayList<>();
        
        for (MatOfPoint contour : contours ) {
          rectangles.add(Imgproc.minAreaRect(new MatOfPoint2f(contour.toArray())));
        }
        */
        
        CameraServer.getInstance().putVideo("size", 640, 480);
        CameraServer.getInstance().getVideo().grabFrame(image);
    }
  }