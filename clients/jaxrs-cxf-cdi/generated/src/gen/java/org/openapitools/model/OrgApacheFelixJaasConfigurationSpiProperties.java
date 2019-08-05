package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheFelixJaasConfigurationSpiProperties   {
  
  private ConfigNodePropertyString jaasDefaultRealmName = null;

  private ConfigNodePropertyString jaasConfigProviderName = null;

  private ConfigNodePropertyDropDown jaasGlobalConfigPolicy = null;


  /**
   **/
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
   **/
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
   **/
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

