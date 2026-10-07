package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("auth.ims.client.secret")
  private ConfigNodePropertyString authImsClientSecret;

  @JsonProperty("customizer.type")
  private ConfigNodePropertyString customizerType;

  /**
   * 
   * @return authImsClientSecret
   */
  public ConfigNodePropertyString getAuthImsClientSecret() {
    return authImsClientSecret;
  }

  public void setAuthImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
  }

  /**
   * 
   * @return customizerType
   */
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
    return Objects.equals(this.authImsClientSecret, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.authImsClientSecret) &&
        Objects.equals(this.customizerType, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.customizerType);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
