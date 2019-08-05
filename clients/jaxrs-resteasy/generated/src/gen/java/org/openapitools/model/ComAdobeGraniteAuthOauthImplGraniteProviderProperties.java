package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteAuthOauthImplGraniteProviderProperties   {
  
  private ConfigNodePropertyString oauthProviderId = null;
  private ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl = null;
  private ConfigNodePropertyString oauthProviderGraniteTokenUrl = null;
  private ConfigNodePropertyString oauthProviderGraniteProfileUrl = null;
  private ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls = null;

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
  @JsonProperty("oauth.provider.granite.authorization.url")
  public ConfigNodePropertyString getOauthProviderGraniteAuthorizationUrl() {
    return oauthProviderGraniteAuthorizationUrl;
  }
  public void setOauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
    this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.granite.token.url")
  public ConfigNodePropertyString getOauthProviderGraniteTokenUrl() {
    return oauthProviderGraniteTokenUrl;
  }
  public void setOauthProviderGraniteTokenUrl(ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
    this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.granite.profile.url")
  public ConfigNodePropertyString getOauthProviderGraniteProfileUrl() {
    return oauthProviderGraniteProfileUrl;
  }
  public void setOauthProviderGraniteProfileUrl(ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
    this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.granite.extended.details.urls")
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
    return Objects.equals(oauthProviderId, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderId) &&
        Objects.equals(oauthProviderGraniteAuthorizationUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteAuthorizationUrl) &&
        Objects.equals(oauthProviderGraniteTokenUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteTokenUrl) &&
        Objects.equals(oauthProviderGraniteProfileUrl, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteProfileUrl) &&
        Objects.equals(oauthProviderGraniteExtendedDetailsUrls, comAdobeGraniteAuthOauthImplGraniteProviderProperties.oauthProviderGraniteExtendedDetailsUrls);
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

