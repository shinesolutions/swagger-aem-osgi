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
 * ComAdobeGraniteAuthOauthImplGraniteProviderProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthImplGraniteProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGraniteTokenUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGraniteProfileUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls;

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderId(@Nullable ConfigNodePropertyString oauthProviderId) {
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

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteAuthorizationUrl(@Nullable ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
    return this;
  }

  /**
   * Get oauthProviderGraniteAuthorizationUrl
   * @return oauthProviderGraniteAuthorizationUrl
   */
  @Valid 
  @Schema(name = "oauth.provider.granite.authorization.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.granite.authorization.url")
  public @Nullable ConfigNodePropertyString getOauthProviderGraniteAuthorizationUrl() {
    return oauthProviderGraniteAuthorizationUrl;
  }

  @JsonProperty("oauth.provider.granite.authorization.url")
  public void setOauthProviderGraniteAuthorizationUrl(@Nullable ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteTokenUrl(@Nullable ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
    return this;
  }

  /**
   * Get oauthProviderGraniteTokenUrl
   * @return oauthProviderGraniteTokenUrl
   */
  @Valid 
  @Schema(name = "oauth.provider.granite.token.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.granite.token.url")
  public @Nullable ConfigNodePropertyString getOauthProviderGraniteTokenUrl() {
    return oauthProviderGraniteTokenUrl;
  }

  @JsonProperty("oauth.provider.granite.token.url")
  public void setOauthProviderGraniteTokenUrl(@Nullable ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteProfileUrl(@Nullable ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
    return this;
  }

  /**
   * Get oauthProviderGraniteProfileUrl
   * @return oauthProviderGraniteProfileUrl
   */
  @Valid 
  @Schema(name = "oauth.provider.granite.profile.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.granite.profile.url")
  public @Nullable ConfigNodePropertyString getOauthProviderGraniteProfileUrl() {
    return oauthProviderGraniteProfileUrl;
  }

  @JsonProperty("oauth.provider.granite.profile.url")
  public void setOauthProviderGraniteProfileUrl(@Nullable ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteExtendedDetailsUrls(@Nullable ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
    this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
    return this;
  }

  /**
   * Get oauthProviderGraniteExtendedDetailsUrls
   * @return oauthProviderGraniteExtendedDetailsUrls
   */
  @Valid 
  @Schema(name = "oauth.provider.granite.extended.details.urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.provider.granite.extended.details.urls")
  public @Nullable ConfigNodePropertyString getOauthProviderGraniteExtendedDetailsUrls() {
    return oauthProviderGraniteExtendedDetailsUrls;
  }

  @JsonProperty("oauth.provider.granite.extended.details.urls")
  public void setOauthProviderGraniteExtendedDetailsUrls(@Nullable ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
    this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties comAdobeGraniteAuthOauthImplGraniteProviderProperties = (ComAdobeGraniteAuthOauthImplGraniteProviderProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderId) &&
        Objects.equals(this.oauthProviderGraniteAuthorizationUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteAuthorizationUrl) &&
        Objects.equals(this.oauthProviderGraniteTokenUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteTokenUrl) &&
        Objects.equals(this.oauthProviderGraniteProfileUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteProfileUrl) &&
        Objects.equals(this.oauthProviderGraniteExtendedDetailsUrls, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteExtendedDetailsUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, oauthProviderGraniteAuthorizationUrl, oauthProviderGraniteTokenUrl, oauthProviderGraniteProfileUrl, oauthProviderGraniteExtendedDetailsUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {\n");
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    oauthProviderGraniteAuthorizationUrl: ").append(toIndentedString(oauthProviderGraniteAuthorizationUrl)).append("\n");
    sb.append("    oauthProviderGraniteTokenUrl: ").append(toIndentedString(oauthProviderGraniteTokenUrl)).append("\n");
    sb.append("    oauthProviderGraniteProfileUrl: ").append(toIndentedString(oauthProviderGraniteProfileUrl)).append("\n");
    sb.append("    oauthProviderGraniteExtendedDetailsUrls: ").append(toIndentedString(oauthProviderGraniteExtendedDetailsUrls)).append("\n");
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

