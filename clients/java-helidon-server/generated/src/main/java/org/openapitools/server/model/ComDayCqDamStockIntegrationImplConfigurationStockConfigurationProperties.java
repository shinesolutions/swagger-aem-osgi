package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString locale;
    private ConfigNodePropertyString imsConfig;

    /**
     * Default constructor.
     */
    public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.
     *
     * @param name name
     * @param locale locale
     * @param imsConfig imsConfig
     */
    public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString locale, 
        ConfigNodePropertyString imsConfig
    ) {
        this.name = name;
        this.locale = locale;
        this.imsConfig = imsConfig;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get locale
     * @return locale
     */
    public ConfigNodePropertyString getLocale() {
        return locale;
    }

    public void setLocale(ConfigNodePropertyString locale) {
        this.locale = locale;
    }

    /**
     * Get imsConfig
     * @return imsConfig
     */
    public ConfigNodePropertyString getImsConfig() {
        return imsConfig;
    }

    public void setImsConfig(ConfigNodePropertyString imsConfig) {
        this.imsConfig = imsConfig;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    imsConfig: ").append(toIndentedString(imsConfig)).append("\n");
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

