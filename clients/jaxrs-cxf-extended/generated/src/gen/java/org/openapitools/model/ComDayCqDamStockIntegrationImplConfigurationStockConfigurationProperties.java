package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString locale;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imsConfig;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get locale
  * @return locale
  */
  @JsonProperty("locale")
  public ConfigNodePropertyString getLocale() {
    return locale;
  }

  /**
   * Sets the <code>locale</code> property.
   */
 public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  /**
   * Sets the <code>locale</code> property.
   */
  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties locale(ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

 /**
  * Get imsConfig
  * @return imsConfig
  */
  @JsonProperty("imsConfig")
  public ConfigNodePropertyString getImsConfig() {
    return imsConfig;
  }

  /**
   * Sets the <code>imsConfig</code> property.
   */
 public void setImsConfig(ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
  }

  /**
   * Sets the <code>imsConfig</code> property.
   */
  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties imsConfig(ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties = (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties) o;
    return Objects.equals(this.name, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.name) &&
        Objects.equals(this.locale, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.locale) &&
        Objects.equals(this.imsConfig, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.imsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locale, imsConfig);
  }

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

