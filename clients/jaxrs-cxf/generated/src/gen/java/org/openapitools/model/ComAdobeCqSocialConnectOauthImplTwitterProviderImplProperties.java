package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthCloudConfigRoot = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString providerConfigRoot = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown providerConfigUserFolder = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean providerConfigTwitterEnableParams = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray providerConfigTwitterParams = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;
 /**
   * Get oauthProviderId
   * @return oauthProviderId
  **/
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

 /**
   * Get oauthCloudConfigRoot
   * @return oauthCloudConfigRoot
  **/
  @JsonProperty("oauth.cloud.config.root")
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }

  public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties oauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    return this;
  }

 /**
   * Get providerConfigRoot
   * @return providerConfigRoot
  **/
  @JsonProperty("provider.config.root")
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }

  public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
    return this;
  }

 /**
   * Get providerConfigUserFolder
   * @return providerConfigUserFolder
  **/
  @JsonProperty("provider.config.user.folder")
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
    return this;
  }

 /**
   * Get providerConfigTwitterEnableParams
   * @return providerConfigTwitterEnableParams
  **/
  @JsonProperty("provider.config.twitter.enable.params")
  public ConfigNodePropertyBoolean getProviderConfigTwitterEnableParams() {
    return providerConfigTwitterEnableParams;
  }

  public void setProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
    return this;
  }

 /**
   * Get providerConfigTwitterParams
   * @return providerConfigTwitterParams
  **/
  @JsonProperty("provider.config.twitter.params")
  public ConfigNodePropertyArray getProviderConfigTwitterParams() {
    return providerConfigTwitterParams;
  }

  public void setProviderConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
    return this;
  }

 /**
   * Get providerConfigRefreshUserdataEnabled
   * @return providerConfigRefreshUserdataEnabled
  **/
  @JsonProperty("provider.config.refresh.userdata.enabled")
  public ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
    return providerConfigRefreshUserdataEnabled;
  }

  public void setProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
  }

  public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties providerConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

