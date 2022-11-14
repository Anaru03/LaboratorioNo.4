/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Ruth Anai
 */
public class Controller {
    public static ClassICarA carA = new ClassICarA();
    public static void main(String[] args) {
        while(true){
        menu();
        }
    }
    /**
     * Menu principal
     */
    public static void menu(){
        UI.show(showStatus());
        int op = UI.initial();
        switch(op){
            case 1: carA.ChangeSpeakerStatus();
                    UI.show(showStatus());
                break;
            case 2:
                if(carA.getSpeakerStatus()){
                    UI.show("SE CAMBIO A FM");
                }else{
                    UI.show("ENCIENDA PRIMERO LA RADIO");
                }
                break;
            case 3:if(carA.getSpeakerStatus()){
                    carA.setEmisora();
                    UI.show(carA.getEmisora());
                }else{
                    UI.show("ENCIENDA PRIMERO LA RADIO");
                }
                break;
            case 4:
                UI.show("SE GUARDO LA EMISORA: "+carA.getEmisora());
                break;
            default: UI.show("ERROR NUMERO INCORRECTO");
                break;
        }
    }
    /**
     * Muestra el estado
     * @return estado
     */
    public static String showStatus(){
        String status;
        if(carA.getSpeakerStatus()){
            status = "ESTADO: ENCENDIDO";
        }
        else{
            status = "ESTADO: APAGADO";
        }
        return status;
    }
}
