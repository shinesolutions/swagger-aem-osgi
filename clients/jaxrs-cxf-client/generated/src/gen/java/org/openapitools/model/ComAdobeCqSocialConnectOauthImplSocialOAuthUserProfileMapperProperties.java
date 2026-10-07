package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray facebook;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray twitter;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString providerConfigUserFolder;
 /**
   * Get facebook
   * @return facebook
  **/
  @JsonProperty("facebook")
  public ConfigNodePropertyArray getFacebook() {
    return facebook;
  }

  public void setFacebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties facebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
    return this;
  }

 /**
   * Get twitter
   * @return twitter
  **/
  @JsonProperty("twitter")
  public ConfigNodePropertyArray getTwitter() {
    return twitter;
  }

  public void setTwitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties twitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
    return this;
  }

 /**
   * Get providerConfigUserFolder
   * @return providerConfigUserFolder
  **/
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyString getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  public void setProviderConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties providerConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties = (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties) o;
    return Objects.equals(this.facebook, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.facebook) &&
        Objects.equals(this.twitter, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.twitter) &&
        Objects.equals(this.providerConfigUserFolder, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.providerConfigUserFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facebook, twitter, providerConfigUserFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {\n");
    
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    providerConfigUserFolder: ").append(toIndentedString(providerConfigUserFolder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

