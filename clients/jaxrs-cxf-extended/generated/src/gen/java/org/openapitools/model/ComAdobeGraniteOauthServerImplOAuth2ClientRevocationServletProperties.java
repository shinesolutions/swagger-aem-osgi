package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthClientRevocationActive;
 /**
  * Get oauthClientRevocationActive
  * @return oauthClientRevocationActive
  */
  @JsonProperty("oauth.client.revocation.active")
  public ConfigNodePropertyBoolean getOauthClientRevocationActive() {
    return oauthClientRevocationActive;
  }

  /**
   * Sets the <code>oauthClientRevocationActive</code> property.
   */
 public void setOauthClientRevocationActive(ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
  }

  /**
   * Sets the <code>oauthClientRevocationActive</code> property.
   */
  public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties oauthClientRevocationActive(ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

