package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties   {
  
  private ConfigNodePropertyBoolean oauthClientRevocationActive = null;


  /**
   **/
  public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties oauthClientRevocationActive(ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.client.revocation.active")
  public ConfigNodePropertyBoolean getOauthClientRevocationActive() {
    return oauthClientRevocationActive;
  }
  public void setOauthClientRevocationActive(ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties = (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties) o;
    return Objects.equals(oauthClientRevocationActive, comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.oauthClientRevocationActive);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

