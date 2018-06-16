package XMLconvert;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * XML para envio de datos Huffman-tabla y codigo 01
 * @author josek
 */
@XmlRootElement
public class Message {
    private String code01;
    private String dictionary;
    private String tag;

    /**
     * Constructor
     */
    public Message(){}
    
    /**
     * Obtiene el tag del xml
     * @return 
     */
    @XmlElement
    public String getTag() {
        return tag;
    }
    /**
     * retorna el tag del xml
     * @param tag 
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Obtiene el diccionario del xml
     * @return 
     */
    @XmlElement
    public String getdictionary() {
        return dictionary;
    }
    /**
     * retorna el diccionario del xml
     * @param dictionary 
     */
    public void setdictionary(String dictionary) {
        this.dictionary = dictionary;
    }
    /**
     * Obtiene el code de 01 del xml
     * @return 
     */
    @XmlElement
    public String getcode01() {
        return code01;
    }
    
    /**
     * Retorna el diccionario del xml
     * @param code01 
     */
    public void setcode01(String code01) {
        this.code01 = code01;
    }
}
