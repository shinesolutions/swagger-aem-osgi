package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties   {

    private ConfigNodePropertyInteger maxRetry;
    private ConfigNodePropertyArray fieldWhitelist;
    private ConfigNodePropertyArray attachmentTypeBlacklist;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
     *
     * @param maxRetry maxRetry
     * @param fieldWhitelist fieldWhitelist
     * @param attachmentTypeBlacklist attachmentTypeBlacklist
     */
    public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(
        ConfigNodePropertyInteger maxRetry, 
        ConfigNodePropertyArray fieldWhitelist, 
        ConfigNodePropertyArray attachmentTypeBlacklist
    ) {
        this.maxRetry = maxRetry;
        this.fieldWhitelist = fieldWhitelist;
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    }



    /**
     * Get maxRetry
     * @return maxRetry
     */
    public ConfigNodePropertyInteger getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(ConfigNodePropertyInteger maxRetry) {
        this.maxRetry = maxRetry;
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
        sb.append("class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {\n");
        
        sb.append("    maxRetry: ").append(toIndentedString(maxRetry)).append("\n");
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

