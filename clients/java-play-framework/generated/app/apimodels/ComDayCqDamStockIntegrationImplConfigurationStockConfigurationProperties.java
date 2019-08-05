package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("locale")
  private ConfigNodePropertyString locale = null;

  @JsonProperty("imsConfig")
  private ConfigNodePropertyString imsConfig = null;

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
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
  @Valid
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
  @Valid
  public ConfigNodePropertyString getImsConfig() {
    return imsConfig;
  }

  public void setImsConfig(ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

