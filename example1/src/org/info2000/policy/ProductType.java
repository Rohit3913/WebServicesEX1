//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.31 at 08:49:00 PM IST 
//


package org.info2000.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW700"/>
 *     &lt;enumeration value="SW715"/>
 *     &lt;enumeration value="SW535"/>
 *     &lt;enumeration value="SW100"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productType")
@XmlEnum
public enum ProductType {

    @XmlEnumValue("SW700")
    SW_700("SW700"),
    @XmlEnumValue("SW715")
    SW_715("SW715"),
    @XmlEnumValue("SW535")
    SW_535("SW535"),
    @XmlEnumValue("SW100")
    SW_100("SW100");
    private final String value;

    ProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductType fromValue(String v) {
        for (ProductType c: ProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
