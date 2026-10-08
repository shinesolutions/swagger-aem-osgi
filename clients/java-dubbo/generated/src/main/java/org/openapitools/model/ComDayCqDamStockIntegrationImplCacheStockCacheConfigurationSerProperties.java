package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("getCacheExpirationUnit")
  private ConfigNodePropertyDropDown getCacheExpirationUnit;

  @JsonProperty("getCacheExpirationValue")
  private ConfigNodePropertyInteger getCacheExpirationValue;

  /**
   * 
   * @return getCacheExpirationUnit
   */
  public ConfigNodePropertyDropDown getGetCacheExpirationUnit() {
    return getCacheExpirationUnit;
  }

  public void setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
  }

  /**
   * 
   * @return getCacheExpirationValue
   */
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
    return Objects.equals(this.getCacheExpirationUnit, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.getCacheExpirationUnit) &&
        Objects.equals(this.getCacheExpirationValue, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.getCacheExpirationValue);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
