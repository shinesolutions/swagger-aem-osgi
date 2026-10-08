/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixJaasConfigurationSpiProperties   {
  
  private ConfigNodePropertyString jaasDefaultRealmName;
  private ConfigNodePropertyString jaasConfigProviderName;
  private ConfigNodePropertyDropDown jaasGlobalConfigPolicy;

  /**
   */
  public OrgApacheFelixJaasConfigurationSpiProperties jaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.defaultRealmName")
  public ConfigNodePropertyString getJaasDefaultRealmName() {
    return jaasDefaultRealmName;
  }
  public void setJaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
  }

  /**
   */
  public OrgApacheFelixJaasConfigurationSpiProperties jaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.configProviderName")
  public ConfigNodePropertyString getJaasConfigProviderName() {
    return jaasConfigProviderName;
  }
  public void setJaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
  }

  /**
   */
  public OrgApacheFelixJaasConfigurationSpiProperties jaasGlobalConfigPolicy(ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
    this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.globalConfigPolicy")
  public ConfigNodePropertyDropDown getJaasGlobalConfigPolicy() {
    return jaasGlobalConfigPolicy;
  }
  public void setJaasGlobalConfigPolicy(ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
    this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixJaasConfigurationSpiProperties orgApacheFelixJaasConfigurationSpiProperties = (OrgApacheFelixJaasConfigurationSpiProperties) o;
    return Objects.equals(jaasDefaultRealmName, orgApacheFelixJaasConfigurationSpiProperties.jaasDefaultRealmName) &&
        Objects.equals(jaasConfigProviderName, orgApacheFelixJaasConfigurationSpiProperties.jaasConfigProviderName) &&
        Objects.equals(jaasGlobalConfigPolicy, orgApacheFelixJaasConfigurationSpiProperties.jaasGlobalConfigPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jaasDefaultRealmName, jaasConfigProviderName, jaasGlobalConfigPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixJaasConfigurationSpiProperties {\n");
    
    sb.append("    jaasDefaultRealmName: ").append(toIndentedString(jaasDefaultRealmName)).append("\n");
    sb.append("    jaasConfigProviderName: ").append(toIndentedString(jaasConfigProviderName)).append("\n");
    sb.append("    jaasGlobalConfigPolicy: ").append(toIndentedString(jaasGlobalConfigPolicy)).append("\n");
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

