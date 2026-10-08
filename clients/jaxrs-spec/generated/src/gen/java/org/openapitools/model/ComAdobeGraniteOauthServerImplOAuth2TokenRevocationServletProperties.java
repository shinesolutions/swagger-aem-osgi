package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties   {
  private ConfigNodePropertyBoolean oauthTokenRevocationActive;

  public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties() {
  }

  /**
   **/
  public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties oauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.token.revocation.active")
  @Valid public ConfigNodePropertyBoolean getOauthTokenRevocationActive() {
    return oauthTokenRevocationActive;
  }

  @JsonProperty("oauth.token.revocation.active")
  public void setOauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties = (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties) o;
    return Objects.equals(this.oauthTokenRevocationActive, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.oauthTokenRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthTokenRevocationActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {\n");
    
    sb.append("    oauthTokenRevocationActive: ").append(toIndentedString(oauthTokenRevocationActive)).append("\n");
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
