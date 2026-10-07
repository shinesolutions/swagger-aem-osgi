package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties   {

    private ConfigNodePropertyInteger numberOfRetriesAllowed;
    private ConfigNodePropertyArray hcTags;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.
     *
     * @param numberOfRetriesAllowed numberOfRetriesAllowed
     * @param hcTags hcTags
     */
    public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(
        ConfigNodePropertyInteger numberOfRetriesAllowed, 
        ConfigNodePropertyArray hcTags
    ) {
        this.numberOfRetriesAllowed = numberOfRetriesAllowed;
        this.hcTags = hcTags;
    }



    /**
     * Get numberOfRetriesAllowed
     * @return numberOfRetriesAllowed
     */
    public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
        return numberOfRetriesAllowed;
    }

    public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
        this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    }

    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {\n");
        
        sb.append("    numberOfRetriesAllowed: ").append(toIndentedString(numberOfRetriesAllowed)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

