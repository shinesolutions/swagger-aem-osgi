package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties   {
  
  private ConfigNodePropertyString authImsClientSecret = null;
  private ConfigNodePropertyString customizerType = null;

  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties () {

  }

  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties (ConfigNodePropertyString authImsClientSecret, ConfigNodePropertyString customizerType) {
    this.authImsClientSecret = authImsClientSecret;
    this.customizerType = customizerType;
  }

    
  @JsonProperty("auth.ims.client.secret")
  public ConfigNodePropertyString getAuthImsClientSecret() {
    return authImsClientSecret;
  }
  public void setAuthImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
  }

    
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
