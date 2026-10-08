package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties   {

    private ConfigNodePropertyArray contentReferenceConfigResourceTypes;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.
     *
     * @param contentReferenceConfigResourceTypes contentReferenceConfigResourceTypes
     */
    public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(
        ConfigNodePropertyArray contentReferenceConfigResourceTypes
    ) {
        this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
    }



    /**
     * Get contentReferenceConfigResourceTypes
     * @return contentReferenceConfigResourceTypes
     */
    public ConfigNodePropertyArray getContentReferenceConfigResourceTypes() {
        return contentReferenceConfigResourceTypes;
    }

    public void setContentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
        this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties {\n");
        
        sb.append("    contentReferenceConfigResourceTypes: ").append(toIndentedString(contentReferenceConfigResourceTypes)).append("\n");
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

