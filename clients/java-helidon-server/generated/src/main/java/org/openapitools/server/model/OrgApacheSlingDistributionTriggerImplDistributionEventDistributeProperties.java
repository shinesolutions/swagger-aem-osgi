package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString path;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
     *
     * @param name name
     * @param path path
     */
    public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString path
    ) {
        this.name = name;
        this.path = path;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

