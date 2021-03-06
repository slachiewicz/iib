//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 01:24:22 AM BRT 
//


package com.ibm.stats;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _RecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="_RecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Archive"/>
 *     &lt;enumeration value="SnapShot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "_RecordType")
@XmlEnum
public enum RecordType {

    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),
    @XmlEnumValue("SnapShot")
    SNAP_SHOT("SnapShot");
    private final String value;

    RecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordType fromValue(String v) {
        for (RecordType c: RecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
