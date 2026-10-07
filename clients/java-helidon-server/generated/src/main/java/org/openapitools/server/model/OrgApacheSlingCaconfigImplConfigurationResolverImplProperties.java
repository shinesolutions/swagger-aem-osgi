package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties   {

    private ConfigNodePropertyArray configBucketNames;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.
     *
     * @param configBucketNames configBucketNames
     */
    public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(
        ConfigNodePropertyArray configBucketNames
    ) {
        this.configBucketNames = configBucketNames;
    }



    /**
     * Get configBucketNames
     * @return configBucketNames
     */
    public ConfigNodePropertyArray getConfigBucketNames() {
        return configBucketNames;
    }

    public void setConfigBucketNames(ConfigNodePropertyArray configBucketNames) {
        this.configBucketNames = configBucketNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {\n");
        
        sb.append("    configBucketNames: ").append(toIndentedString(configBucketNames)).append("\n");
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

