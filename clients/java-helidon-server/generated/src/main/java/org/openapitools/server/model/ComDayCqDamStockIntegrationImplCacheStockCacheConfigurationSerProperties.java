package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties   {

    private ConfigNodePropertyDropDown getCacheExpirationUnit;
    private ConfigNodePropertyInteger getCacheExpirationValue;

    /**
     * Default constructor.
     */
    public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.
     *
     * @param getCacheExpirationUnit getCacheExpirationUnit
     * @param getCacheExpirationValue getCacheExpirationValue
     */
    public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(
        ConfigNodePropertyDropDown getCacheExpirationUnit, 
        ConfigNodePropertyInteger getCacheExpirationValue
    ) {
        this.getCacheExpirationUnit = getCacheExpirationUnit;
        this.getCacheExpirationValue = getCacheExpirationValue;
    }



    /**
     * Get getCacheExpirationUnit
     * @return getCacheExpirationUnit
     */
    public ConfigNodePropertyDropDown getGetCacheExpirationUnit() {
        return getCacheExpirationUnit;
    }

    public void setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
        this.getCacheExpirationUnit = getCacheExpirationUnit;
    }

    /**
     * Get getCacheExpirationValue
     * @return getCacheExpirationValue
     */
    public ConfigNodePropertyInteger getGetCacheExpirationValue() {
        return getCacheExpirationValue;
    }

    public void setGetCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue) {
        this.getCacheExpirationValue = getCacheExpirationValue;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {\n");
        
        sb.append("    getCacheExpirationUnit: ").append(toIndentedString(getCacheExpirationUnit)).append("\n");
        sb.append("    getCacheExpirationValue: ").append(toIndentedString(getCacheExpirationValue)).append("\n");
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

