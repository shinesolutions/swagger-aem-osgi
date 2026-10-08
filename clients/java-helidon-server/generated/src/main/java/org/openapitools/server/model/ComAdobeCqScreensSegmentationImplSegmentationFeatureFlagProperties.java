package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties   {

    private ConfigNodePropertyBoolean enableDataTriggeredContent;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.
     *
     * @param enableDataTriggeredContent enableDataTriggeredContent
     */
    public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(
        ConfigNodePropertyBoolean enableDataTriggeredContent
    ) {
        this.enableDataTriggeredContent = enableDataTriggeredContent;
    }



    /**
     * Get enableDataTriggeredContent
     * @return enableDataTriggeredContent
     */
    public ConfigNodePropertyBoolean getEnableDataTriggeredContent() {
        return enableDataTriggeredContent;
    }

    public void setEnableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent) {
        this.enableDataTriggeredContent = enableDataTriggeredContent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {\n");
        
        sb.append("    enableDataTriggeredContent: ").append(toIndentedString(enableDataTriggeredContent)).append("\n");
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

