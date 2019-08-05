package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties   {
  @JsonProperty("getCacheExpirationUnit")
  private ConfigNodePropertyDropDown getCacheExpirationUnit = null;

  @JsonProperty("getCacheExpirationValue")
  private ConfigNodePropertyInteger getCacheExpirationValue = null;

  public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties getCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit) {
    this.getCacheExpirationUnit = getCacheExpirationUnit;
    return this;
  }

   /**
   * Get getCacheExpirationUnit
   * @return getCacheExpirationUnit
  **/
  @Valid
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
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

