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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
 */

@JsonTypeName("comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {

  private ConfigNodePropertyString oauthProviderId;

  private ConfigNodePropertyString oauthCloudConfigRoot;

  private ConfigNodePropertyString providerConfigRoot;

  private ConfigNodePropertyDropDown providerConfigUserFolder;

  private ConfigNodePropertyBoolean providerConfigTwitterEnableParams;

  private ConfigNodePropertyArray providerConfigTwitterParams;

  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
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
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties oauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
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
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }

  public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigRoot(ConfigNodePropertyString providerConfigRoot) {
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
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }

  public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
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
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
    return this;
  }

  /**
   * Get providerConfigTwitterEnableParams
   * @return providerConfigTwitterEnableParams
   */
  @Valid 
  @Schema(name = "provider.config.twitter.enable.params", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.twitter.enable.params")
  public ConfigNodePropertyBoolean getProviderConfigTwitterEnableParams() {
    return providerConfigTwitterEnableParams;
  }

  public void setProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
    return this;
  }

  /**
   * Get providerConfigTwitterParams
   * @return providerConfigTwitterParams
   */
  @Valid 
  @Schema(name = "provider.config.twitter.params", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.config.twitter.params")
  public ConfigNodePropertyArray getProviderConfigTwitterParams() {
    return providerConfigTwitterParams;
  }

  public void setProviderConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
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
  public ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
    return providerConfigRefreshUserdataEnabled;
  }

  public void setProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
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
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties = (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.oauthProviderId) &&
        Objects.equals(this.oauthCloudConfigRoot, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.oauthCloudConfigRoot) &&
        Objects.equals(this.providerConfigRoot, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigRoot) &&
        Objects.equals(this.providerConfigUserFolder, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigUserFolder) &&
        Objects.equals(this.providerConfigTwitterEnableParams, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigTwitterEnableParams) &&
        Objects.equals(this.providerConfigTwitterParams, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigTwitterParams) &&
        Objects.equals(this.providerConfigRefreshUserdataEnabled, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigRefreshUserdataEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, oauthCloudConfigRoot, providerConfigRoot, providerConfigUserFolder, providerConfigTwitterEnableParams, providerConfigTwitterParams, providerConfigRefreshUserdataEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {\n");
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    oauthCloudConfigRoot: ").append(toIndentedString(oauthCloudConfigRoot)).append("\n");
    sb.append("    providerConfigRoot: ").append(toIndentedString(providerConfigRoot)).append("\n");
    sb.append("    providerConfigUserFolder: ").append(toIndentedString(providerConfigUserFolder)).append("\n");
    sb.append("    providerConfigTwitterEnableParams: ").append(toIndentedString(providerConfigTwitterEnableParams)).append("\n");
    sb.append("    providerConfigTwitterParams: ").append(toIndentedString(providerConfigTwitterParams)).append("\n");
    sb.append("    providerConfigRefreshUserdataEnabled: ").append(toIndentedString(providerConfigRefreshUserdataEnabled)).append("\n");
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

