package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties   {
  
  private ConfigNodePropertyDropDown getCacheExpirationUnit = null;

  private ConfigNodePropertyInteger getCacheExpirationValue = null;


  /**
   **/
  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties getCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("getCacheExpirationUnit")
  public ConfigNodePropertyDropDown getGetCacheExpirationUnit() {
    return getCacheExpirationUnit;
  }
  public void setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
  }


  /**
   **/
  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties getCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue) {
    this.getCacheExpirationValue = getCacheExpirationValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("getCacheExpirationValue")
  public ConfigNodePropertyInteger getGetCacheExpirationValue() {
    return getCacheExpirationValue;
  }
  public void setGetCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue) {
    this.getCacheExpirationValue = getCacheExpirationValue;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

