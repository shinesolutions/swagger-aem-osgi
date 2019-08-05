package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties   {
  @JsonProperty("requiredServicePids")
  private ConfigNodePropertyArray requiredServicePids = null;

  @JsonProperty("authorizationCompositionType")
  private ConfigNodePropertyDropDown authorizationCompositionType = null;

  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties requiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
    return this;
  }

   /**
   * Get requiredServicePids
   * @return requiredServicePids
  **/
  @Valid
  public ConfigNodePropertyArray getRequiredServicePids() {
    return requiredServicePids;
  }

  public void setRequiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
  }

  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties authorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
    this.authorizationCompositionType = authorizationCompositionType;
    return this;
  }

   /**
   * Get authorizationCompositionType
   * @return authorizationCompositionType
  **/
  @Valid
  public ConfigNodePropertyDropDown getAuthorizationCompositionType() {
    return authorizationCompositionType;
  }

  public void setAuthorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
    this.authorizationCompositionType = authorizationCompositionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties = (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties) o;
    return Objects.equals(requiredServicePids, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.requiredServicePids) &&
        Objects.equals(authorizationCompositionType, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.authorizationCompositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredServicePids, authorizationCompositionType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {\n");
    
    sb.append("    requiredServicePids: ").append(toIndentedString(requiredServicePids)).append("\n");
    sb.append("    authorizationCompositionType: ").append(toIndentedString(authorizationCompositionType)).append("\n");
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

