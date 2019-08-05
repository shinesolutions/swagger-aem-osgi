package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties   {
  

  private ConfigNodePropertyString authImsClientSecret = null;

  private ConfigNodePropertyString customizerType = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.ims.client.secret")
  public ConfigNodePropertyString getAuthImsClientSecret() {
    return authImsClientSecret;
  }
  public void setAuthImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customizer.type")
  public ConfigNodePropertyString getCustomizerType() {
    return customizerType;
  }
  public void setCustomizerType(ConfigNodePropertyString customizerType) {
    this.customizerType = customizerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties = (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties) o;
    return Objects.equals(authImsClientSecret, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.authImsClientSecret) &&
        Objects.equals(customizerType, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.customizerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authImsClientSecret, customizerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties {\n");
    
    sb.append("    authImsClientSecret: ").append(toIndentedString(authImsClientSecret)).append("\n");
    sb.append("    customizerType: ").append(toIndentedString(customizerType)).append("\n");
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

