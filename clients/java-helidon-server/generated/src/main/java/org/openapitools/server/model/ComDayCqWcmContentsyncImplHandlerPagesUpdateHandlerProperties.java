package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties   {

    private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes;

    /**
     * Default constructor.
     */
    public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.
     *
     * @param cqPagesupdatehandlerImageresourcetypes cqPagesupdatehandlerImageresourcetypes
     */
    public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(
        ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes
    ) {
        this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    }



    /**
     * Get cqPagesupdatehandlerImageresourcetypes
     * @return cqPagesupdatehandlerImageresourcetypes
     */
    public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
        return cqPagesupdatehandlerImageresourcetypes;
    }

    public void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
        this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {\n");
        
        sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
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

