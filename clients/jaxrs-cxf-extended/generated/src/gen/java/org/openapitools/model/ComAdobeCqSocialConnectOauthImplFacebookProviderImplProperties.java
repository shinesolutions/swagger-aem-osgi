package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthCloudConfigRoot;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString providerConfigRoot;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean providerConfigCreateTagsEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown providerConfigUserFolder;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean providerConfigFacebookFetchFields;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray providerConfigFacebookFields;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;
 /**
  * Get oauthProviderId
  * @return oauthProviderId
  */
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  /**
   * Sets the <code>oauthProviderId</code> property.
   */
 public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  /**
   * Sets the <code>oauthProviderId</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

 /**
  * Get oauthCloudConfigRoot
  * @return oauthCloudConfigRoot
  */
  @JsonProperty("oauth.cloud.config.root")
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }

  /**
   * Sets the <code>oauthCloudConfigRoot</code> property.
   */
 public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  /**
   * Sets the <code>oauthCloudConfigRoot</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    return this;
  }

 /**
  * Get providerConfigRoot
  * @return providerConfigRoot
  */
  @JsonProperty("provider.config.root")
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }

  /**
   * Sets the <code>providerConfigRoot</code> property.
   */
 public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  /**
   * Sets the <code>providerConfigRoot</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
    return this;
  }

 /**
  * Get providerConfigCreateTagsEnabled
  * @return providerConfigCreateTagsEnabled
  */
  @JsonProperty("provider.config.create.tags.enabled")
  public ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
    return providerConfigCreateTagsEnabled;
  }

  /**
   * Sets the <code>providerConfigCreateTagsEnabled</code> property.
   */
 public void setProviderConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
  }

  /**
   * Sets the <code>providerConfigCreateTagsEnabled</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
    return this;
  }

 /**
  * Get providerConfigUserFolder
  * @return providerConfigUserFolder
  */
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  /**
   * Sets the <code>providerConfigUserFolder</code> property.
   */
 public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  /**
   * Sets the <code>providerConfigUserFolder</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
    return this;
  }

 /**
  * Get providerConfigFacebookFetchFields
  * @return providerConfigFacebookFetchFields
  */
  @JsonProperty("provider.config.facebook.fetch.fields")
  public ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
    return providerConfigFacebookFetchFields;
  }

  /**
   * Sets the <code>providerConfigFacebookFetchFields</code> property.
   */
 public void setProviderConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
  }

  /**
   * Sets the <code>providerConfigFacebookFetchFields</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
    return this;
  }

 /**
  * Get providerConfigFacebookFields
  * @return providerConfigFacebookFields
  */
  @JsonProperty("provider.config.facebook.fields")
  public ConfigNodePropertyArray getProviderConfigFacebookFields() {
    return providerConfigFacebookFields;
  }

  /**
   * Sets the <code>providerConfigFacebookFields</code> property.
   */
 public void setProviderConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
  }

  /**
   * Sets the <code>providerConfigFacebookFields</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
    return this;
  }

 /**
  * Get providerConfigRefreshUserdataEnabled
  * @return providerConfigRefreshUserdataEnabled
  */
  @JsonProperty("provider.config.refresh.userdata.enabled")
  public ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
    return providerConfigRefreshUserdataEnabled;
  }

  /**
   * Sets the <code>providerConfigRefreshUserdataEnabled</code> property.
   */
 public void setProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
  }

  /**
   * Sets the <code>providerConfigRefreshUserdataEnabled</code> property.
   */
  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

