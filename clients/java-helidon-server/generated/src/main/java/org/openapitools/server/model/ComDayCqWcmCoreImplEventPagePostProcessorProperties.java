package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplEventPagePostProcessorProperties   {

    private ConfigNodePropertyArray paths;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplEventPagePostProcessorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplEventPagePostProcessorProperties.
     *
     * @param paths paths
     */
    public ComDayCqWcmCoreImplEventPagePostProcessorProperties(
        ConfigNodePropertyArray paths
    ) {
        this.paths = paths;
    }



    /**
     * Get paths
     * @return paths
     */
    public ConfigNodePropertyArray getPaths() {
        return paths;
    }

    public void setPaths(ConfigNodePropertyArray paths) {
        this.paths = paths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplEventPagePostProcessorProperties {\n");
        
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

