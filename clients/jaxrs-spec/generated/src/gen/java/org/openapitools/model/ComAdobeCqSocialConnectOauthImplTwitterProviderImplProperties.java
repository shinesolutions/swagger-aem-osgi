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


public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties   {
  
  private @Valid ConfigNodePropertyString oauthProviderId = null;
  private @Valid ConfigNodePropertyString oauthCloudConfigRoot = null;
  private @Valid ConfigNodePropertyString providerConfigRoot = null;
  private @Valid ConfigNodePropertyDropDown providerConfigUserFolder = null;
  private @Valid ConfigNodePropertyBoolean providerConfigTwitterEnableParams = null;
  private @Valid ConfigNodePropertyArray providerConfigTwitterParams = null;
  private @Valid ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
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
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties oauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
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
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigRoot(ConfigNodePropertyString providerConfigRoot) {
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
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
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
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.twitter.enable.params")
  public ConfigNodePropertyBoolean getProviderConfigTwitterEnableParams() {
    return providerConfigTwitterEnableParams;
  }
  public void setProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.twitter.params")
  public ConfigNodePropertyArray getProviderConfigTwitterParams() {
    return providerConfigTwitterParams;
  }
  public void setProviderConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

