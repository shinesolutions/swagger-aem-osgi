package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthOauthImplGraniteProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderGraniteTokenUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderGraniteProfileUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls;
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
  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

 /**
  * Get oauthProviderGraniteAuthorizationUrl
  * @return oauthProviderGraniteAuthorizationUrl
  */
  @JsonProperty("oauth.provider.granite.authorization.url")
  public ConfigNodePropertyString getOauthProviderGraniteAuthorizationUrl() {
    return oauthProviderGraniteAuthorizationUrl;
  }

  /**
   * Sets the <code>oauthProviderGraniteAuthorizationUrl</code> property.
   */
 public void setOauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
  }

  /**
   * Sets the <code>oauthProviderGraniteAuthorizationUrl</code> property.
   */
  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
    return this;
  }

 /**
  * Get oauthProviderGraniteTokenUrl
  * @return oauthProviderGraniteTokenUrl
  */
  @JsonProperty("oauth.provider.granite.token.url")
  public ConfigNodePropertyString getOauthProviderGraniteTokenUrl() {
    return oauthProviderGraniteTokenUrl;
  }

  /**
   * Sets the <code>oauthProviderGraniteTokenUrl</code> property.
   */
 public void setOauthProviderGraniteTokenUrl(ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
  }

  /**
   * Sets the <code>oauthProviderGraniteTokenUrl</code> property.
   */
  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteTokenUrl(ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
    return this;
  }

 /**
  * Get oauthProviderGraniteProfileUrl
  * @return oauthProviderGraniteProfileUrl
  */
  @JsonProperty("oauth.provider.granite.profile.url")
  public ConfigNodePropertyString getOauthProviderGraniteProfileUrl() {
    return oauthProviderGraniteProfileUrl;
  }

  /**
   * Sets the <code>oauthProviderGraniteProfileUrl</code> property.
   */
 public void setOauthProviderGraniteProfileUrl(ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
  }

  /**
   * Sets the <code>oauthProviderGraniteProfileUrl</code> property.
   */
  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteProfileUrl(ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
    return this;
  }

 /**
  * Get oauthProviderGraniteExtendedDetailsUrls
  * @return oauthProviderGraniteExtendedDetailsUrls
  */
  @JsonProperty("oauth.provider.granite.extended.details.urls")
  public ConfigNodePropertyString getOauthProviderGraniteExtendedDetailsUrls() {
    return oauthProviderGraniteExtendedDetailsUrls;
  }

  /**
   * Sets the <code>oauthProviderGraniteExtendedDetailsUrls</code> property.
   */
 public void setOauthProviderGraniteExtendedDetailsUrls(ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
    this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
  }

  /**
   * Sets the <code>oauthProviderGraniteExtendedDetailsUrls</code> property.
   */
  public ComAdobeGraniteAuthOauthImplGraniteProviderProperties oauthProviderGraniteExtendedDetailsUrls(ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
    this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

