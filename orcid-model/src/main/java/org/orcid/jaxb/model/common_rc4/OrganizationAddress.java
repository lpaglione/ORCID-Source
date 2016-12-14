/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 03:27:53 PM GMT 
//

package org.orcid.jaxb.model.common_rc4;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Container for organization location information
 * 
 * 
 * <p>
 * Java class for organization-address complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *  
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organization-address", propOrder = { "city", "region", "country" })
@XmlRootElement(name = "organizationAddress", namespace = "http://www.orcid.org/ns/common")
public class OrganizationAddress implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, namespace = "http://www.orcid.org/ns/common")
    protected String city;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected String region;
    @XmlElement(required = true, namespace = "http://www.orcid.org/ns/common")
    protected Iso3166Country country;

    /**
     * Gets the value of the city property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return possible object is {@link Iso3166Country }
     * 
     */
    public Iso3166Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *            allowed object is {@link Iso3166Country }
     * 
     */
    public void setCountry(Iso3166Country value) {
        this.country = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((region == null) ? 0 : region.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrganizationAddress other = (OrganizationAddress) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (country != other.country)
            return false;
        if (region == null) {
            if (other.region != null)
                return false;
        } else if (!region.equals(other.region))
            return false;
        return true;
    }

}
