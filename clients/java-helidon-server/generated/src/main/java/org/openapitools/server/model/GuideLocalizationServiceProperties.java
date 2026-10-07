package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GuideLocalizationServiceProperties   {

    private ConfigNodePropertyArray supportedLocales;
    private ConfigNodePropertyArray localizableProperties;

    /**
     * Default constructor.
     */
    public GuideLocalizationServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create GuideLocalizationServiceProperties.
     *
     * @param supportedLocales supportedLocales
     * @param localizableProperties localizableProperties
     */
    public GuideLocalizationServiceProperties(
        ConfigNodePropertyArray supportedLocales, 
        ConfigNodePropertyArray localizableProperties
    ) {
        this.supportedLocales = supportedLocales;
        this.localizableProperties = localizableProperties;
    }



    /**
     * Get supportedLocales
     * @return supportedLocales
     */
    public ConfigNodePropertyArray getSupportedLocales() {
        return supportedLocales;
    }

    public void setSupportedLocales(ConfigNodePropertyArray supportedLocales) {
        this.supportedLocales = supportedLocales;
    }

    /**
     * Get localizableProperties
     * @return localizableProperties
     */
    public ConfigNodePropertyArray getLocalizableProperties() {
        return localizableProperties;
    }

    public void setLocalizableProperties(ConfigNodePropertyArray localizableProperties) {
        this.localizableProperties = localizableProperties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GuideLocalizationServiceProperties {\n");
        
        sb.append("    supportedLocales: ").append(toIndentedString(supportedLocales)).append("\n");
        sb.append("    localizableProperties: ").append(toIndentedString(localizableProperties)).append("\n");
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

