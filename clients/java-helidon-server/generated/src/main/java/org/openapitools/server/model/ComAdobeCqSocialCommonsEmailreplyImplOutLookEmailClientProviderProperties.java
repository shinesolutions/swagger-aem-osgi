package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties   {

    private ConfigNodePropertyInteger priorityOrder;
    private ConfigNodePropertyArray replyEmailPatterns;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.
     *
     * @param priorityOrder priorityOrder
     * @param replyEmailPatterns replyEmailPatterns
     */
    public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties(
        ConfigNodePropertyInteger priorityOrder, 
        ConfigNodePropertyArray replyEmailPatterns
    ) {
        this.priorityOrder = priorityOrder;
        this.replyEmailPatterns = replyEmailPatterns;
    }



    /**
     * Get priorityOrder
     * @return priorityOrder
     */
    public ConfigNodePropertyInteger getPriorityOrder() {
        return priorityOrder;
    }

    public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
        this.priorityOrder = priorityOrder;
    }

    /**
     * Get replyEmailPatterns
     * @return replyEmailPatterns
     */
    public ConfigNodePropertyArray getReplyEmailPatterns() {
        return replyEmailPatterns;
    }

    public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
        this.replyEmailPatterns = replyEmailPatterns;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties {\n");
        
        sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
        sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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

