package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties   {
  
  private ConfigNodePropertyString oauthProviderId;
  private ConfigNodePropertyString oauthCloudConfigRoot;
  private ConfigNodePropertyString providerConfigRoot;
  private ConfigNodePropertyDropDown providerConfigUserFolder;
  private ConfigNodePropertyBoolean providerConfigTwitterEnableParams;
  private ConfigNodePropertyArray providerConfigTwitterParams;
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.id")
  @Valid
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }
  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.cloud.config.root")
  @Valid
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }
  public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.root")
  @Valid
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }
  public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.user.folder")
  @Valid
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }
  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.twitter.enable.params")
  @Valid
  public ConfigNodePropertyBoolean getProviderConfigTwitterEnableParams() {
    return providerConfigTwitterEnableParams;
  }
  public void setProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
    this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.twitter.params")
  @Valid
  public ConfigNodePropertyArray getProviderConfigTwitterParams() {
    return providerConfigTwitterParams;
  }
  public void setProviderConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
    this.providerConfigTwitterParams = providerConfigTwitterParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.config.refresh.userdata.enabled")
  @Valid
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

