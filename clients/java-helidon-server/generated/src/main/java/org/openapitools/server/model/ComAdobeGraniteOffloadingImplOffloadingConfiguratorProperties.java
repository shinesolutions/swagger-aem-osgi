package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties   {

    private ConfigNodePropertyString offloadingTransporter;
    private ConfigNodePropertyBoolean offloadingCleanupPayload;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.
     *
     * @param offloadingTransporter offloadingTransporter
     * @param offloadingCleanupPayload offloadingCleanupPayload
     */
    public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(
        ConfigNodePropertyString offloadingTransporter, 
        ConfigNodePropertyBoolean offloadingCleanupPayload
    ) {
        this.offloadingTransporter = offloadingTransporter;
        this.offloadingCleanupPayload = offloadingCleanupPayload;
    }



    /**
     * Get offloadingTransporter
     * @return offloadingTransporter
     */
    public ConfigNodePropertyString getOffloadingTransporter() {
        return offloadingTransporter;
    }

    public void setOffloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
        this.offloadingTransporter = offloadingTransporter;
    }

    /**
     * Get offloadingCleanupPayload
     * @return offloadingCleanupPayload
     */
    public ConfigNodePropertyBoolean getOffloadingCleanupPayload() {
        return offloadingCleanupPayload;
    }

    public void setOffloadingCleanupPayload(ConfigNodePropertyBoolean offloadingCleanupPayload) {
        this.offloadingCleanupPayload = offloadingCleanupPayload;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {\n");
        
        sb.append("    offloadingTransporter: ").append(toIndentedString(offloadingTransporter)).append("\n");
        sb.append("    offloadingCleanupPayload: ").append(toIndentedString(offloadingCleanupPayload)).append("\n");
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

