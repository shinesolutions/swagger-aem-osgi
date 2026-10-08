package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqHcContentPackagesHealthCheckProperties   {

    private ConfigNodePropertyString hcName;
    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString hcMbeanName;
    private ConfigNodePropertyArray packageNames;

    /**
     * Default constructor.
     */
    public ComAdobeCqHcContentPackagesHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqHcContentPackagesHealthCheckProperties.
     *
     * @param hcName hcName
     * @param hcTags hcTags
     * @param hcMbeanName hcMbeanName
     * @param packageNames packageNames
     */
    public ComAdobeCqHcContentPackagesHealthCheckProperties(
        ConfigNodePropertyString hcName, 
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString hcMbeanName, 
        ConfigNodePropertyArray packageNames
    ) {
        this.hcName = hcName;
        this.hcTags = hcTags;
        this.hcMbeanName = hcMbeanName;
        this.packageNames = packageNames;
    }



    /**
     * Get hcName
     * @return hcName
     */
    public ConfigNodePropertyString getHcName() {
        return hcName;
    }

    public void setHcName(ConfigNodePropertyString hcName) {
        this.hcName = hcName;
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
     * Get hcMbeanName
     * @return hcMbeanName
     */
    public ConfigNodePropertyString getHcMbeanName() {
        return hcMbeanName;
    }

    public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
        this.hcMbeanName = hcMbeanName;
    }

    /**
     * Get packageNames
     * @return packageNames
     */
    public ConfigNodePropertyArray getPackageNames() {
        return packageNames;
    }

    public void setPackageNames(ConfigNodePropertyArray packageNames) {
        this.packageNames = packageNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqHcContentPackagesHealthCheckProperties {\n");
        
        sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
        sb.append("    packageNames: ").append(toIndentedString(packageNames)).append("\n");
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

