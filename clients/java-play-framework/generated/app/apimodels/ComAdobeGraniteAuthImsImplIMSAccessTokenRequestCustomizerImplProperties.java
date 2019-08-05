package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties   {
  @JsonProperty("auth.ims.client.secret")
  private ConfigNodePropertyString authImsClientSecret = null;

  @JsonProperty("customizer.type")
  private ConfigNodePropertyString customizerType = null;

  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties authImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
    return this;
  }

   /**
   * Get authImsClientSecret
   * @return authImsClientSecret
  **/
  @Valid
  public ConfigNodePropertyString getAuthImsClientSecret() {
    return authImsClientSecret;
  }

  public void setAuthImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
  }

  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties customizerType(ConfigNodePropertyString customizerType) {
    this.customizerType = customizerType;
    return this;
  }

   /**
   * Get customizerType
   * @return customizerType
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

