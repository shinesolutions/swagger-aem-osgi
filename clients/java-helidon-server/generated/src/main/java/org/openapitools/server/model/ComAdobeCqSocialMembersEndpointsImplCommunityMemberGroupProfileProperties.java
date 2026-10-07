package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties   {

    private ConfigNodePropertyArray fieldWhitelist;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.
     *
     * @param fieldWhitelist fieldWhitelist
     */
    public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(
        ConfigNodePropertyArray fieldWhitelist
    ) {
        this.fieldWhitelist = fieldWhitelist;
    }



    /**
     * Get fieldWhitelist
     * @return fieldWhitelist
     */
    public ConfigNodePropertyArray getFieldWhitelist() {
        return fieldWhitelist;
    }

    public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
        this.fieldWhitelist = fieldWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties {\n");
        
        sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
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

