package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplServletsThumbnailServletProperties   {

    private ConfigNodePropertyString workspace;
    private ConfigNodePropertyArray dimensions;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplServletsThumbnailServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplServletsThumbnailServletProperties.
     *
     * @param workspace workspace
     * @param dimensions dimensions
     */
    public ComDayCqWcmCoreImplServletsThumbnailServletProperties(
        ConfigNodePropertyString workspace, 
        ConfigNodePropertyArray dimensions
    ) {
        this.workspace = workspace;
        this.dimensions = dimensions;
    }



    /**
     * Get workspace
     * @return workspace
     */
    public ConfigNodePropertyString getWorkspace() {
        return workspace;
    }

    public void setWorkspace(ConfigNodePropertyString workspace) {
        this.workspace = workspace;
    }

    /**
     * Get dimensions
     * @return dimensions
     */
    public ConfigNodePropertyArray getDimensions() {
        return dimensions;
    }

    public void setDimensions(ConfigNodePropertyArray dimensions) {
        this.dimensions = dimensions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplServletsThumbnailServletProperties {\n");
        
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

