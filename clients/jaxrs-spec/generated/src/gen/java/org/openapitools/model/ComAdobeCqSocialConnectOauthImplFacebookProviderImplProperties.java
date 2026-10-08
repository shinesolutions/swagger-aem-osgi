package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties   {
  private ConfigNodePropertyString oauthProviderId;
  private ConfigNodePropertyString oauthCloudConfigRoot;
  private ConfigNodePropertyString providerConfigRoot;
  private ConfigNodePropertyBoolean providerConfigCreateTagsEnabled;
  private ConfigNodePropertyDropDown providerConfigUserFolder;
  private ConfigNodePropertyBoolean providerConfigFacebookFetchFields;
  private ConfigNodePropertyArray providerConfigFacebookFields;
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.id")
  @Valid public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  @JsonProperty("oauth.provider.id")
  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.cloud.config.root")
  @Valid public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }

  @JsonProperty("oauth.cloud.config.root")
  public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.root")
  @Valid public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }

  @JsonProperty("provider.config.root")
  public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.create.tags.enabled")
  @Valid public ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
    return providerConfigCreateTagsEnabled;
  }

  @JsonProperty("provider.config.create.tags.enabled")
  public void setProviderConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.user.folder")
  @Valid public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  @JsonProperty("provider.config.user.folder")
  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.facebook.fetch.fields")
  @Valid public ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
    return providerConfigFacebookFetchFields;
  }

  @JsonProperty("provider.config.facebook.fetch.fields")
  public void setProviderConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.facebook.fields")
  @Valid public ConfigNodePropertyArray getProviderConfigFacebookFields() {
    return providerConfigFacebookFields;
  }

  @JsonProperty("provider.config.facebook.fields")
  public void setProviderConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.refresh.userdata.enabled")
  @Valid public ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
    return providerConfigRefreshUserdataEnabled;
  }

  @JsonProperty("provider.config.refresh.userdata.enabled")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
