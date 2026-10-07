package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties   {

    private ConfigNodePropertyArray fieldWhitelist;
    private ConfigNodePropertyArray attachmentTypeBlacklist;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.
     *
     * @param fieldWhitelist fieldWhitelist
     * @param attachmentTypeBlacklist attachmentTypeBlacklist
     */
    public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties(
        ConfigNodePropertyArray fieldWhitelist, 
        ConfigNodePropertyArray attachmentTypeBlacklist
    ) {
        this.fieldWhitelist = fieldWhitelist;
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
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
     * Get attachmentTypeBlacklist
     * @return attachmentTypeBlacklist
     */
    public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
        return attachmentTypeBlacklist;
    }

    public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties {\n");
        
        sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
        sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
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

