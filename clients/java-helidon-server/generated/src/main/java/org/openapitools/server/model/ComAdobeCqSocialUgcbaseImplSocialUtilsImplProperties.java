package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties   {

    private ConfigNodePropertyBoolean legacyCloudUGCPathMapping;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.
     *
     * @param legacyCloudUGCPathMapping legacyCloudUGCPathMapping
     */
    public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(
        ConfigNodePropertyBoolean legacyCloudUGCPathMapping
    ) {
        this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
    }



    /**
     * Get legacyCloudUGCPathMapping
     * @return legacyCloudUGCPathMapping
     */
    public ConfigNodePropertyBoolean getLegacyCloudUGCPathMapping() {
        return legacyCloudUGCPathMapping;
    }

    public void setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
        this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {\n");
        
        sb.append("    legacyCloudUGCPathMapping: ").append(toIndentedString(legacyCloudUGCPathMapping)).append("\n");
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

