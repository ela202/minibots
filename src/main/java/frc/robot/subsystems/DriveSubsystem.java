

package frc.robot.subsystems;
import com.studica.frc.TitanQuad;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/**
 * DriveTrain class 
 * <p>
 * This class creates the instance of the Titan and enables and sets the speed of the defined motor. 
 */
public class DriveTrain extends SubsystemBase
{
    private TitanQuad motorR;
    private TitanQuad motorL;

    public DriveTrain()
    {
        motorR = new TitanQuad(Constants.TITAN_ID, Constants.MOTORR);
        motorL = new TitanQuad(Constants.TITAN_ID, Constants.MOTORL);
    }

    /**
     * Sets the speed of the motor
     * <p>
     * @param speed range -1 to 1 (0 stop)
     */
    public void setMotorSpeed(double speedR, double speedL)
    {
        motorR.set(1);
        motorL.set(1);
    }

}