/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 * @author Diego
 * @author Ruth
 * Interface para la clase cancion, estas se usaran en  distintos tipos de array
 */
public interface ISong {
        
    public void setTitle(String _title);
	
    public String getTitle();
	
    public void setArtist(String _artist);
	
    public String getArtist();
    
    public void setAlbum(String _album);
	
    public String getAlbum();

    public void setDuration(String _duration);
	
    public String getDuration();

    public void setGenre(String _genre);
	
    public String getID();
    
}
