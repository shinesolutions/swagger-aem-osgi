package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties   {

    private ConfigNodePropertyArray alloweddataFileLocations;

    /**
     * Default constructor.
     */
    public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.
     *
     * @param alloweddataFileLocations alloweddataFileLocations
     */
    public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(
        ConfigNodePropertyArray alloweddataFileLocations
    ) {
        this.alloweddataFileLocations = alloweddataFileLocations;
    }



    /**
     * Get alloweddataFileLocations
     * @return alloweddataFileLocations
     */
    public ConfigNodePropertyArray getAlloweddataFileLocations() {
        return alloweddataFileLocations;
    }

    public void setAlloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
        this.alloweddataFileLocations = alloweddataFileLocations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {\n");
        
        sb.append("    alloweddataFileLocations: ").append(toIndentedString(alloweddataFileLocations)).append("\n");
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

