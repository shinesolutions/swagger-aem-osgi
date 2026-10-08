package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties   {

    private ConfigNodePropertyInteger felixMemoryusageDumpThreshold;
    private ConfigNodePropertyInteger felixMemoryusageDumpInterval;
    private ConfigNodePropertyString felixMemoryusageDumpLocation;

    /**
     * Default constructor.
     */
    public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.
     *
     * @param felixMemoryusageDumpThreshold felixMemoryusageDumpThreshold
     * @param felixMemoryusageDumpInterval felixMemoryusageDumpInterval
     * @param felixMemoryusageDumpLocation felixMemoryusageDumpLocation
     */
    public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(
        ConfigNodePropertyInteger felixMemoryusageDumpThreshold, 
        ConfigNodePropertyInteger felixMemoryusageDumpInterval, 
        ConfigNodePropertyString felixMemoryusageDumpLocation
    ) {
        this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
        this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
        this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
    }



    /**
     * Get felixMemoryusageDumpThreshold
     * @return felixMemoryusageDumpThreshold
     */
    public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
        return felixMemoryusageDumpThreshold;
    }

    public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
        this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    }

    /**
     * Get felixMemoryusageDumpInterval
     * @return felixMemoryusageDumpInterval
     */
    public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
        return felixMemoryusageDumpInterval;
    }

    public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
        this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    }

    /**
     * Get felixMemoryusageDumpLocation
     * @return felixMemoryusageDumpLocation
     */
    public ConfigNodePropertyString getFelixMemoryusageDumpLocation() {
        return felixMemoryusageDumpLocation;
    }

    public void setFelixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
        this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {\n");
        
        sb.append("    felixMemoryusageDumpThreshold: ").append(toIndentedString(felixMemoryusageDumpThreshold)).append("\n");
        sb.append("    felixMemoryusageDumpInterval: ").append(toIndentedString(felixMemoryusageDumpInterval)).append("\n");
        sb.append("    felixMemoryusageDumpLocation: ").append(toIndentedString(felixMemoryusageDumpLocation)).append("\n");
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

