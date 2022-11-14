
import Interfaces.ICarB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruth Anai
 */
public class ClassICarB implements ICarB{
    
    private String lastContact;
    private String presentationCards;
    
    /**
     * obtiene la ultima conexion
     * @return ultima conexion
     */
    @Override
    public String getLastContact() {return lastContact;
        
    }

    /**
     * ultimo contacto
     * @param LastCalledContact utlimo contacto
     */
    @Override
    public void setLastContact(String LastCalledContact) {this.lastContact = lastContact;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Presentacion de cards
     * @return presentacion de cars
     */
    @Override
    public String getPresentationCards() {return presentationCards;
        
    }

    /**
     * presnetacion
     * @param _presentationCards  presnetacion
     */
    @Override
    public void setPresentationCards(String _presentationCards) {this.presentationCards = presentationCards;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
