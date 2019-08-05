package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties   {
  
  private ConfigNodePropertyString oauthIssuer = null;
  private ConfigNodePropertyString oauthAccessTokenExpiresIn = null;
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties () {

  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties (ConfigNodePropertyString oauthIssuer, ConfigNodePropertyString oauthAccessTokenExpiresIn, ConfigNodePropertyString osgiHttpWhiteboardServletPattern, ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.oauthIssuer = oauthIssuer;
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

    
  @JsonProperty("oauth.issuer")
  public ConfigNodePropertyString getOauthIssuer() {
    return oauthIssuer;
  }
  public void setOauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
  }

    
  @JsonProperty("oauth.access.token.expires.in")
  public ConfigNodePropertyString getOauthAccessTokenExpiresIn() {
    return oauthAccessTokenExpiresIn;
  }
  public void setOauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
  }

    
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }
  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

    
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties = (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties) o;
    return Objects.equals(oauthIssuer, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.oauthIssuer) &&
        Objects.equals(oauthAccessTokenExpiresIn, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.oauthAccessTokenExpiresIn) &&
        Objects.equals(osgiHttpWhiteboardServletPattern, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.osgiHttpWhiteboardServletPattern) &&
        Objects.equals(osgiHttpWhiteboardContextSelect, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.osgiHttpWhiteboardContextSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthIssuer, oauthAccessTokenExpiresIn, osgiHttpWhiteboardServletPattern, osgiHttpWhiteboardContextSelect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {\n");
    
    sb.append("    oauthIssuer: ").append(toIndentedString(oauthIssuer)).append("\n");
    sb.append("    oauthAccessTokenExpiresIn: ").append(toIndentedString(oauthAccessTokenExpiresIn)).append("\n");
    sb.append("    osgiHttpWhiteboardServletPattern: ").append(toIndentedString(osgiHttpWhiteboardServletPattern)).append("\n");
    sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
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
