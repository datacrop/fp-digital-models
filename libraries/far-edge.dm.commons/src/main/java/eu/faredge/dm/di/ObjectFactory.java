//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.10 at 05:50:58 �� EET 
//


package eu.faredge.dm.di;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.faredge.dm.di package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.faredge.dm.di
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DI.DataInterfaceSpecification }
     * 
     */
    public DI.DataInterfaceSpecification createDIDataInterfaceSpecification() {
        return new DI.DataInterfaceSpecification();
    }

    /**
     * Create an instance of {@link DI }
     * 
     */
    public DI createDI() {
        return new DI();
    }

    /**
     * Create an instance of {@link DI.DataInterfaceSpecification.Parameters }
     * 
     */
    public DI.DataInterfaceSpecification.Parameters createDIDataInterfaceSpecificationParameters() {
        return new DI.DataInterfaceSpecification.Parameters();
    }

    /**
     * Create an instance of {@link DI.DataInterfaceSpecification.Parameters.Parameter }
     * 
     */
    public DI.DataInterfaceSpecification.Parameters.Parameter createDIDataInterfaceSpecificationParametersParameter() {
        return new DI.DataInterfaceSpecification.Parameters.Parameter();
    }

}