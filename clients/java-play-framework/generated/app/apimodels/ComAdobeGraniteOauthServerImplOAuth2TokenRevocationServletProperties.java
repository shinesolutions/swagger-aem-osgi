package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties   {
  @JsonProperty("oauth.token.revocation.active")
  @Valid

  private ConfigNodePropertyBoolean oauthTokenRevocationActive;

  public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties oauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
    return this;
  }

   /**
   * Get oauthTokenRevocationActive
   * @return oauthTokenRevocationActive
  **/
  public ConfigNodePropertyBoolean getOauthTokenRevocationActive() {
    return oauthTokenRevocationActive;
  }

  public void setOauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties = (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties) o;
    return Objects.equals(oauthTokenRevocationActive, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.oauthTokenRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthTokenRevocationActive);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {\n");
    
    sb.append("    oauthTokenRevocationActive: ").append(toIndentedString(oauthTokenRevocationActive)).append("\n");
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

