package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties   {

    private ConfigNodePropertyInteger maxRecursionLevels;

    /**
     * Default constructor.
     */
    public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.
     *
     * @param maxRecursionLevels maxRecursionLevels
     */
    public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(
        ConfigNodePropertyInteger maxRecursionLevels
    ) {
        this.maxRecursionLevels = maxRecursionLevels;
    }



    /**
     * Get maxRecursionLevels
     * @return maxRecursionLevels
     */
    public ConfigNodePropertyInteger getMaxRecursionLevels() {
        return maxRecursionLevels;
    }

    public void setMaxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
        this.maxRecursionLevels = maxRecursionLevels;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {\n");
        
        sb.append("    maxRecursionLevels: ").append(toIndentedString(maxRecursionLevels)).append("\n");
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

