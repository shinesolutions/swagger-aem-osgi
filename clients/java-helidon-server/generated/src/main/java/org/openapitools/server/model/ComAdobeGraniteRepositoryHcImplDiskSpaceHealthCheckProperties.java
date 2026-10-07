package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyInteger diskSpaceWarnThreshold;
    private ConfigNodePropertyInteger diskSpaceErrorThreshold;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param diskSpaceWarnThreshold diskSpaceWarnThreshold
     * @param diskSpaceErrorThreshold diskSpaceErrorThreshold
     */
    public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyInteger diskSpaceWarnThreshold, 
        ConfigNodePropertyInteger diskSpaceErrorThreshold
    ) {
        this.hcTags = hcTags;
        this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
        this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
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
     * Get diskSpaceWarnThreshold
     * @return diskSpaceWarnThreshold
     */
    public ConfigNodePropertyInteger getDiskSpaceWarnThreshold() {
        return diskSpaceWarnThreshold;
    }

    public void setDiskSpaceWarnThreshold(ConfigNodePropertyInteger diskSpaceWarnThreshold) {
        this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
    }

    /**
     * Get diskSpaceErrorThreshold
     * @return diskSpaceErrorThreshold
     */
    public ConfigNodePropertyInteger getDiskSpaceErrorThreshold() {
        return diskSpaceErrorThreshold;
    }

    public void setDiskSpaceErrorThreshold(ConfigNodePropertyInteger diskSpaceErrorThreshold) {
        this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    diskSpaceWarnThreshold: ").append(toIndentedString(diskSpaceWarnThreshold)).append("\n");
        sb.append("    diskSpaceErrorThreshold: ").append(toIndentedString(diskSpaceErrorThreshold)).append("\n");
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

