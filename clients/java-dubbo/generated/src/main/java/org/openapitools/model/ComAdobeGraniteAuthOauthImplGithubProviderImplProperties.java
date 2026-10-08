package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("oauth.provider.id")
  private ConfigNodePropertyString oauthProviderId;

  @JsonProperty("oauth.provider.github.authorization.url")
  private ConfigNodePropertyString oauthProviderGithubAuthorizationUrl;

  @JsonProperty("oauth.provider.github.token.url")
  private ConfigNodePropertyString oauthProviderGithubTokenUrl;

  @JsonProperty("oauth.provider.github.profile.url")
  private ConfigNodePropertyString oauthProviderGithubProfileUrl;

  /**
   * 
   * @return oauthProviderId
   */
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  /**
   * 
   * @return oauthProviderGithubAuthorizationUrl
   */
  public ConfigNodePropertyString getOauthProviderGithubAuthorizationUrl() {
    return oauthProviderGithubAuthorizationUrl;
  }

  public void setOauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
  }

  /**
   * 
   * @return oauthProviderGithubTokenUrl
   */
  public ConfigNodePropertyString getOauthProviderGithubTokenUrl() {
    return oauthProviderGithubTokenUrl;
  }

  public void setOauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
  }

  /**
   * 
   * @return oauthProviderGithubProfileUrl
   */
  public ConfigNodePropertyString getOauthProviderGithubProfileUrl() {
    return oauthProviderGithubProfileUrl;
  }

  public void setOauthProviderGithubProfileUrl(ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplGithubProviderImplProperties comAdobeGraniteAuthOauthImplGithubProviderImplProperties = (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderId) &&
        Objects.equals(this.oauthProviderGithubAuthorizationUrl, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderGithubAuthorizationUrl) &&
        Objects.equals(this.oauthProviderGithubTokenUrl, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderGithubTokenUrl) &&
        Objects.equals(this.oauthProviderGithubProfileUrl, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderGithubProfileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, oauthProviderGithubAuthorizationUrl, oauthProviderGithubTokenUrl, oauthProviderGithubProfileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {\n");
    
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    oauthProviderGithubAuthorizationUrl: ").append(toIndentedString(oauthProviderGithubAuthorizationUrl)).append("\n");
    sb.append("    oauthProviderGithubTokenUrl: ").append(toIndentedString(oauthProviderGithubTokenUrl)).append("\n");
    sb.append("    oauthProviderGithubProfileUrl: ").append(toIndentedString(oauthProviderGithubProfileUrl)).append("\n");
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
