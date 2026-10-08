package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyString checkpathPrefix;
    private ConfigNodePropertyString jcrPath;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
     *
     * @param path path
     * @param checkpathPrefix checkpathPrefix
     * @param jcrPath jcrPath
     */
    public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyString checkpathPrefix, 
        ConfigNodePropertyString jcrPath
    ) {
        this.path = path;
        this.checkpathPrefix = checkpathPrefix;
        this.jcrPath = jcrPath;
    }



    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
     * Get checkpathPrefix
     * @return checkpathPrefix
     */
    public ConfigNodePropertyString getCheckpathPrefix() {
        return checkpathPrefix;
    }

    public void setCheckpathPrefix(ConfigNodePropertyString checkpathPrefix) {
        this.checkpathPrefix = checkpathPrefix;
    }

    /**
     * Get jcrPath
     * @return jcrPath
     */
    public ConfigNodePropertyString getJcrPath() {
        return jcrPath;
    }

    public void setJcrPath(ConfigNodePropertyString jcrPath) {
        this.jcrPath = jcrPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    checkpathPrefix: ").append(toIndentedString(checkpathPrefix)).append("\n");
        sb.append("    jcrPath: ").append(toIndentedString(jcrPath)).append("\n");
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

