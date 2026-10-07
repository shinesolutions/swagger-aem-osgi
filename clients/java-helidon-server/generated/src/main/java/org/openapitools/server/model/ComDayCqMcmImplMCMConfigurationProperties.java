package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMcmImplMCMConfigurationProperties   {

    private ConfigNodePropertyArray experienceIndirection;
    private ConfigNodePropertyArray touchpointIndirection;

    /**
     * Default constructor.
     */
    public ComDayCqMcmImplMCMConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMcmImplMCMConfigurationProperties.
     *
     * @param experienceIndirection experienceIndirection
     * @param touchpointIndirection touchpointIndirection
     */
    public ComDayCqMcmImplMCMConfigurationProperties(
        ConfigNodePropertyArray experienceIndirection, 
        ConfigNodePropertyArray touchpointIndirection
    ) {
        this.experienceIndirection = experienceIndirection;
        this.touchpointIndirection = touchpointIndirection;
    }



    /**
     * Get experienceIndirection
     * @return experienceIndirection
     */
    public ConfigNodePropertyArray getExperienceIndirection() {
        return experienceIndirection;
    }

    public void setExperienceIndirection(ConfigNodePropertyArray experienceIndirection) {
        this.experienceIndirection = experienceIndirection;
    }

    /**
     * Get touchpointIndirection
     * @return touchpointIndirection
     */
    public ConfigNodePropertyArray getTouchpointIndirection() {
        return touchpointIndirection;
    }

    public void setTouchpointIndirection(ConfigNodePropertyArray touchpointIndirection) {
        this.touchpointIndirection = touchpointIndirection;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMcmImplMCMConfigurationProperties {\n");
        
        sb.append("    experienceIndirection: ").append(toIndentedString(experienceIndirection)).append("\n");
        sb.append("    touchpointIndirection: ").append(toIndentedString(touchpointIndirection)).append("\n");
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

