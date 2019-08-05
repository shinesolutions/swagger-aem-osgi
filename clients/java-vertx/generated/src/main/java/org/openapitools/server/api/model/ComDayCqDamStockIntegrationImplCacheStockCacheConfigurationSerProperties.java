package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties   {
  
  private ConfigNodePropertyDropDown getCacheExpirationUnit = null;
  private ConfigNodePropertyInteger getCacheExpirationValue = null;

  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties () {

  }

  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties (ConfigNodePropertyDropDown getCacheExpirationUnit, ConfigNodePropertyInteger getCacheExpirationValue) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
    this.getCacheExpirationValue = getCacheExpirationValue;
  }

    
  @JsonProperty("getCacheExpirationUnit")
  public ConfigNodePropertyDropDown getGetCacheExpirationUnit() {
    return getCacheExpirationUnit;
  }
  public void setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
  }

    
  @JsonProperty("getCacheExpirationValue")
  public ConfigNodePropertyInteger getGetCacheExpirationValue() {
    return getCacheExpirationValue;
  }
  public void setGetCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue) {
    this.getCacheExpirationValue = getCacheExpirationValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties = (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties) o;
    return Objects.equals(getCacheExpirationUnit, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.getCacheExpirationUnit) &&
        Objects.equals(getCacheExpirationValue, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.getCacheExpirationValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCacheExpirationUnit, getCacheExpirationValue);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
