package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString locale = null;
  private ConfigNodePropertyString imsConfig = null;

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties () {

  }

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties (ConfigNodePropertyString name, ConfigNodePropertyString locale, ConfigNodePropertyString imsConfig) {
    this.name = name;
    this.locale = locale;
    this.imsConfig = imsConfig;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("locale")
  public ConfigNodePropertyString getLocale() {
    return locale;
  }
  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

    
  @JsonProperty("imsConfig")
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
    return Objects.equals(name, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.name) &&
        Objects.equals(locale, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.locale) &&
        Objects.equals(imsConfig, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.imsConfig);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
