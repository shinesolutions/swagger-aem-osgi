package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties   {
  @JsonProperty("oauth.provider.id")
  private ConfigNodePropertyString oauthProviderId = null;

  public ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties comAdobeGraniteAuthOauthImplFacebookProviderImplProperties = (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeGraniteAuthOauthImplFacebookProviderImplProperties.oauthProviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties {\n");
    
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
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

