package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties   {

    private ConfigNodePropertyString id;
    private ConfigNodePropertyString compatPath;
    private ConfigNodePropertyString newPath;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCompatrouterImplRoutingConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCompatrouterImplRoutingConfigProperties.
     *
     * @param id id
     * @param compatPath compatPath
     * @param newPath newPath
     */
    public ComAdobeGraniteCompatrouterImplRoutingConfigProperties(
        ConfigNodePropertyString id, 
        ConfigNodePropertyString compatPath, 
        ConfigNodePropertyString newPath
    ) {
        this.id = id;
        this.compatPath = compatPath;
        this.newPath = newPath;
    }



    /**
     * Get id
     * @return id
     */
    public ConfigNodePropertyString getId() {
        return id;
    }

    public void setId(ConfigNodePropertyString id) {
        this.id = id;
    }

    /**
     * Get compatPath
     * @return compatPath
     */
    public ConfigNodePropertyString getCompatPath() {
        return compatPath;
    }

    public void setCompatPath(ConfigNodePropertyString compatPath) {
        this.compatPath = compatPath;
    }

    /**
     * Get newPath
     * @return newPath
     */
    public ConfigNodePropertyString getNewPath() {
        return newPath;
    }

    public void setNewPath(ConfigNodePropertyString newPath) {
        this.newPath = newPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    compatPath: ").append(toIndentedString(compatPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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

