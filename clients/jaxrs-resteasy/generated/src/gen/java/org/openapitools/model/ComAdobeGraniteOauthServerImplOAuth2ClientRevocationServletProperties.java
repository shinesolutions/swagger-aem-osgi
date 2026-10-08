package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties   {
  
  private ConfigNodePropertyBoolean oauthClientRevocationActive;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.client.revocation.active")
  @Valid
  public ConfigNodePropertyBoolean getOauthClientRevocationActive() {
    return oauthClientRevocationActive;
  }
  public void setOauthClientRevocationActive(ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties = (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties) o;
    return Objects.equals(this.oauthClientRevocationActive, comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.oauthClientRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthClientRevocationActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {\n");
    
    sb.append("    oauthClientRevocationActive: ").append(toIndentedString(oauthClientRevocationActive)).append("\n");
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

