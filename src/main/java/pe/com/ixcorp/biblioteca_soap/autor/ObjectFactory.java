//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.08 at 08:15:27 PM COT 
//


package pe.com.ixcorp.biblioteca_soap.autor;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.ixcorp.biblioteca_soap.autor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.ixcorp.biblioteca_soap.autor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAutorResponse }
     * 
     */
    public GetAllAutorResponse createGetAllAutorResponse() {
        return new GetAllAutorResponse();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link AddAutorResponse }
     * 
     */
    public AddAutorResponse createAddAutorResponse() {
        return new AddAutorResponse();
    }

    /**
     * Create an instance of {@link GetAutorResponse }
     * 
     */
    public GetAutorResponse createGetAutorResponse() {
        return new GetAutorResponse();
    }

    /**
     * Create an instance of {@link GetAllAutorRequest }
     * 
     */
    public GetAllAutorRequest createGetAllAutorRequest() {
        return new GetAllAutorRequest();
    }

    /**
     * Create an instance of {@link GetAutorRequest }
     * 
     */
    public GetAutorRequest createGetAutorRequest() {
        return new GetAutorRequest();
    }

    /**
     * Create an instance of {@link AddAutorRequest }
     * 
     */
    public AddAutorRequest createAddAutorRequest() {
        return new AddAutorRequest();
    }

}