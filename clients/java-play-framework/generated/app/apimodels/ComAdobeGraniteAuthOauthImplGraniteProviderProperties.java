package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteAuthOauthImplGraniteProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

