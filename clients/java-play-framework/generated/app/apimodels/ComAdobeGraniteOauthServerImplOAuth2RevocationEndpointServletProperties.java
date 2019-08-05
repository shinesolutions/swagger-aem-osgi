package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties   {
  @JsonProperty("sling.servlet.paths")
  private ConfigNodePropertyString slingServletPaths = null;

  @JsonProperty("oauth.revocation.active")
  private ConfigNodePropertyBoolean oauthRevocationActive = null;

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

   /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  @Valid
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
  @Valid
  public ConfigNodePropertyBoolean getOauthRevocationActive() {
    return oauthRevocationActive;
  }

  public void setOauthRevocationActive(ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

