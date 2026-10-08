package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties   {

    private ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates;
    private ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates;

    /**
     * Default constructor.
     */
    public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.
     *
     * @param formsManagerConfigIncludeOOTBTemplates formsManagerConfigIncludeOOTBTemplates
     * @param formsManagerConfigIncludeDeprecatedTemplates formsManagerConfigIncludeDeprecatedTemplates
     */
    public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(
        ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates, 
        ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates
    ) {
        this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
        this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
    }



    /**
     * Get formsManagerConfigIncludeOOTBTemplates
     * @return formsManagerConfigIncludeOOTBTemplates
     */
    public ConfigNodePropertyBoolean getFormsManagerConfigIncludeOOTBTemplates() {
        return formsManagerConfigIncludeOOTBTemplates;
    }

    public void setFormsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
        this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
    }

    /**
     * Get formsManagerConfigIncludeDeprecatedTemplates
     * @return formsManagerConfigIncludeDeprecatedTemplates
     */
    public ConfigNodePropertyBoolean getFormsManagerConfigIncludeDeprecatedTemplates() {
        return formsManagerConfigIncludeDeprecatedTemplates;
    }

    public void setFormsManagerConfigIncludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates) {
        this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {\n");
        
        sb.append("    formsManagerConfigIncludeOOTBTemplates: ").append(toIndentedString(formsManagerConfigIncludeOOTBTemplates)).append("\n");
        sb.append("    formsManagerConfigIncludeDeprecatedTemplates: ").append(toIndentedString(formsManagerConfigIncludeDeprecatedTemplates)).append("\n");
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

