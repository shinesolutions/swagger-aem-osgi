package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties   {

    private ConfigNodePropertyString hcName;
    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString hcMbeanName;
    private ConfigNodePropertyString expression;
    private ConfigNodePropertyString languageExtension;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.
     *
     * @param hcName hcName
     * @param hcTags hcTags
     * @param hcMbeanName hcMbeanName
     * @param expression expression
     * @param languageExtension languageExtension
     */
    public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(
        ConfigNodePropertyString hcName, 
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString hcMbeanName, 
        ConfigNodePropertyString expression, 
        ConfigNodePropertyString languageExtension
    ) {
        this.hcName = hcName;
        this.hcTags = hcTags;
        this.hcMbeanName = hcMbeanName;
        this.expression = expression;
        this.languageExtension = languageExtension;
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
     * Get expression
     * @return expression
     */
    public ConfigNodePropertyString getExpression() {
        return expression;
    }

    public void setExpression(ConfigNodePropertyString expression) {
        this.expression = expression;
    }

    /**
     * Get languageExtension
     * @return languageExtension
     */
    public ConfigNodePropertyString getLanguageExtension() {
        return languageExtension;
    }

    public void setLanguageExtension(ConfigNodePropertyString languageExtension) {
        this.languageExtension = languageExtension;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties {\n");
        
        sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    languageExtension: ").append(toIndentedString(languageExtension)).append("\n");
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

