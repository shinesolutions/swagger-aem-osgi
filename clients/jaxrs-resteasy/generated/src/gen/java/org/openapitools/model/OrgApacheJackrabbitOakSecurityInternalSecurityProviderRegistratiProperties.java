package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties   {
  
  private ConfigNodePropertyArray requiredServicePids;
  private ConfigNodePropertyDropDown authorizationCompositionType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requiredServicePids")
  @Valid
  public ConfigNodePropertyArray getRequiredServicePids() {
    return requiredServicePids;
  }
  public void setRequiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizationCompositionType")
  @Valid
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
    return Objects.equals(this.requiredServicePids, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.requiredServicePids) &&
        Objects.equals(this.authorizationCompositionType, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.authorizationCompositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredServicePids, authorizationCompositionType);
  }

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

