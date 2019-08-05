package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties   {
  
  private ConfigNodePropertyString oauthProviderId = null;
  private ConfigNodePropertyString oauthCloudConfigRoot = null;
  private ConfigNodePropertyString providerConfigRoot = null;
  private ConfigNodePropertyBoolean providerConfigCreateTagsEnabled = null;
  private ConfigNodePropertyDropDown providerConfigUserFolder = null;
  private ConfigNodePropertyBoolean providerConfigFacebookFetchFields = null;
  private ConfigNodePropertyArray providerConfigFacebookFields = null;
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties () {

  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties (ConfigNodePropertyString oauthProviderId, ConfigNodePropertyString oauthCloudConfigRoot, ConfigNodePropertyString providerConfigRoot, ConfigNodePropertyBoolean providerConfigCreateTagsEnabled, ConfigNodePropertyDropDown providerConfigUserFolder, ConfigNodePropertyBoolean providerConfigFacebookFetchFields, ConfigNodePropertyArray providerConfigFacebookFields, ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.oauthProviderId = oauthProviderId;
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    this.providerConfigRoot = providerConfigRoot;
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
    this.providerConfigUserFolder = providerConfigUserFolder;
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
    this.providerConfigFacebookFields = providerConfigFacebookFields;
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
  }

    
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }
  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

    
  @JsonProperty("oauth.cloud.config.root")
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }
  public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

    
  @JsonProperty("provider.config.root")
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }
  public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

    
  @JsonProperty("provider.config.create.tags.enabled")
  public ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
    return providerConfigCreateTagsEnabled;
  }
  public void setProviderConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
  }

    
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }
  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

    
  @JsonProperty("provider.config.facebook.fetch.fields")
  public ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
    return providerConfigFacebookFetchFields;
  }
  public void setProviderConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
  }

    
  @JsonProperty("provider.config.facebook.fields")
  public ConfigNodePropertyArray getProviderConfigFacebookFields() {
    return providerConfigFacebookFields;
  }
  public void setProviderConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
