package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties   {

    private ConfigNodePropertyString group;
    private ConfigNodePropertyArray ids;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.
     *
     * @param group group
     * @param ids ids
     */
    public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(
        ConfigNodePropertyString group, 
        ConfigNodePropertyArray ids
    ) {
        this.group = group;
        this.ids = ids;
    }



    /**
     * Get group
     * @return group
     */
    public ConfigNodePropertyString getGroup() {
        return group;
    }

    public void setGroup(ConfigNodePropertyString group) {
        this.group = group;
    }

    /**
     * Get ids
     * @return ids
     */
    public ConfigNodePropertyArray getIds() {
        return ids;
    }

    public void setIds(ConfigNodePropertyArray ids) {
        this.ids = ids;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {\n");
        
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

