package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties   {

    private ConfigNodePropertyString adapterCondition;
    private ConfigNodePropertyArray graniteUserpropertiesNodetypes;
    private ConfigNodePropertyArray graniteUserpropertiesResourcetypes;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.
     *
     * @param adapterCondition adapterCondition
     * @param graniteUserpropertiesNodetypes graniteUserpropertiesNodetypes
     * @param graniteUserpropertiesResourcetypes graniteUserpropertiesResourcetypes
     */
    public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(
        ConfigNodePropertyString adapterCondition, 
        ConfigNodePropertyArray graniteUserpropertiesNodetypes, 
        ConfigNodePropertyArray graniteUserpropertiesResourcetypes
    ) {
        this.adapterCondition = adapterCondition;
        this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
        this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
    }



    /**
     * Get adapterCondition
     * @return adapterCondition
     */
    public ConfigNodePropertyString getAdapterCondition() {
        return adapterCondition;
    }

    public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
        this.adapterCondition = adapterCondition;
    }

    /**
     * Get graniteUserpropertiesNodetypes
     * @return graniteUserpropertiesNodetypes
     */
    public ConfigNodePropertyArray getGraniteUserpropertiesNodetypes() {
        return graniteUserpropertiesNodetypes;
    }

    public void setGraniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
        this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
    }

    /**
     * Get graniteUserpropertiesResourcetypes
     * @return graniteUserpropertiesResourcetypes
     */
    public ConfigNodePropertyArray getGraniteUserpropertiesResourcetypes() {
        return graniteUserpropertiesResourcetypes;
    }

    public void setGraniteUserpropertiesResourcetypes(ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
        this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {\n");
        
        sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
        sb.append("    graniteUserpropertiesNodetypes: ").append(toIndentedString(graniteUserpropertiesNodetypes)).append("\n");
        sb.append("    graniteUserpropertiesResourcetypes: ").append(toIndentedString(graniteUserpropertiesResourcetypes)).append("\n");
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

