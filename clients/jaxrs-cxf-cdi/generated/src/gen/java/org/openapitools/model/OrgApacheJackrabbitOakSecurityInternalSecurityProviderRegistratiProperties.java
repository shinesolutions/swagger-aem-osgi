package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties   {
  
  private ConfigNodePropertyArray requiredServicePids = null;

  private ConfigNodePropertyDropDown authorizationCompositionType = null;


  /**
   **/
  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties requiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requiredServicePids")
  public ConfigNodePropertyArray getRequiredServicePids() {
    return requiredServicePids;
  }
  public void setRequiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties authorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
    this.authorizationCompositionType = authorizationCompositionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizationCompositionType")
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

