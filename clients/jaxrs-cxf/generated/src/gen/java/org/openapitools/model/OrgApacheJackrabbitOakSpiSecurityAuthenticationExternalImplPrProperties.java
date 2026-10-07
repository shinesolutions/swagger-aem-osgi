package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean protectExternalId;
 /**
   * Get protectExternalId
   * @return protectExternalId
  **/
  @JsonProperty("protectExternalId")
  public ConfigNodePropertyBoolean getProtectExternalId() {
    return protectExternalId;
  }

  public void setProtectExternalId(ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties protectExternalId(ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
    return this;
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
    return Objects.equals(this.protectExternalId, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.protectExternalId);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

