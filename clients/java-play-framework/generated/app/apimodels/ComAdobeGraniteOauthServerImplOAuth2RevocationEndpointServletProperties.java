package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties   {
  @JsonProperty("sling.servlet.paths")
  @Valid

  private ConfigNodePropertyString slingServletPaths;

  @JsonProperty("oauth.revocation.active")
  @Valid

  private ConfigNodePropertyBoolean oauthRevocationActive;

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

   /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties oauthRevocationActive(ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
    return this;
  }

   /**
   * Get oauthRevocationActive
   * @return oauthRevocationActive
  **/
  public ConfigNodePropertyBoolean getOauthRevocationActive() {
    return oauthRevocationActive;
  }

  public void setOauthRevocationActive(ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties = (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties) o;
    return Objects.equals(slingServletPaths, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.slingServletPaths) &&
        Objects.equals(oauthRevocationActive, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.oauthRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, oauthRevocationActive);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    oauthRevocationActive: ").append(toIndentedString(oauthRevocationActive)).append("\n");
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

