package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
 */

@JsonTypeName("comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {

  private ConfigNodePropertyArray facebook;

  private ConfigNodePropertyArray twitter;

  private ConfigNodePropertyString providerConfigUserFolder;

  public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties facebook(ConfigNodePropertyArray facebook) {
    this.facebook = facebook;
    return this;
  }

  /**
   * Get facebook
   * @return facebook
   */
  @Valid 
  @Schema(name = "facebook", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebook")
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
   */
  @Valid 
  @Schema(name = "twitter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitter")
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
   */
  @Valid 
  @Schema(name = "provider.config.user.folder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyString getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  public void setProviderConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

