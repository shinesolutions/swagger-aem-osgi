package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties   {
  
  private ConfigNodePropertyString oauthProviderId = null;
  private ConfigNodePropertyString oauthProviderGithubAuthorizationUrl = null;
  private ConfigNodePropertyString oauthProviderGithubTokenUrl = null;
  private ConfigNodePropertyString oauthProviderGithubProfileUrl = null;

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties () {

  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties (ConfigNodePropertyString oauthProviderId, ConfigNodePropertyString oauthProviderGithubAuthorizationUrl, ConfigNodePropertyString oauthProviderGithubTokenUrl, ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderId = oauthProviderId;
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
  }

    
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }
  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

    
  @JsonProperty("oauth.provider.github.authorization.url")
  public ConfigNodePropertyString getOauthProviderGithubAuthorizationUrl() {
    return oauthProviderGithubAuthorizationUrl;
  }
  public void setOauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
  }

    
  @JsonProperty("oauth.provider.github.token.url")
  public ConfigNodePropertyString getOauthProviderGithubTokenUrl() {
    return oauthProviderGithubTokenUrl;
  }
  public void setOauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
  }

    
  @JsonProperty("oauth.provider.github.profile.url")
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
    return Objects.equals(oauthProviderId, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderId) &&
        Objects.equals(oauthProviderGithubAuthorizationUrl, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderGithubAuthorizationUrl) &&
        Objects.equals(oauthProviderGithubTokenUrl, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderGithubTokenUrl) &&
        Objects.equals(oauthProviderGithubProfileUrl, comAdobeGraniteAuthOauthImplGithubProviderImplProperties.oauthProviderGithubProfileUrl);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
