package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties   {
  @JsonProperty("oauth.issuer")
  private ConfigNodePropertyString oauthIssuer = null;

  @JsonProperty("oauth.access.token.expires.in")
  private ConfigNodePropertyString oauthAccessTokenExpiresIn = null;

  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;

  @JsonProperty("osgi.http.whiteboard.context.select")
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
    return this;
  }

   /**
   * Get oauthIssuer
   * @return oauthIssuer
  **/
  @Valid
  public ConfigNodePropertyString getOauthIssuer() {
    return oauthIssuer;
  }

  public void setOauthIssuer(ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
    return this;
  }

   /**
   * Get oauthAccessTokenExpiresIn
   * @return oauthAccessTokenExpiresIn
  **/
  @Valid
  public ConfigNodePropertyString getOauthAccessTokenExpiresIn() {
    return oauthAccessTokenExpiresIn;
  }

  public void setOauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

   /**
   * Get osgiHttpWhiteboardServletPattern
   * @return osgiHttpWhiteboardServletPattern
  **/
  @Valid
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }

  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

   /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

