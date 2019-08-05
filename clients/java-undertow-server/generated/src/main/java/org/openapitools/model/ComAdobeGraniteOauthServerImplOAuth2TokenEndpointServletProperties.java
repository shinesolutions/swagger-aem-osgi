package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties   {
  
  private ConfigNodePropertyString oauthIssuer = null;
  private ConfigNodePropertyString oauthAccessTokenExpiresIn = null;
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  /**
   **/
  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.issuer")
  public ConfigNodePropertyString getOauthIssuer() {
    return oauthIssuer;
  }
  public void setOauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.access.token.expires.in")
  public ConfigNodePropertyString getOauthAccessTokenExpiresIn() {
    return oauthAccessTokenExpiresIn;
  }
  public void setOauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }
  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

