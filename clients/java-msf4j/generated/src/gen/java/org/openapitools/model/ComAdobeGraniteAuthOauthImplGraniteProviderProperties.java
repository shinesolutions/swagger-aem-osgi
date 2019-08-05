package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteAuthOauthImplGraniteProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteAuthOauthImplGraniteProviderProperties   {
  @JsonProperty("oauth.provider.id")
  private ConfigNodePropertyString oauthProviderId = null;

  @JsonProperty("oauth.provider.granite.authorization.url")
  private ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl = null;

  @JsonProperty("oauth.provider.granite.token.url")
  private ConfigNodePropertyString oauthProviderGraniteTokenUrl = null;

  @JsonProperty("oauth.provider.granite.profile.url")
  private ConfigNodePropertyString oauthProviderGraniteProfileUrl = null;

  @JsonProperty("oauth.provider.granite.extended.details.urls")
  private ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls = null;

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

   /**
   * Get oauthProviderId
   * @return oauthProviderId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
    return this;
  }

   /**
   * Get oauthProviderGraniteAuthorizationUrl
   * @return oauthProviderGraniteAuthorizationUrl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthProviderGraniteAuthorizationUrl() {
    return oauthProviderGraniteAuthorizationUrl;
  }

  public void setOauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteTokenUrl(ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
    return this;
  }

   /**
   * Get oauthProviderGraniteTokenUrl
   * @return oauthProviderGraniteTokenUrl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthProviderGraniteTokenUrl() {
    return oauthProviderGraniteTokenUrl;
  }

  public void setOauthProviderGraniteTokenUrl(ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteProfileUrl(ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
    return this;
  }

   /**
   * Get oauthProviderGraniteProfileUrl
   * @return oauthProviderGraniteProfileUrl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthProviderGraniteProfileUrl() {
    return oauthProviderGraniteProfileUrl;
  }

  public void setOauthProviderGraniteProfileUrl(ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
  }

  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteExtendedDetailsUrls(ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
    this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
    return this;
  }

   /**
   * Get oauthProviderGraniteExtendedDetailsUrls
   * @return oauthProviderGraniteExtendedDetailsUrls
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthProviderGraniteExtendedDetailsUrls() {
    return oauthProviderGraniteExtendedDetailsUrls;
  }

  public void setOauthProviderGraniteExtendedDetailsUrls(ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
    this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties comAdobeGraniteAuthOauthImplGraniteProviderProperties = (ComAdobeGraniteAuthOauthImplGraniteProviderProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderId) &&
        Objects.equals(this.oauthProviderGraniteAuthorizationUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteAuthorizationUrl) &&
        Objects.equals(this.oauthProviderGraniteTokenUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteTokenUrl) &&
        Objects.equals(this.oauthProviderGraniteProfileUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteProfileUrl) &&
        Objects.equals(this.oauthProviderGraniteExtendedDetailsUrls, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteExtendedDetailsUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, oauthProviderGraniteAuthorizationUrl, oauthProviderGraniteTokenUrl, oauthProviderGraniteProfileUrl, oauthProviderGraniteExtendedDetailsUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {\n");
    
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    oauthProviderGraniteAuthorizationUrl: ").append(toIndentedString(oauthProviderGraniteAuthorizationUrl)).append("\n");
    sb.append("    oauthProviderGraniteTokenUrl: ").append(toIndentedString(oauthProviderGraniteTokenUrl)).append("\n");
    sb.append("    oauthProviderGraniteProfileUrl: ").append(toIndentedString(oauthProviderGraniteProfileUrl)).append("\n");
    sb.append("    oauthProviderGraniteExtendedDetailsUrls: ").append(toIndentedString(oauthProviderGraniteExtendedDetailsUrls)).append("\n");
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

