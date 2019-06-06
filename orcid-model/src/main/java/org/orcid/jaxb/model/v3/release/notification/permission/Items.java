//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 04:27:39 PM GMT 
//

package org.orcid.jaxb.model.v3.release.notification.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}item" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "items" })
@XmlRootElement(name = "items", namespace = "http://www.orcid.org/ns/notification")
@ApiModel(value = "ItemsV3_0")
public class Items implements Serializable {
    private static final long serialVersionUID = 2144964881656002779L;
    @XmlElement(name = "item", namespace = "http://www.orcid.org/ns/notification", required = true)
    protected List<Item> items;

    public Items() {
    }

    public Items(List<Item> items) {
        this.items = items;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items= new ArrayList<Item>();
        }
        return this.items;
    }

    @XmlTransient
    @JsonIgnore
    public Map<String, List<Item>> getItemsByType() {
        Map<String, List<Item>> itemsMap = new HashMap<>();
        if (items != null) {
            for (Item item : items) {
                ItemType activityType = item.getItemType();
                String key = activityType.name();
                List<Item> activitiesForType = itemsMap.get(key);
                if (activitiesForType == null) {
                    activitiesForType = new ArrayList<>();
                    itemsMap.put(key, activitiesForType);
                }
                activitiesForType.add(item);
            }
        }
        return itemsMap;
    }

}