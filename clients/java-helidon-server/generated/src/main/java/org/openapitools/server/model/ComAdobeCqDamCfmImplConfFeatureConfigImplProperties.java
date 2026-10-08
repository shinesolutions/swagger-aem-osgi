package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties   {

    private ConfigNodePropertyArray damCfmResourceTypes;
    private ConfigNodePropertyArray damCfmReferenceProperties;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.
     *
     * @param damCfmResourceTypes damCfmResourceTypes
     * @param damCfmReferenceProperties damCfmReferenceProperties
     */
    public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(
        ConfigNodePropertyArray damCfmResourceTypes, 
        ConfigNodePropertyArray damCfmReferenceProperties
    ) {
        this.damCfmResourceTypes = damCfmResourceTypes;
        this.damCfmReferenceProperties = damCfmReferenceProperties;
    }



    /**
     * Get damCfmResourceTypes
     * @return damCfmResourceTypes
     */
    public ConfigNodePropertyArray getDamCfmResourceTypes() {
        return damCfmResourceTypes;
    }

    public void setDamCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
        this.damCfmResourceTypes = damCfmResourceTypes;
    }

    /**
     * Get damCfmReferenceProperties
     * @return damCfmReferenceProperties
     */
    public ConfigNodePropertyArray getDamCfmReferenceProperties() {
        return damCfmReferenceProperties;
    }

    public void setDamCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
        this.damCfmReferenceProperties = damCfmReferenceProperties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {\n");
        
        sb.append("    damCfmResourceTypes: ").append(toIndentedString(damCfmResourceTypes)).append("\n");
        sb.append("    damCfmReferenceProperties: ").append(toIndentedString(damCfmReferenceProperties)).append("\n");
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

