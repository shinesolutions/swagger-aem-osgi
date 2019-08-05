package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties   {
  @JsonProperty("cugSupportedPaths")
  private ConfigNodePropertyArray cugSupportedPaths = null;

  @JsonProperty("cugEnabled")
  private ConfigNodePropertyBoolean cugEnabled = null;

  @JsonProperty("configurationRanking")
  private ConfigNodePropertyInteger configurationRanking = null;

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
    return this;
  }

   /**
   * Get cugSupportedPaths
   * @return cugSupportedPaths
  **/
  @Valid
  public ConfigNodePropertyArray getCugSupportedPaths() {
    return cugSupportedPaths;
  }

  public void setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

   /**
   * Get cugEnabled
   * @return cugEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
  }

   /**
   * Get configurationRanking
   * @return configurationRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }

  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties = (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties) o;
    return Objects.equals(cugSupportedPaths, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.cugSupportedPaths) &&
        Objects.equals(cugEnabled, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.cugEnabled) &&
        Objects.equals(configurationRanking, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.configurationRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cugSupportedPaths, cugEnabled, configurationRanking);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {\n");
    
    sb.append("    cugSupportedPaths: ").append(toIndentedString(cugSupportedPaths)).append("\n");
    sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
    sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
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

