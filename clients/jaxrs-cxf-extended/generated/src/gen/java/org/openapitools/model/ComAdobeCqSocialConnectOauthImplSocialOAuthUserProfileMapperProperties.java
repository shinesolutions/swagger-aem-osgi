package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray facebook;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray twitter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString providerConfigUserFolder;
 /**
  * Get facebook
  * @return facebook
  */
  @JsonProperty("facebook")
  public ConfigNodePropertyArray getFacebook() {
    return facebook;
  }

  /**
   * Sets the <code>facebook</code> property.
   */
 public void setFacebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
  }

  /**
   * Sets the <code>facebook</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties facebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
    return this;
  }

 /**
  * Get twitter
  * @return twitter
  */
  @JsonProperty("twitter")
  public ConfigNodePropertyArray getTwitter() {
    return twitter;
  }

  /**
   * Sets the <code>twitter</code> property.
   */
 public void setTwitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
  }

  /**
   * Sets the <code>twitter</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties twitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
    return this;
  }

 /**
  * Get providerConfigUserFolder
  * @return providerConfigUserFolder
  */
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyString getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  /**
   * Sets the <code>providerConfigUserFolder</code> property.
   */
 public void setProviderConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  /**
   * Sets the <code>providerConfigUserFolder</code> property.
   */
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

