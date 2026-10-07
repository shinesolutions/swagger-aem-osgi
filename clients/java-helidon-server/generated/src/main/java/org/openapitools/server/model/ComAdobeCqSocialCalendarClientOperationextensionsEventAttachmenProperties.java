package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties   {

    private ConfigNodePropertyString attachmentTypeBlacklist;
    private ConfigNodePropertyInteger extensionOrder;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
     *
     * @param attachmentTypeBlacklist attachmentTypeBlacklist
     * @param extensionOrder extensionOrder
     */
    public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(
        ConfigNodePropertyString attachmentTypeBlacklist, 
        ConfigNodePropertyInteger extensionOrder
    ) {
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
        this.extensionOrder = extensionOrder;
    }



    /**
     * Get attachmentTypeBlacklist
     * @return attachmentTypeBlacklist
     */
    public ConfigNodePropertyString getAttachmentTypeBlacklist() {
        return attachmentTypeBlacklist;
    }

    public void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist) {
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    }

    /**
     * Get extensionOrder
     * @return extensionOrder
     */
    public ConfigNodePropertyInteger getExtensionOrder() {
        return extensionOrder;
    }

    public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
        this.extensionOrder = extensionOrder;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {\n");
        
        sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
        sb.append("    extensionOrder: ").append(toIndentedString(extensionOrder)).append("\n");
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

