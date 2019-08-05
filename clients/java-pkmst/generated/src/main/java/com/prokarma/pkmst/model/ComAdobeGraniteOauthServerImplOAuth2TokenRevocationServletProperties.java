package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties   {
  @JsonProperty("oauth.token.revocation.active")
  private ConfigNodePropertyBoolean oauthTokenRevocationActive = null;

  public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties oauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
    return this;
  }

   /**
   * Get oauthTokenRevocationActive
   * @return oauthTokenRevocationActive
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthTokenRevocationActive() {
    return oauthTokenRevocationActive;
  }

  public void setOauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties = (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties) o;
    return Objects.equals(this.oauthTokenRevocationActive, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.oauthTokenRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthTokenRevocationActive);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

