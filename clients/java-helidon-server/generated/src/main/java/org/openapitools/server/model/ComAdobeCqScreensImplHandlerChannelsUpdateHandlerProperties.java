package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties   {

    private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes;
    private ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes;
    private ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes;
    private ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes;
    private ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
     *
     * @param cqPagesupdatehandlerImageresourcetypes cqPagesupdatehandlerImageresourcetypes
     * @param cqPagesupdatehandlerProductresourcetypes cqPagesupdatehandlerProductresourcetypes
     * @param cqPagesupdatehandlerVideoresourcetypes cqPagesupdatehandlerVideoresourcetypes
     * @param cqPagesupdatehandlerDynamicsequenceresourcetypes cqPagesupdatehandlerDynamicsequenceresourcetypes
     * @param cqPagesupdatehandlerPreviewmodepaths cqPagesupdatehandlerPreviewmodepaths
     */
    public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(
        ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes, 
        ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes, 
        ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes, 
        ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes, 
        ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths
    ) {
        this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
        this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
        this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
        this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
        this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
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
     * Get cqPagesupdatehandlerProductresourcetypes
     * @return cqPagesupdatehandlerProductresourcetypes
     */
    public ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
        return cqPagesupdatehandlerProductresourcetypes;
    }

    public void setCqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
        this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
    }

    /**
     * Get cqPagesupdatehandlerVideoresourcetypes
     * @return cqPagesupdatehandlerVideoresourcetypes
     */
    public ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
        return cqPagesupdatehandlerVideoresourcetypes;
    }

    public void setCqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
        this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
    }

    /**
     * Get cqPagesupdatehandlerDynamicsequenceresourcetypes
     * @return cqPagesupdatehandlerDynamicsequenceresourcetypes
     */
    public ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
        return cqPagesupdatehandlerDynamicsequenceresourcetypes;
    }

    public void setCqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
        this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
    }

    /**
     * Get cqPagesupdatehandlerPreviewmodepaths
     * @return cqPagesupdatehandlerPreviewmodepaths
     */
    public ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
        return cqPagesupdatehandlerPreviewmodepaths;
    }

    public void setCqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
        this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {\n");
        
        sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
        sb.append("    cqPagesupdatehandlerProductresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerProductresourcetypes)).append("\n");
        sb.append("    cqPagesupdatehandlerVideoresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerVideoresourcetypes)).append("\n");
        sb.append("    cqPagesupdatehandlerDynamicsequenceresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerDynamicsequenceresourcetypes)).append("\n");
        sb.append("    cqPagesupdatehandlerPreviewmodepaths: ").append(toIndentedString(cqPagesupdatehandlerPreviewmodepaths)).append("\n");
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

