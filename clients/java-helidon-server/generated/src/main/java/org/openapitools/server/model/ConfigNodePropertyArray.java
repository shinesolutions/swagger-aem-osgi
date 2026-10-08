package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConfigNodePropertyArray   {

    private String name;
    private Boolean optional;
    private Boolean isSet;
    private Integer type;
    private List<String> values = new ArrayList<>();
    private String description;

    /**
     * Default constructor.
     */
    public ConfigNodePropertyArray() {
    // JSON-B / Jackson
    }

    /**
     * Create ConfigNodePropertyArray.
     *
     * @param name property name
     * @param optional True if optional
     * @param isSet True if property is set
     * @param type Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
     * @param values Property value
     * @param description Property description
     */
    public ConfigNodePropertyArray(
        String name, 
        Boolean optional, 
        Boolean isSet, 
        Integer type, 
        List<String> values, 
        String description
    ) {
        this.name = name;
        this.optional = optional;
        this.isSet = isSet;
        this.type = type;
        this.values = values;
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
     * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Property value
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
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
        sb.append("class ConfigNodePropertyArray {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

