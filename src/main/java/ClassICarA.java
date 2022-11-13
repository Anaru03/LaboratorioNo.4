
import Interfaces.ICarA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ClassICarA implements ICarA {
    
    private boolean speakerStatus;
    
    /**
     * 
     * @return 
     */
    @Override
    public boolean getSpeakerStatus() {return speakerStatus;
        
    }
    
    /**
     * 
     * @param _SpeakerStatus 
     */
    @Override
    public void setSpeakerStatus(boolean _SpeakerStatus) {this.speakerStatus = speakerStatus;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    /**
     * 
     * @return 
     */
    @Override
    public boolean ChangeSpeakerStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength, String tripObjective) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
