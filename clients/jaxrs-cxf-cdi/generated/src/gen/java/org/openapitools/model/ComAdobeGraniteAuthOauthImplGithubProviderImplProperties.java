package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties   {
  
  private ConfigNodePropertyString oauthProviderId;

  private ConfigNodePropertyString oauthProviderGithubAuthorizationUrl;

  private ConfigNodePropertyString oauthProviderGithubTokenUrl;

  private ConfigNodePropertyString oauthProviderGithubProfileUrl;

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

