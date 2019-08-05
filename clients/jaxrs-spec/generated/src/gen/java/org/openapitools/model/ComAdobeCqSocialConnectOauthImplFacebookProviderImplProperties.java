package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties   {
  
  private @Valid ConfigNodePropertyString oauthProviderId = null;
  private @Valid ConfigNodePropertyString oauthCloudConfigRoot = null;
  private @Valid ConfigNodePropertyString providerConfigRoot = null;
  private @Valid ConfigNodePropertyBoolean providerConfigCreateTagsEnabled = null;
  private @Valid ConfigNodePropertyDropDown providerConfigUserFolder = null;
  private @Valid ConfigNodePropertyBoolean providerConfigFacebookFetchFields = null;
  private @Valid ConfigNodePropertyArray providerConfigFacebookFields = null;
  private @Valid ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }
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
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }
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
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }
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
  public ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
    return providerConfigCreateTagsEnabled;
  }
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
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }
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
  public ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
    return providerConfigFacebookFetchFields;
  }
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
  public ConfigNodePropertyArray getProviderConfigFacebookFields() {
    return providerConfigFacebookFields;
  }
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
  public ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
    return providerConfigRefreshUserdataEnabled;
  }
  public void setProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties = (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties) o;
    return Objects.equals(oauthProviderId, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.oauthProviderId) &&
        Objects.equals(oauthCloudConfigRoot, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.oauthCloudConfigRoot) &&
        Objects.equals(providerConfigRoot, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigRoot) &&
        Objects.equals(providerConfigCreateTagsEnabled, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigCreateTagsEnabled) &&
        Objects.equals(providerConfigUserFolder, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigUserFolder) &&
        Objects.equals(providerConfigFacebookFetchFields, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigFacebookFetchFields) &&
        Objects.equals(providerConfigFacebookFields, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigFacebookFields) &&
        Objects.equals(providerConfigRefreshUserdataEnabled, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.providerConfigRefreshUserdataEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

