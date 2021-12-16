/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.commonservices.ffdc.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;


/**
 * NameRequestBody is the request body structure used on OMAG REST API calls that passes a name that is used to retrieve
 * an element by name.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class NameRequestBody implements Serializable
{
    private static final long    serialVersionUID = 1L;

    private Date   effectiveTime = null;
    private String name = null;
    private String nameParameterName = null;
    private String namePropertyName = null;


    /**
     * Default constructor
     */
    public NameRequestBody()
    {
        super();
    }


    /**
     * Copy/clone constructor
     *
     * @param template object to copy
     */
    public NameRequestBody(NameRequestBody template)
    {
        if (template != null)
        {
            effectiveTime = template.getEffectiveTime();
            name = template.getName();
            nameParameterName = template.getNameParameterName();
            namePropertyName = template.getNamePropertyName();
        }
    }


    /**
     * Return the date/time to use for the query.
     *
     * @return date object
     */
    public Date getEffectiveTime()
    {
        return effectiveTime;
    }


    /**
     * Set up  the date/time to use for the query.
     *
     * @param effectiveTime date object
     */
    public void setEffectiveTime(Date effectiveTime)
    {
        this.effectiveTime = effectiveTime;
    }


    /**
     * Return the name for the query request.
     *
     * @return string name
     */
    public String getName()
    {
        return name;
    }


    /**
     * Set up the name for the query request.
     *
     * @param name string
     */
    public void setName(String name)
    {
        this.name = name;
    }


    /**
     * Return the parameter name.
     *
     * @return string name
     */
    public String getNameParameterName()
    {
        return nameParameterName;
    }


    /**
     * Set up the parameter name.
     *
     * @param nameParameterName string
     */
    public void setNameParameterName(String nameParameterName)
    {
        this.nameParameterName = nameParameterName;
    }


    /**
     * Return the property name from the open metadata types.
     *
     * @return string name
     */
    public String getNamePropertyName()
    {
        return namePropertyName;
    }


    /**
     * Set up the property name from the open metadata types.
     *
     * @param namePropertyName string
     */
    public void setNamePropertyName(String namePropertyName)
    {
        this.namePropertyName = namePropertyName;
    }


    /**
     * Standard toString method.
     *
     * @return print out of variables in a JSON-style
     */
    @Override
    public String toString()
    {
        return "NameRequestBody{" +
                       "effectiveTime=" + effectiveTime +
                       ", name='" + name + '\'' +
                       ", nameParameterName='" + nameParameterName + '\'' +
                       ", namePropertyName='" + namePropertyName + '\'' +
                       '}';
    }


    /**
     * Compare the values of the supplied object with those stored in the current object.
     *
     * @param objectToCompare supplied object
     * @return boolean result of comparison
     */
    @Override
    public boolean equals(Object objectToCompare)
    {
        if (this == objectToCompare)
        {
            return true;
        }
        if (objectToCompare == null || getClass() != objectToCompare.getClass())
        {
            return false;
        }
        NameRequestBody that = (NameRequestBody) objectToCompare;
        return Objects.equals(effectiveTime, that.effectiveTime) &&
                       Objects.equals(name, that.name) &&
                       Objects.equals(nameParameterName, that.nameParameterName) &&
                       Objects.equals(namePropertyName, that.namePropertyName);
    }


    /**
     * Create a hash code for this element type.
     *
     * @return int hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(effectiveTime, name, nameParameterName, namePropertyName);
    }
}
