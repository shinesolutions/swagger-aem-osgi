package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixJaasConfigurationSpiProperties   {
  
  private ConfigNodePropertyString jaasDefaultRealmName;
  private ConfigNodePropertyString jaasConfigProviderName;
  private ConfigNodePropertyDropDown jaasGlobalConfigPolicy;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.defaultRealmName")
  @Valid
  public ConfigNodePropertyString getJaasDefaultRealmName() {
    return jaasDefaultRealmName;
  }
  public void setJaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.configProviderName")
  @Valid
  public ConfigNodePropertyString getJaasConfigProviderName() {
    return jaasConfigProviderName;
  }
  public void setJaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.globalConfigPolicy")
  @Valid
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
    return Objects.equals(this.jaasDefaultRealmName, orgApacheFelixJaasConfigurationSpiProperties.jaasDefaultRealmName) &&
        Objects.equals(this.jaasConfigProviderName, orgApacheFelixJaasConfigurationSpiProperties.jaasConfigProviderName) &&
        Objects.equals(this.jaasGlobalConfigPolicy, orgApacheFelixJaasConfigurationSpiProperties.jaasGlobalConfigPolicy);
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

