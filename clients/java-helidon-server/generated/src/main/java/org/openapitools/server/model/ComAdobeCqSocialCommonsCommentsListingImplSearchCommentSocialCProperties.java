package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties   {

    private ConfigNodePropertyInteger numUserLimit;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.
     *
     * @param numUserLimit numUserLimit
     */
    public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(
        ConfigNodePropertyInteger numUserLimit
    ) {
        this.numUserLimit = numUserLimit;
    }



    /**
     * Get numUserLimit
     * @return numUserLimit
     */
    public ConfigNodePropertyInteger getNumUserLimit() {
        return numUserLimit;
    }

    public void setNumUserLimit(ConfigNodePropertyInteger numUserLimit) {
        this.numUserLimit = numUserLimit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {\n");
        
        sb.append("    numUserLimit: ").append(toIndentedString(numUserLimit)).append("\n");
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

