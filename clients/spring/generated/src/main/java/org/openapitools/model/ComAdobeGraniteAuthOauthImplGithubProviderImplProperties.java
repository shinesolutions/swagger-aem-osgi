package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthImplGithubProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGithubAuthorizationUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGithubTokenUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGithubProfileUrl;

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderId(@Nullable ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

  /**
   * Get oauthProviderId
   * @return oauthProviderId
   */
  @Valid 
  @Schema(name = "oauth.provider.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.id")
  public @Nullable ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  @JsonProperty("oauth.provider.id")
  public void setOauthProviderId(@Nullable ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubAuthorizationUrl(@Nullable ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
    return this;
  }

  /**
   * Get oauthProviderGithubAuthorizationUrl
   * @return oauthProviderGithubAuthorizationUrl
   */
  @Valid 
  @Schema(name = "oauth.provider.github.authorization.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.github.authorization.url")
  public @Nullable ConfigNodePropertyString getOauthProviderGithubAuthorizationUrl() {
    return oauthProviderGithubAuthorizationUrl;
  }

  @JsonProperty("oauth.provider.github.authorization.url")
  public void setOauthProviderGithubAuthorizationUrl(@Nullable ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
    this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubTokenUrl(@Nullable ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
    return this;
  }

  /**
   * Get oauthProviderGithubTokenUrl
   * @return oauthProviderGithubTokenUrl
   */
  @Valid 
  @Schema(name = "oauth.provider.github.token.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.github.token.url")
  public @Nullable ConfigNodePropertyString getOauthProviderGithubTokenUrl() {
    return oauthProviderGithubTokenUrl;
  }

  @JsonProperty("oauth.provider.github.token.url")
  public void setOauthProviderGithubTokenUrl(@Nullable ConfigNodePropertyString oauthProviderGithubTokenUrl) {
    this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
  }

  public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties oauthProviderGithubProfileUrl(@Nullable ConfigNodePropertyString oauthProviderGithubProfileUrl) {
    this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
    return this;
  }

  /**
   * Get oauthProviderGithubProfileUrl
   * @return oauthProviderGithubProfileUrl
   */
  @Valid 
  @Schema(name = "oauth.provider.github.profile.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.github.profile.url")
  public @Nullable ConfigNodePropertyString getOauthProviderGithubProfileUrl() {
    return oauthProviderGithubProfileUrl;
  }

  @JsonProperty("oauth.provider.github.profile.url")
  public void setOauthProviderGithubProfileUrl(@Nullable ConfigNodePropertyString oauthProviderGithubProfileUrl) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

