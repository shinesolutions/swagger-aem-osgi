package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties   {
  private ConfigNodePropertyString authTokenValidatorType;

  public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties() {
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties authTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.validator.type")
  @Valid public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }

  @JsonProperty("auth.token.validator.type")
  public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties = (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties) o;
    return Objects.equals(this.authTokenValidatorType, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.authTokenValidatorType);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
