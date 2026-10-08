package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties   {
  
  private ConfigNodePropertyString oauthProviderId;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties = (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.oauthProviderId);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

