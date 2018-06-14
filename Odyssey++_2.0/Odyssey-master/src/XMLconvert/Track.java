package XMLconvert;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Track {

    private String title;
    private String genre;
    private String artist;
    private String album;
    private String year;
    private String letter;
    private String tag;
    private String rate;    
    private String username;
    
    public Track() { }
     
    @XmlElement
    public String getUsername() {
        return username;
    }

    @XmlElement
    public String getTag() {
        return tag;
    }
   
    @XmlElement
    public String getRate() {
        return rate;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }
    
    @XmlElement
    public String getGenre() {
        return genre;
    }

    @XmlElement
    public String getArtist() {
        return artist;
    }

    @XmlElement
    public String getAlbum() {
        return album;
    }

    @XmlElement
    public String getYear() {
        return year;
    }

    @XmlElement
    public String getLetter() {
        return letter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Track{" +
                ", title=" + title + "'" +
                ", genre=" + genre + "'" +
                ", artist=" + artist + "'" +
                ", album=" + album + "'" +
                ", year=" + year + "'" +
                ", letter=" + letter + "'" +
                "}";
    }
    //output
    /*
    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <track id="1">
        <album>No me recuerod</album>
        <artist>The Beatles</artist>
        <genre>Rock</genre>
        <letter>Hey jude, nananananan, he</letter>
        <title>Hey Jude</title>
        <year>19##</year>
    </track>
     */
}
