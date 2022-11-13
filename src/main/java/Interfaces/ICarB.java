/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 * @author Diego
 * @author Ruth
 * Interface para los carros tipo B, estos deben de poder hacer lo que hace el C
 * mas las funcionalidades que implemente esta interfaz
 * 
 *
 */
public interface ICarB {
    
    /**
	 * Metodo para obtener el ultimo contacto al que se llamo
	 * @return
	 */
	public String getLastContact();
	
	/**
	 * Metodo para cambiar el ultimo contacto guardado
	 * @param LastCalledContact
	 */
	public void setLastContact(String LastCalledContact);
	
	/**
	 * Metodo para obtener las tarjetas de presentacion
	 * Queda libre como se guardaran estas, ya que estaran pre establecidas por 
	 * cada grupo en el codigo 
	 * @return
	 */
	public String getPresentationCards();
	
    
}
