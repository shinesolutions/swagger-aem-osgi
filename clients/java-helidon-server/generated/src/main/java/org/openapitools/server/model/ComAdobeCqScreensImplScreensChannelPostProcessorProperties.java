package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensImplScreensChannelPostProcessorProperties   {

    private ConfigNodePropertyArray screensChannelsPropertiesToRemove;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensImplScreensChannelPostProcessorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensImplScreensChannelPostProcessorProperties.
     *
     * @param screensChannelsPropertiesToRemove screensChannelsPropertiesToRemove
     */
    public ComAdobeCqScreensImplScreensChannelPostProcessorProperties(
        ConfigNodePropertyArray screensChannelsPropertiesToRemove
    ) {
        this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
    }



    /**
     * Get screensChannelsPropertiesToRemove
     * @return screensChannelsPropertiesToRemove
     */
    public ConfigNodePropertyArray getScreensChannelsPropertiesToRemove() {
        return screensChannelsPropertiesToRemove;
    }

    public void setScreensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
        this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensImplScreensChannelPostProcessorProperties {\n");
        
        sb.append("    screensChannelsPropertiesToRemove: ").append(toIndentedString(screensChannelsPropertiesToRemove)).append("\n");
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

