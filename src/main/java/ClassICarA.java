
import Interfaces.ICarA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruth Anai
 */
public class ClassICarA implements ICarA {
    
    private boolean speakerStatus = false;
    private double emisora = 0.5;
    /**
     * Regresa la emisora
     * @return mensaje con la emisora
     */
    public String getEmisora() {
        String a = String.valueOf(this.emisora);
        return "Emisora: "+a;
    }
    /**
     * aumenta la emisora
     */
    public void setEmisora() {
        this.emisora = this.emisora +0.5;
    }
    
    
    /**
     * Get Speker Status
     * @return el estado de los altavoces
     */
    @Override
    public boolean getSpeakerStatus() {
        return speakerStatus;
    }
    
    /**
     * Cambia el estado de los altavocis
     * @param _SpeakerStatus estado 
     */
    @Override
    public void setSpeakerStatus(boolean _SpeakerStatus) {this.speakerStatus = _SpeakerStatus;
        
    }
    

    /**
     * Cambia el  estado de los altavoces
     * @return true
     */
    @Override
    public boolean ChangeSpeakerStatus() {
        if(this.speakerStatus){
          this.speakerStatus = false; 
        }
        else{
            this.speakerStatus = true;
        }
        return true;
    }
    /**
     * Agrega un nuevo viaje
     * @param tripday dia
     * @param tripHour_ hora
     * @param tripPlace lugar
     * @param tripLength largo
     * @param tripObjective objetuvi
     * @return viaje
     */
    @Override
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength, String tripObjective) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
