package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMailerImplCqMailingServiceProperties   {

    private ConfigNodePropertyString maxRecipientCount;

    /**
     * Default constructor.
     */
    public ComDayCqMailerImplCqMailingServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMailerImplCqMailingServiceProperties.
     *
     * @param maxRecipientCount maxRecipientCount
     */
    public ComDayCqMailerImplCqMailingServiceProperties(
        ConfigNodePropertyString maxRecipientCount
    ) {
        this.maxRecipientCount = maxRecipientCount;
    }



    /**
     * Get maxRecipientCount
     * @return maxRecipientCount
     */
    public ConfigNodePropertyString getMaxRecipientCount() {
        return maxRecipientCount;
    }

    public void setMaxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
        this.maxRecipientCount = maxRecipientCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMailerImplCqMailingServiceProperties {\n");
        
        sb.append("    maxRecipientCount: ").append(toIndentedString(maxRecipientCount)).append("\n");
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

