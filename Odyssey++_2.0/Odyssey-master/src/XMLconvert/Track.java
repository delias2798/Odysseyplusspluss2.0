package XMLconvert;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Track {

    private String title,genre,artist,album,year,letter,tag,rate,username,path;
   
    /**
     * Constructor
     */
    public Track() {  }
    
    /**
     * Obtiene el part del xml
     * @return 
     */
    @XmlElement
    public String getPath() {
        return path;
    }

    /**
     * Obtiene el username del xml
     * @return 
     */
    @XmlElement
    public String getUsername() {
        return username;
    }

    /**
     * Obtiene el tag del xml
     * @return 
     */
    @XmlElement
    public String getTag() {
        return tag;
    }

    /**
     * Obtiene la calificación del xml
     * @return 
     */
    @XmlElement
    public String getRate() {
        return rate;
    }

    /**
     * Obtiene el titulo del xml
     * @return 
     */
    @XmlElement
    public String getTitle() {
        return title;
    }

    /**
     * Obtiene el genero del xml
     * @return 
     */
    @XmlElement
    public String getGenre() {
        return genre;
    }

    /**
     * Obtiene el nombre del artista del xml
     * @return 
     */
    @XmlElement
    public String getArtist() {
        return artist;
    }

    /**
     * Obtiene el album del xml
     * @return 
     */
    @XmlElement
    public String getAlbum() {
        return album;
    }

    /**
     * Obtiene el año de creacion del xml
     * @return 
     */
    @XmlElement
    public String getYear() {
        return year;
    }

    /**
     * Obtiene la letra del xml
     * @return 
     */
    @XmlElement
    public String getLetter() {
        return letter;
    }

    /**
     * Retorna el titulo del xml 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retorna el genero del xml
     * @param genre 
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Retorna el artista del xml 
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Retorna el album del xml
     * @param album 
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * Retorna el año del xml
     * @param year 
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Retorna la letra del xml
     * @param letter 
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * Retorna el usuario del xml
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retorna el tag del xml
     * @param tag 
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Retorna la calificación del xml
     * @param rate 
     */
    public void setRate(String rate) {
        this.rate = rate;
    }
    /**
     * Retorna el part del xml
     * @param path 
     */
    public void setPath(String path) {
        this.path = path;
    }

}
