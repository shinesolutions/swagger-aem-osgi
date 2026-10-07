package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties   {

    private ConfigNodePropertyInteger maxSize;

    /**
     * Default constructor.
     */
    public OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.
     *
     * @param maxSize maxSize
     */
    public OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(
        ConfigNodePropertyInteger maxSize
    ) {
        this.maxSize = maxSize;
    }



    /**
     * Get maxSize
     * @return maxSize
     */
    public ConfigNodePropertyInteger getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(ConfigNodePropertyInteger maxSize) {
        this.maxSize = maxSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties {\n");
        
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
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

