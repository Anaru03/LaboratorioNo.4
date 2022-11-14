
import Interfaces.ISong;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruth Anai
 */
public class ClassSongs implements ISong{
    
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String genre;
    private String ID;

    
    /**
     * 
     * @param _title 
     */
    @Override
    public void setTitle(String _title) {this.title = _title;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @Override
    public String getTitle() {return title;
        
    }

    /**
     * 
     * @param _artist 
     */
    @Override
    public void setArtist(String _artist) {this.artist = _artist;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getArtist() {return artist;
        
    }

    /**
     * 
     * @param _album 
     */
    @Override
    public void setAlbum(String _album) {this.album = _album;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getAlbum() {return album;
     
    }

    /**
     * 
     * @param _duration 
     */
    @Override
    public void setDuration(String _duration) {this.duration = _duration;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getDuration() {return duration;
        
    }

    /**
     * 
     * @param _genre 
     */
    @Override
    public void setGenre(String _genre) {this.genre = _genre;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getGenre() {
        return genre;
       
    }
    
    /**
     * 
     * @param _ID 
     */
    @Override
    public void setID(String _ID) {this.ID = _ID;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    /**
     * 
     * @return 
     */
    @Override
    public String getID() {return ID;}

   

    
}
