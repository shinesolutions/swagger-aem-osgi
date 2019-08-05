package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authImsClientSecret = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString customizerType = null;
 /**
   * Get authImsClientSecret
   * @return authImsClientSecret
  **/
  @JsonProperty("auth.ims.client.secret")
  public ConfigNodePropertyString getAuthImsClientSecret() {
    return authImsClientSecret;
  }

  public void setAuthImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
  }

  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties authImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
    this.authImsClientSecret = authImsClientSecret;
    return this;
  }

 /**
   * Get customizerType
   * @return customizerType
  **/
  @JsonProperty("customizer.type")
  public ConfigNodePropertyString getCustomizerType() {
    return customizerType;
  }

  public void setCustomizerType(ConfigNodePropertyString customizerType) {
    this.customizerType = customizerType;
  }

  public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties customizerType(ConfigNodePropertyString customizerType) {
    this.customizerType = customizerType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

