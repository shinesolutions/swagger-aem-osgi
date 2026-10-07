package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ConfigNodePropertyDropDownType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConfigNodePropertyDropDown   {

    private String name;
    private Boolean optional;
    private Boolean isSet;
    private ConfigNodePropertyDropDownType type;
    private Object value = null;
    private String description;

    /**
     * Default constructor.
     */
    public ConfigNodePropertyDropDown() {
    // JSON-B / Jackson
    }

    /**
     * Create ConfigNodePropertyDropDown.
     *
     * @param name property name
     * @param optional True if optional
     * @param isSet True if property is set
     * @param type type
     * @param value Property value
     * @param description Property description
     */
    public ConfigNodePropertyDropDown(
        String name, 
        Boolean optional, 
        Boolean isSet, 
        ConfigNodePropertyDropDownType type, 
        Object value, 
        String description
    ) {
        this.name = name;
        this.optional = optional;
        this.isSet = isSet;
        this.type = type;
        this.value = value;
        this.description = description;
    }



    /**
     * property name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * True if optional
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * True if property is set
     * @return isSet
     */
    public Boolean getIsSet() {
        return isSet;
    }

    public void setIsSet(Boolean isSet) {
        this.isSet = isSet;
    }

    /**
     * Get type
     * @return type
     */
    public ConfigNodePropertyDropDownType getType() {
        return type;
    }

    public void setType(ConfigNodePropertyDropDownType type) {
        this.type = type;
    }

    /**
     * Property value
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Property description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigNodePropertyDropDown {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

