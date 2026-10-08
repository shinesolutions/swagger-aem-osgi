package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
 */

@JsonTypeName("comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthProviderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthCloudConfigRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString providerConfigRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean providerConfigCreateTagsEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown providerConfigUserFolder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean providerConfigFacebookFetchFields;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray providerConfigFacebookFields;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthProviderId(@Nullable ConfigNodePropertyString oauthProviderId) {
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

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthCloudConfigRoot(@Nullable ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    return this;
  }

  /**
   * Get oauthCloudConfigRoot
   * @return oauthCloudConfigRoot
   */
  @Valid 
  @Schema(name = "oauth.cloud.config.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.cloud.config.root")
  public @Nullable ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }

  @JsonProperty("oauth.cloud.config.root")
  public void setOauthCloudConfigRoot(@Nullable ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRoot(@Nullable ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
    return this;
  }

  /**
   * Get providerConfigRoot
   * @return providerConfigRoot
   */
  @Valid 
  @Schema(name = "provider.config.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.root")
  public @Nullable ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }

  @JsonProperty("provider.config.root")
  public void setProviderConfigRoot(@Nullable ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigCreateTagsEnabled(@Nullable ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
    return this;
  }

  /**
   * Get providerConfigCreateTagsEnabled
   * @return providerConfigCreateTagsEnabled
   */
  @Valid 
  @Schema(name = "provider.config.create.tags.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.create.tags.enabled")
  public @Nullable ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
    return providerConfigCreateTagsEnabled;
  }

  @JsonProperty("provider.config.create.tags.enabled")
  public void setProviderConfigCreateTagsEnabled(@Nullable ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigUserFolder(@Nullable ConfigNodePropertyDropDown providerConfigUserFolder) {
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
  public @Nullable ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  @JsonProperty("provider.config.user.folder")
  public void setProviderConfigUserFolder(@Nullable ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFetchFields(@Nullable ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
    return this;
  }

  /**
   * Get providerConfigFacebookFetchFields
   * @return providerConfigFacebookFetchFields
   */
  @Valid 
  @Schema(name = "provider.config.facebook.fetch.fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.facebook.fetch.fields")
  public @Nullable ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
    return providerConfigFacebookFetchFields;
  }

  @JsonProperty("provider.config.facebook.fetch.fields")
  public void setProviderConfigFacebookFetchFields(@Nullable ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFields(@Nullable ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
    return this;
  }

  /**
   * Get providerConfigFacebookFields
   * @return providerConfigFacebookFields
   */
  @Valid 
  @Schema(name = "provider.config.facebook.fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.facebook.fields")
  public @Nullable ConfigNodePropertyArray getProviderConfigFacebookFields() {
    return providerConfigFacebookFields;
  }

  @JsonProperty("provider.config.facebook.fields")
  public void setProviderConfigFacebookFields(@Nullable ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRefreshUserdataEnabled(@Nullable ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
    return this;
  }

  /**
   * Get providerConfigRefreshUserdataEnabled
   * @return providerConfigRefreshUserdataEnabled
   */
  @Valid 
  @Schema(name = "provider.config.refresh.userdata.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.refresh.userdata.enabled")
  public @Nullable ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
    return providerConfigRefreshUserdataEnabled;
  }

  @JsonProperty("provider.config.refresh.userdata.enabled")
  public void setProviderConfigRefreshUserdataEnabled(@Nullable ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties = (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.oauthProviderId) &&
        Objects.equals(this.oauthCloudConfigRoot, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.oauthCloudConfigRoot) &&
        Objects.equals(this.providerConfigRoot, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigRoot) &&
        Objects.equals(this.providerConfigCreateTagsEnabled, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigCreateTagsEnabled) &&
        Objects.equals(this.providerConfigUserFolder, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigUserFolder) &&
        Objects.equals(this.providerConfigFacebookFetchFields, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigFacebookFetchFields) &&
        Objects.equals(this.providerConfigFacebookFields, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigFacebookFields) &&
        Objects.equals(this.providerConfigRefreshUserdataEnabled, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigRefreshUserdataEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, oauthCloudConfigRoot, providerConfigRoot, providerConfigCreateTagsEnabled, providerConfigUserFolder, providerConfigFacebookFetchFields, providerConfigFacebookFields, providerConfigRefreshUserdataEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {\n");
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    oauthCloudConfigRoot: ").append(toIndentedString(oauthCloudConfigRoot)).append("\n");
    sb.append("    providerConfigRoot: ").append(toIndentedString(providerConfigRoot)).append("\n");
    sb.append("    providerConfigCreateTagsEnabled: ").append(toIndentedString(providerConfigCreateTagsEnabled)).append("\n");
    sb.append("    providerConfigUserFolder: ").append(toIndentedString(providerConfigUserFolder)).append("\n");
    sb.append("    providerConfigFacebookFetchFields: ").append(toIndentedString(providerConfigFacebookFetchFields)).append("\n");
    sb.append("    providerConfigFacebookFields: ").append(toIndentedString(providerConfigFacebookFields)).append("\n");
    sb.append("    providerConfigRefreshUserdataEnabled: ").append(toIndentedString(providerConfigRefreshUserdataEnabled)).append("\n");
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

