
import Interfaces.ICarB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ClassICarB implements ICarB{
    
    private String lastContact;
    private String presentationCards;
    
    /**
     * 
     * @return 
     */
    @Override
    public String getLastContact() {return lastContact;
        
    }

    /**
     * 
     * @param LastCalledContact 
     */
    @Override
    public void setLastContact(String LastCalledContact) {this.lastContact = lastContact;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getPresentationCards() {return presentationCards;
        
    }

    /**
     * 
     * @param _presentationCards 
     */
    @Override
    public void setPresentationCards(String _presentationCards) {this.presentationCards = presentationCards;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
