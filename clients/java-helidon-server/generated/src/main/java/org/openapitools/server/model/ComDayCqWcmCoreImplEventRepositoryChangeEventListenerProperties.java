package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties   {

    private ConfigNodePropertyArray paths;
    private ConfigNodePropertyArray excludedPaths;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.
     *
     * @param paths paths
     * @param excludedPaths excludedPaths
     */
    public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(
        ConfigNodePropertyArray paths, 
        ConfigNodePropertyArray excludedPaths
    ) {
        this.paths = paths;
        this.excludedPaths = excludedPaths;
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
     * Get excludedPaths
     * @return excludedPaths
     */
    public ConfigNodePropertyArray getExcludedPaths() {
        return excludedPaths;
    }

    public void setExcludedPaths(ConfigNodePropertyArray excludedPaths) {
        this.excludedPaths = excludedPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {\n");
        
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    excludedPaths: ").append(toIndentedString(excludedPaths)).append("\n");
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

