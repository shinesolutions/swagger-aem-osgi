package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties   {
  @JsonProperty("getCacheExpirationUnit")
  private ConfigNodePropertyDropDown getCacheExpirationUnit;

  @JsonProperty("getCacheExpirationValue")
  private ConfigNodePropertyInteger getCacheExpirationValue;

  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties getCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
    return this;
  }

  /**
   * Get getCacheExpirationUnit
   * @return getCacheExpirationUnit
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getGetCacheExpirationUnit() {
    return getCacheExpirationUnit;
  }

  public void setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
  }

  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties getCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue) {
    this.getCacheExpirationValue = getCacheExpirationValue;
    return this;
  }

  /**
   * Get getCacheExpirationValue
   * @return getCacheExpirationValue
   */
  @ApiModelProperty(value = "")
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

