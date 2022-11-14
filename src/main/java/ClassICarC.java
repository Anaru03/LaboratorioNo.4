
import Interfaces.ICarC;
import Interfaces.ISong;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruth Anai
 */
public class ClassICarC implements ICarC{

    private boolean radioStatus;
    private int volume;
    private float station;
    private int audioRepType;
    private int callStatus;
    ArrayList <ISong> AListOfSongs;
    ArrayList <String> ListofContacts;
    
    
    public boolean modo = false;
    private float indice = 0;
  
    /**
     * Cambia la radio
     * @return estado actual
     */
    @Override
    public boolean SwitchRadioONOFF(boolean actual_state) {
        if(actual_state) {
            this.modo = false;
        }else{
            this.modo = true;
        }
      
        return true;
    }

    /**
     * obtiene el estado
     * @return estado
     */
    @Override
    public boolean getRadioStatus() {return radioStatus;
        
    }
    
    /**
     * 
     * @param RadioStatus 
     */
    @Override
    public void setRadioStatus(boolean RadioStatus) {this.radioStatus = RadioStatus;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public int getVolume() {return volume;
        
    }

    /**
     * 
     * @param Volume 
     */
    @Override
    public void setVolume(int Volume) {this.volume = volume;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    /**
     * 
     * @param frequency
     * @return 
     */
    @Override
    public float SwitchFrequency(float frequency) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @param stationChange 
     */
    @Override
    public void setStation(float stationChange) {this.station = station;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public float getStation() {return  station;
        
    }

    /**
     * 
     * @param _station 
     * @throws java.lang.Exception 
     */
    @Override
    public void SaveStation(float _station) throws Exception{
        if(_station < 50){
            this.indice = _station;
        }
        else {
            throw new Exception("¡Solo se puede guardar 50 emisoras");
        }
        
    }

    /**
     * 
     * @param _StationIndex
     * @return 
     */
    @Override
    public float SelectSpecificStation(int _StationIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public int getAudioRepType() {return audioRepType;
        
    }

    /**
     * 
     * @param _audioRepType 
     */
    @Override
    public void setAudioRepType(int _audioRepType) {this.audioRepType = audioRepType;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @param TypeOfAudioReproduction
     * @return 
     */
    @Override
    public ArrayList<ISong> getAListOfSongs(int TypeOfAudioReproduction) {
        return AListOfSongs;
        
    }

    /**
     * 
     * @param CurrentIndex
     * @param TypeOfAudioReproduction 
     */
    @Override
    public void NextSong(int CurrentIndex, int TypeOfAudioReproduction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @param CurrentIndex
     * @param TypeOfAudioReproduction 
     */
    @Override
    public void PrevSong(int CurrentIndex, int TypeOfAudioReproduction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @param TypeOfAudioReproduction
     * @return 
     */
    @Override
    public String PlaySong(int TypeOfAudioReproduction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean Connect_DisconnectPhone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean getPhoneConnectionStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public ArrayList<String> getListofContacts() {
        return ListofContacts;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int getCallStatus() {return callStatus;
        
    }

    /**
     * 
     * @param NameforCall
     * @return 
     */
    @Override
    public String makeCall(String NameforCall) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String PlaceCallOnHold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String endCall() { 
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getWeatherForCast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
