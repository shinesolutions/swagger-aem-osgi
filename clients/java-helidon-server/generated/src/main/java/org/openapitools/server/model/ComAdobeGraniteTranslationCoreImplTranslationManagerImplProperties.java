package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties   {

    private ConfigNodePropertyString defaultConnectorName;
    private ConfigNodePropertyString defaultCategory;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
     *
     * @param defaultConnectorName defaultConnectorName
     * @param defaultCategory defaultCategory
     */
    public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(
        ConfigNodePropertyString defaultConnectorName, 
        ConfigNodePropertyString defaultCategory
    ) {
        this.defaultConnectorName = defaultConnectorName;
        this.defaultCategory = defaultCategory;
    }



    /**
     * Get defaultConnectorName
     * @return defaultConnectorName
     */
    public ConfigNodePropertyString getDefaultConnectorName() {
        return defaultConnectorName;
    }

    public void setDefaultConnectorName(ConfigNodePropertyString defaultConnectorName) {
        this.defaultConnectorName = defaultConnectorName;
    }

    /**
     * Get defaultCategory
     * @return defaultCategory
     */
    public ConfigNodePropertyString getDefaultCategory() {
        return defaultCategory;
    }

    public void setDefaultCategory(ConfigNodePropertyString defaultCategory) {
        this.defaultCategory = defaultCategory;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {\n");
        
        sb.append("    defaultConnectorName: ").append(toIndentedString(defaultConnectorName)).append("\n");
        sb.append("    defaultCategory: ").append(toIndentedString(defaultCategory)).append("\n");
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

