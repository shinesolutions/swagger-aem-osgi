package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheFelixJaasConfigurationSpiProperties   {
  
  private ConfigNodePropertyString jaasDefaultRealmName = null;
  private ConfigNodePropertyString jaasConfigProviderName = null;
  private ConfigNodePropertyDropDown jaasGlobalConfigPolicy = null;

  public OrgApacheFelixJaasConfigurationSpiProperties () {

  }

  public OrgApacheFelixJaasConfigurationSpiProperties (ConfigNodePropertyString jaasDefaultRealmName, ConfigNodePropertyString jaasConfigProviderName, ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
    this.jaasConfigProviderName = jaasConfigProviderName;
    this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
  }

    
  @JsonProperty("jaas.defaultRealmName")
  public ConfigNodePropertyString getJaasDefaultRealmName() {
    return jaasDefaultRealmName;
  }
  public void setJaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
  }

    
  @JsonProperty("jaas.configProviderName")
  public ConfigNodePropertyString getJaasConfigProviderName() {
    return jaasConfigProviderName;
  }
  public void setJaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
