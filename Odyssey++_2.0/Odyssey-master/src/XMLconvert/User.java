package XMLconvert;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase Usuario/User
 *
 * @author josek
 */
@XmlRootElement
public class User {

    private String username, name, last_name, age, pass, like, friends, tag;

    /**
     * Constructor
     */
    public User() {
    }

    /**
     * Obtiene el tag del User_xml 
     * @return 
     */
    @XmlElement
    public String getTag() {
        return tag;
    }

    /**
     * Obtiene el username del User_xml 
     * @return 
     */
    @XmlElement
    public String getUsername() {
        return username;
    }

    /**
     * Obtiene el nombre del User_xml 
     * @return 
     */
    @XmlElement
    public String getName() {
        return name;
    }

    /**
     * Obtiene el apellido del User_xml 
     * @return 
     */
    @XmlElement
    public String getLastname() {
        return last_name;
    }

    /**
     * Obtiene la edad del User_xml 
     * @return 
     */
    @XmlElement
    public String getAge() {
        return age;
    }

    /**
     * Obtiene la contraseña del User_xml 
     * @return 
     */
    @XmlElement
    public String getPass() {
        return pass;
    }

    /**
     * Obtiene los gustos/generos del User_xml 
     * @return 
     */
    @XmlElement
    public String getLike() {
        return like;
    }

    /**
     * Obtiene los amigos del User_xml 
     * @return 
     */
    @XmlElement
    public String getFriends() {
        return friends;
    }

    /**
     * Asigna los amigos del User_xml 
     * @param friends
     */
    public void setFriends(String friends) {
        this.friends = friends;
    }

    /**
     * Asigna el tag del User_xml 
     * @param tag 
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Asigna los gustos/generos del User_xml 
     * @param like 
     */
    public void setLike(String like) {
        this.like = like;
    }

    /**
     * Asigna la contraseña del User_xml 
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Asigna la edad del User_xml 
     * @param age 
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Asigna el apellido del User_xml 
     * @param last_name 
     */
    public void setLastname(String last_name) {
        this.last_name = last_name;
    }

    /**
     * Asigna el nombre del User_xml 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Asigna el username del User_xml 
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
