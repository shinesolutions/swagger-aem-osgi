package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties   {

    private ConfigNodePropertyString hcName;
    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString hcMbeanName;
    private ConfigNodePropertyString mbeanName;
    private ConfigNodePropertyString attributeName;
    private ConfigNodePropertyString attributeValueConstraint;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.
     *
     * @param hcName hcName
     * @param hcTags hcTags
     * @param hcMbeanName hcMbeanName
     * @param mbeanName mbeanName
     * @param attributeName attributeName
     * @param attributeValueConstraint attributeValueConstraint
     */
    public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(
        ConfigNodePropertyString hcName, 
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString hcMbeanName, 
        ConfigNodePropertyString mbeanName, 
        ConfigNodePropertyString attributeName, 
        ConfigNodePropertyString attributeValueConstraint
    ) {
        this.hcName = hcName;
        this.hcTags = hcTags;
        this.hcMbeanName = hcMbeanName;
        this.mbeanName = mbeanName;
        this.attributeName = attributeName;
        this.attributeValueConstraint = attributeValueConstraint;
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
     * Get mbeanName
     * @return mbeanName
     */
    public ConfigNodePropertyString getMbeanName() {
        return mbeanName;
    }

    public void setMbeanName(ConfigNodePropertyString mbeanName) {
        this.mbeanName = mbeanName;
    }

    /**
     * Get attributeName
     * @return attributeName
     */
    public ConfigNodePropertyString getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(ConfigNodePropertyString attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Get attributeValueConstraint
     * @return attributeValueConstraint
     */
    public ConfigNodePropertyString getAttributeValueConstraint() {
        return attributeValueConstraint;
    }

    public void setAttributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
        this.attributeValueConstraint = attributeValueConstraint;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {\n");
        
        sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
        sb.append("    mbeanName: ").append(toIndentedString(mbeanName)).append("\n");
        sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
        sb.append("    attributeValueConstraint: ").append(toIndentedString(attributeValueConstraint)).append("\n");
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

