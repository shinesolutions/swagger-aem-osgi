package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties   {
  @JsonProperty("oauth.provider.id")
  private ConfigNodePropertyString oauthProviderId = null;

  @JsonProperty("oauth.cloud.config.root")
  private ConfigNodePropertyString oauthCloudConfigRoot = null;

  @JsonProperty("provider.config.root")
  private ConfigNodePropertyString providerConfigRoot = null;

  @JsonProperty("provider.config.create.tags.enabled")
  private ConfigNodePropertyBoolean providerConfigCreateTagsEnabled = null;

  @JsonProperty("provider.config.user.folder")
  private ConfigNodePropertyDropDown providerConfigUserFolder = null;

  @JsonProperty("provider.config.facebook.fetch.fields")
  private ConfigNodePropertyBoolean providerConfigFacebookFetchFields = null;

  @JsonProperty("provider.config.facebook.fields")
  private ConfigNodePropertyArray providerConfigFacebookFields = null;

  @JsonProperty("provider.config.refresh.userdata.enabled")
  private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled = null;

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

   /**
   * Get oauthProviderId
   * @return oauthProviderId
  **/
  @Valid
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties oauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    return this;
  }

   /**
   * Get oauthCloudConfigRoot
   * @return oauthCloudConfigRoot
  **/
  @Valid
  public ConfigNodePropertyString getOauthCloudConfigRoot() {
    return oauthCloudConfigRoot;
  }

  public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
    this.oauthCloudConfigRoot = oauthCloudConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
    return this;
  }

   /**
   * Get providerConfigRoot
   * @return providerConfigRoot
  **/
  @Valid
  public ConfigNodePropertyString getProviderConfigRoot() {
    return providerConfigRoot;
  }

  public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
    this.providerConfigRoot = providerConfigRoot;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
    return this;
  }

   /**
   * Get providerConfigCreateTagsEnabled
   * @return providerConfigCreateTagsEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
    return providerConfigCreateTagsEnabled;
  }

  public void setProviderConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
    this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
    return this;
  }

   /**
   * Get providerConfigUserFolder
   * @return providerConfigUserFolder
  **/
  @Valid
  public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
    return providerConfigUserFolder;
  }

  public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
    this.providerConfigUserFolder = providerConfigUserFolder;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
    return this;
  }

   /**
   * Get providerConfigFacebookFetchFields
   * @return providerConfigFacebookFetchFields
  **/
  @Valid
  public ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
    return providerConfigFacebookFetchFields;
  }

  public void setProviderConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
    this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
    return this;
  }

   /**
   * Get providerConfigFacebookFields
   * @return providerConfigFacebookFields
  **/
  @Valid
  public ConfigNodePropertyArray getProviderConfigFacebookFields() {
    return providerConfigFacebookFields;
  }

  public void setProviderConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
    this.providerConfigFacebookFields = providerConfigFacebookFields;
  }

  public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties providerConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
    this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
    return this;
  }

   /**
   * Get providerConfigRefreshUserdataEnabled
   * @return providerConfigRefreshUserdataEnabled
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

