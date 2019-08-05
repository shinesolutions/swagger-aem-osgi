package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties   {
  

  private ConfigNodePropertyBoolean protectExternalId = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("protectExternalId")
  public ConfigNodePropertyBoolean getProtectExternalId() {
    return protectExternalId;
  }
  public void setProtectExternalId(ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties) o;
    return Objects.equals(protectExternalId, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.protectExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {\n");
    
    sb.append("    protectExternalId: ").append(toIndentedString(protectExternalId)).append("\n");
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

