package XMLconvert;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringWriter;
import java.io.*;

/**
 * Permite trasformar objetos por medio de JAX a xml
 * @author josek
 */
public class JAXBObjectToXml {
        
    /**
     * Convertidor de objetos a xml
     * @param object
     * @param class_
     * @return 
     */
    public String ConvertToXML(Object object, Class class_){
        try {
            JAXBContext context = JAXBContext.newInstance(class_);

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            marshaller.marshal(object,sw);
            String xmlString = sw.toString();//transforma xml en xmlString
            return xmlString;
        } catch (JAXBException e) {        }
        return null;
    }

    /**
     *  Metódo para crear un usuarioXML
     * @param xml_string
     * @return 
     */
    public User ConvertToUser(String xml_string){

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xml_string);
            User user = (User) unmarshaller.unmarshal(reader);
            return user;
        } catch (JAXBException e) {
        }
        return null;
    }

    /**
     * Metódo para crear un usuarioXML
     * @param xml_string
     * @return 
     */
    public Track ConvertToTrack(String xml_string){

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Track.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xml_string);
            Track track = (Track) unmarshaller.unmarshal(reader);
            return track;
        } catch (JAXBException e) {
        }
        return null;
    }
}
