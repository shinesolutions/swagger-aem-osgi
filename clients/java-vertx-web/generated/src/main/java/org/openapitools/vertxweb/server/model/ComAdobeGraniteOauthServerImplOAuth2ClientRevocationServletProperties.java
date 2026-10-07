package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties   {
  
  private ConfigNodePropertyBoolean oauthClientRevocationActive;

  public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties () {

  }

  public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties (ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
  }

    
  @JsonProperty("oauth.client.revocation.active")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
