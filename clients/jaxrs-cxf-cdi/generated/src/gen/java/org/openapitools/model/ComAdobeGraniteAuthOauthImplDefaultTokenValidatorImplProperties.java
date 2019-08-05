package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties   {
  
  private ConfigNodePropertyString authTokenValidatorType = null;


  /**
   **/
  public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties authTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.validator.type")
  public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }
  public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties = (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties) o;
    return Objects.equals(authTokenValidatorType, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.authTokenValidatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authTokenValidatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {\n");
    
    sb.append("    authTokenValidatorType: ").append(toIndentedString(authTokenValidatorType)).append("\n");
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

