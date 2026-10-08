package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEventImplEventingThreadPoolProperties   {

    private ConfigNodePropertyInteger minPoolSize;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEventImplEventingThreadPoolProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEventImplEventingThreadPoolProperties.
     *
     * @param minPoolSize minPoolSize
     */
    public OrgApacheSlingEventImplEventingThreadPoolProperties(
        ConfigNodePropertyInteger minPoolSize
    ) {
        this.minPoolSize = minPoolSize;
    }



    /**
     * Get minPoolSize
     * @return minPoolSize
     */
    public ConfigNodePropertyInteger getMinPoolSize() {
        return minPoolSize;
    }

    public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
        this.minPoolSize = minPoolSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEventImplEventingThreadPoolProperties {\n");
        
        sb.append("    minPoolSize: ").append(toIndentedString(minPoolSize)).append("\n");
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

