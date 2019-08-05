package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties   {
  

  private ConfigNodePropertyString oauthProviderId = null;

  private ConfigNodePropertyString oauthCloudConfigRoot = null;

  private ConfigNodePropertyString providerConfigRoot = null;

  private ConfigNodePropertyBoolean providerConfigCreateTagsEnabled = null;

  private ConfigNodePropertyDropDown providerConfigUserFolder = null;

  private ConfigNodePropertyBoolean providerConfigFacebookFetchFields = null;

  private ConfigNodePropertyArray providerConfigFacebookFields = null;

  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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

