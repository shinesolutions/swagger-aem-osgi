package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties   {
  
  private ConfigNodePropertyString authTokenValidatorType = null;

  public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties () {

  }

  public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties (ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }

    
  @JsonProperty("auth.token.validator.type")
  public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
