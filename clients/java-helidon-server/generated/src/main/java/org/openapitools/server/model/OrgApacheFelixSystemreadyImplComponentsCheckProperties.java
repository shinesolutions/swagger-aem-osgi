package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixSystemreadyImplComponentsCheckProperties   {

    private ConfigNodePropertyArray componentsList;
    private ConfigNodePropertyDropDown type;

    /**
     * Default constructor.
     */
    public OrgApacheFelixSystemreadyImplComponentsCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixSystemreadyImplComponentsCheckProperties.
     *
     * @param componentsList componentsList
     * @param type type
     */
    public OrgApacheFelixSystemreadyImplComponentsCheckProperties(
        ConfigNodePropertyArray componentsList, 
        ConfigNodePropertyDropDown type
    ) {
        this.componentsList = componentsList;
        this.type = type;
    }



    /**
     * Get componentsList
     * @return componentsList
     */
    public ConfigNodePropertyArray getComponentsList() {
        return componentsList;
    }

    public void setComponentsList(ConfigNodePropertyArray componentsList) {
        this.componentsList = componentsList;
    }

    /**
     * Get type
     * @return type
     */
    public ConfigNodePropertyDropDown getType() {
        return type;
    }

    public void setType(ConfigNodePropertyDropDown type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixSystemreadyImplComponentsCheckProperties {\n");
        
        sb.append("    componentsList: ").append(toIndentedString(componentsList)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

