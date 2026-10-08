package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties   {
  @JsonProperty("requiredServicePids")
  @Valid

  private ConfigNodePropertyArray requiredServicePids;

  @JsonProperty("authorizationCompositionType")
  @Valid

  private ConfigNodePropertyDropDown authorizationCompositionType;

  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties requiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
    return this;
  }

   /**
   * Get requiredServicePids
   * @return requiredServicePids
  **/
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
  public ConfigNodePropertyDropDown getAuthorizationCompositionType() {
    return authorizationCompositionType;
  }

  public void setAuthorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
    this.authorizationCompositionType = authorizationCompositionType;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

