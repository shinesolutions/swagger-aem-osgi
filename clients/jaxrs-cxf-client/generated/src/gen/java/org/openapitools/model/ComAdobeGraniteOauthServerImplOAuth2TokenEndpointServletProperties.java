package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthIssuer = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthAccessTokenExpiresIn = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;
 /**
   * Get oauthIssuer
   * @return oauthIssuer
  **/
  @JsonProperty("oauth.issuer")
  public ConfigNodePropertyString getOauthIssuer() {
    return oauthIssuer;
  }

  public void setOauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
    return this;
  }

 /**
   * Get oauthAccessTokenExpiresIn
   * @return oauthAccessTokenExpiresIn
  **/
  @JsonProperty("oauth.access.token.expires.in")
  public ConfigNodePropertyString getOauthAccessTokenExpiresIn() {
    return oauthAccessTokenExpiresIn;
  }

  public void setOauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
    return this;
  }

 /**
   * Get osgiHttpWhiteboardServletPattern
   * @return osgiHttpWhiteboardServletPattern
  **/
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }

  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

 /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
  **/
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

