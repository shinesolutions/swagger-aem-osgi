package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties   {
  @JsonProperty("facebook")
  private ConfigNodePropertyArray facebook = null;

  @JsonProperty("twitter")
  private ConfigNodePropertyArray twitter = null;

  @JsonProperty("provider.config.user.folder")
  private ConfigNodePropertyString providerConfigUserFolder = null;

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties facebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Get facebook
   * @return facebook
  **/
  @Valid
  public ConfigNodePropertyArray getFacebook() {
    return facebook;
  }

  public void setFacebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties twitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @Valid
  public ConfigNodePropertyArray getTwitter() {
    return twitter;
  }

  public void setTwitter(ConfigNodePropertyArray twitter) {
    this.twitter = twitter;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties providerConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
    return this;
  }

   /**
   * Get providerConfigUserFolder
   * @return providerConfigUserFolder
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

