package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties   {
  
  private @Valid ConfigNodePropertyString oauthProviderId = null;
  private @Valid ConfigNodePropertyString oauthProviderGithubAuthorizationUrl = null;
  private @Valid ConfigNodePropertyString oauthProviderGithubTokenUrl = null;
  private @Valid ConfigNodePropertyString oauthProviderGithubProfileUrl = null;

  /**
   **/
  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }
  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.github.authorization.url")
  public ConfigNodePropertyString getOauthProviderGithubAuthorizationUrl() {
    return oauthProviderGithubAuthorizationUrl;
  }
  public void setOauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.github.token.url")
  public ConfigNodePropertyString getOauthProviderGithubTokenUrl() {
    return oauthProviderGithubTokenUrl;
  }
  public void setOauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubProfileUrl(ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.github.profile.url")
  public ConfigNodePropertyString getOauthProviderGithubProfileUrl() {
    return oauthProviderGithubProfileUrl;
  }
  public void setOauthProviderGithubProfileUrl(ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

