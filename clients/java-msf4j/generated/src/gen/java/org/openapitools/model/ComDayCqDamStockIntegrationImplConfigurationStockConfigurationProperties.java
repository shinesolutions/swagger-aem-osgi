package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("locale")
  private ConfigNodePropertyString locale;

  @JsonProperty("imsConfig")
  private ConfigNodePropertyString imsConfig;

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties locale(ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLocale() {
    return locale;
  }

  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties imsConfig(ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
    return this;
  }

   /**
   * Get imsConfig
   * @return imsConfig
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getImsConfig() {
    return imsConfig;
  }

  public void setImsConfig(ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

