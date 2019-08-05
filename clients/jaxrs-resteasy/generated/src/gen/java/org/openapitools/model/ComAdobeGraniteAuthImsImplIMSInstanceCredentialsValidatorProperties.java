package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties   {
  
  private ConfigNodePropertyString oauthProviderId = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties = (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties) o;
    return Objects.equals(oauthProviderId, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.oauthProviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties {\n");
    
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

