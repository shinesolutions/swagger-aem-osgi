package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties   {
  
  private ConfigNodePropertyArray facebook = null;
  private ConfigNodePropertyArray twitter = null;
  private ConfigNodePropertyString providerConfigUserFolder = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("facebook")
  public ConfigNodePropertyArray getFacebook() {
    return facebook;
  }
  public void setFacebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("twitter")
  public ConfigNodePropertyArray getTwitter() {
    return twitter;
  }
  public void setTwitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyString getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }
  public void setProviderConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties = (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties) o;
    return Objects.equals(facebook, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.facebook) &&
        Objects.equals(twitter, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.twitter) &&
        Objects.equals(providerConfigUserFolder, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.providerConfigUserFolder);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

