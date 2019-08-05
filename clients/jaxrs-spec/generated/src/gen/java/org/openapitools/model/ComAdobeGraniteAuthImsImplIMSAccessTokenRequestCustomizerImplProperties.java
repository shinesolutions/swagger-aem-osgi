package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties   {
  
  private @Valid ConfigNodePropertyString authImsClientSecret = null;
  private @Valid ConfigNodePropertyString customizerType = null;

  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties authImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
    return this;
  }

  
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
  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties customizerType(ConfigNodePropertyString customizerType) {
    this.customizerType = customizerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customizer.type")
  public ConfigNodePropertyString getCustomizerType() {
    return customizerType;
  }
  public void setCustomizerType(ConfigNodePropertyString customizerType) {
    this.customizerType = customizerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

