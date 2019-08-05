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

public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthProviderId = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthProviderGithubAuthorizationUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthProviderGithubTokenUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthProviderGithubProfileUrl = null;
 /**
   * Get oauthProviderId
   * @return oauthProviderId
  **/
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

 /**
   * Get oauthProviderGithubAuthorizationUrl
   * @return oauthProviderGithubAuthorizationUrl
  **/
  @JsonProperty("oauth.provider.github.authorization.url")
  public ConfigNodePropertyString getOauthProviderGithubAuthorizationUrl() {
    return oauthProviderGithubAuthorizationUrl;
  }

  public void setOauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
    return this;
  }

 /**
   * Get oauthProviderGithubTokenUrl
   * @return oauthProviderGithubTokenUrl
  **/
  @JsonProperty("oauth.provider.github.token.url")
  public ConfigNodePropertyString getOauthProviderGithubTokenUrl() {
    return oauthProviderGithubTokenUrl;
  }

  public void setOauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
    return this;
  }

 /**
   * Get oauthProviderGithubProfileUrl
   * @return oauthProviderGithubProfileUrl
  **/
  @JsonProperty("oauth.provider.github.profile.url")
  public ConfigNodePropertyString getOauthProviderGithubProfileUrl() {
    return oauthProviderGithubProfileUrl;
  }

  public void setOauthProviderGithubProfileUrl(ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubProfileUrl(ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

