package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties   {

    private ConfigNodePropertyArray defaultAttachmentTypeBlacklist;
    private ConfigNodePropertyArray baselineAttachmentTypeBlacklist;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.
     *
     * @param defaultAttachmentTypeBlacklist defaultAttachmentTypeBlacklist
     * @param baselineAttachmentTypeBlacklist baselineAttachmentTypeBlacklist
     */
    public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(
        ConfigNodePropertyArray defaultAttachmentTypeBlacklist, 
        ConfigNodePropertyArray baselineAttachmentTypeBlacklist
    ) {
        this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
        this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
    }



    /**
     * Get defaultAttachmentTypeBlacklist
     * @return defaultAttachmentTypeBlacklist
     */
    public ConfigNodePropertyArray getDefaultAttachmentTypeBlacklist() {
        return defaultAttachmentTypeBlacklist;
    }

    public void setDefaultAttachmentTypeBlacklist(ConfigNodePropertyArray defaultAttachmentTypeBlacklist) {
        this.defaultAttachmentTypeBlacklist = defaultAttachmentTypeBlacklist;
    }

    /**
     * Get baselineAttachmentTypeBlacklist
     * @return baselineAttachmentTypeBlacklist
     */
    public ConfigNodePropertyArray getBaselineAttachmentTypeBlacklist() {
        return baselineAttachmentTypeBlacklist;
    }

    public void setBaselineAttachmentTypeBlacklist(ConfigNodePropertyArray baselineAttachmentTypeBlacklist) {
        this.baselineAttachmentTypeBlacklist = baselineAttachmentTypeBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {\n");
        
        sb.append("    defaultAttachmentTypeBlacklist: ").append(toIndentedString(defaultAttachmentTypeBlacklist)).append("\n");
        sb.append("    baselineAttachmentTypeBlacklist: ").append(toIndentedString(baselineAttachmentTypeBlacklist)).append("\n");
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

