package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties   {

    private ConfigNodePropertyString authoringUIModeServiceDefault;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.
     *
     * @param authoringUIModeServiceDefault authoringUIModeServiceDefault
     */
    public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(
        ConfigNodePropertyString authoringUIModeServiceDefault
    ) {
        this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
    }



    /**
     * Get authoringUIModeServiceDefault
     * @return authoringUIModeServiceDefault
     */
    public ConfigNodePropertyString getAuthoringUIModeServiceDefault() {
        return authoringUIModeServiceDefault;
    }

    public void setAuthoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
        this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {\n");
        
        sb.append("    authoringUIModeServiceDefault: ").append(toIndentedString(authoringUIModeServiceDefault)).append("\n");
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

