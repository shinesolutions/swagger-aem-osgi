package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties   {
  
  private ConfigNodePropertyString oauthProviderId = null;
  private ConfigNodePropertyString oauthCloudConfigRoot = null;
  private ConfigNodePropertyString providerConfigRoot = null;
  private ConfigNodePropertyDropDown providerConfigUserFolder = null;
  private ConfigNodePropertyBoolean providerConfigTwitterEnableParams = null;
  private ConfigNodePropertyArray providerConfigTwitterParams = null;
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties () {

  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties (ConfigNodePropertyString oauthProviderId, ConfigNodePropertyString oauthCloudConfigRoot, ConfigNodePropertyString providerConfigRoot, ConfigNodePropertyDropDown providerConfigUserFolder, ConfigNodePropertyBoolean providerConfigTwitterEnableParams, ConfigNodePropertyArray providerConfigTwitterParams, ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.oauthProviderId = oauthProviderId;
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    this.providerConfigRoot = providerConfigRoot;
    this.providerConfigUserFolder = providerConfigUserFolder;
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
    this.providerConfigTwitterParams = providerConfigTwitterParams;
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

    
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }
  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

    
  @JsonProperty("provider.config.twitter.enable.params")
  public ConfigNodePropertyBoolean getProviderConfigTwitterEnableParams() {
    return providerConfigTwitterEnableParams;
  }
  public void setProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
  }

    
  @JsonProperty("provider.config.twitter.params")
  public ConfigNodePropertyArray getProviderConfigTwitterParams() {
    return providerConfigTwitterParams;
  }
  public void setProviderConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
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
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties = (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties) o;
    return Objects.equals(oauthProviderId, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.oauthProviderId) &&
        Objects.equals(oauthCloudConfigRoot, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.oauthCloudConfigRoot) &&
        Objects.equals(providerConfigRoot, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigRoot) &&
        Objects.equals(providerConfigUserFolder, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigUserFolder) &&
        Objects.equals(providerConfigTwitterEnableParams, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigTwitterEnableParams) &&
        Objects.equals(providerConfigTwitterParams, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigTwitterParams) &&
        Objects.equals(providerConfigRefreshUserdataEnabled, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.providerConfigRefreshUserdataEnabled);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
