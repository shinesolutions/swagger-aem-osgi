package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheFelixJaasConfigurationSpiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixJaasConfigurationSpiProperties   {
  @JsonProperty("jaas.defaultRealmName")
  private ConfigNodePropertyString jaasDefaultRealmName = null;

  @JsonProperty("jaas.configProviderName")
  private ConfigNodePropertyString jaasConfigProviderName = null;

  @JsonProperty("jaas.globalConfigPolicy")
  private ConfigNodePropertyDropDown jaasGlobalConfigPolicy = null;

  public OrgApacheFelixJaasConfigurationSpiProperties jaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
    return this;
  }

   /**
   * Get jaasDefaultRealmName
   * @return jaasDefaultRealmName
  **/
  @Valid
  public ConfigNodePropertyString getJaasDefaultRealmName() {
    return jaasDefaultRealmName;
  }

  public void setJaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
  }

  public OrgApacheFelixJaasConfigurationSpiProperties jaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
    return this;
  }

   /**
   * Get jaasConfigProviderName
   * @return jaasConfigProviderName
  **/
  @Valid
  public ConfigNodePropertyString getJaasConfigProviderName() {
    return jaasConfigProviderName;
  }

  public void setJaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
  }

  public OrgApacheFelixJaasConfigurationSpiProperties jaasGlobalConfigPolicy(ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
    this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
    return this;
  }

   /**
   * Get jaasGlobalConfigPolicy
   * @return jaasGlobalConfigPolicy
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

