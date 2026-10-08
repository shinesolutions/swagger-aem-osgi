package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties   {

    private ConfigNodePropertyArray replicateCommentResourceTypes;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.
     *
     * @param replicateCommentResourceTypes replicateCommentResourceTypes
     */
    public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(
        ConfigNodePropertyArray replicateCommentResourceTypes
    ) {
        this.replicateCommentResourceTypes = replicateCommentResourceTypes;
    }



    /**
     * Get replicateCommentResourceTypes
     * @return replicateCommentResourceTypes
     */
    public ConfigNodePropertyArray getReplicateCommentResourceTypes() {
        return replicateCommentResourceTypes;
    }

    public void setReplicateCommentResourceTypes(ConfigNodePropertyArray replicateCommentResourceTypes) {
        this.replicateCommentResourceTypes = replicateCommentResourceTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {\n");
        
        sb.append("    replicateCommentResourceTypes: ").append(toIndentedString(replicateCommentResourceTypes)).append("\n");
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

