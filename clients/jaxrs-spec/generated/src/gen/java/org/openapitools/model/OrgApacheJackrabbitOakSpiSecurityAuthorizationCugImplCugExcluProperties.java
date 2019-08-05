package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties   {
  
  private @Valid ConfigNodePropertyArray principalNames = null;

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties principalNames(ConfigNodePropertyArray principalNames) {
    this.principalNames = principalNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("principalNames")
  public ConfigNodePropertyArray getPrincipalNames() {
    return principalNames;
  }
  public void setPrincipalNames(ConfigNodePropertyArray principalNames) {
    this.principalNames = principalNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties = (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties) o;
    return Objects.equals(principalNames, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.principalNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {\n");
    
    sb.append("    principalNames: ").append(toIndentedString(principalNames)).append("\n");
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

