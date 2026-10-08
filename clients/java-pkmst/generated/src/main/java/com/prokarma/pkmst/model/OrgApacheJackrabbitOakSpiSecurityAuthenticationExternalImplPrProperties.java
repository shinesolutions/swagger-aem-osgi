package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties   {
  @JsonProperty("protectExternalId")
  private ConfigNodePropertyBoolean protectExternalId;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties protectExternalId(ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
    return this;
  }

  /**
   * Get protectExternalId
   * @return protectExternalId
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

