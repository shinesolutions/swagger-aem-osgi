package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean oauthTokenRevocationActive = null;
 /**
   * Get oauthTokenRevocationActive
   * @return oauthTokenRevocationActive
  **/
  @JsonProperty("oauth.token.revocation.active")
  public ConfigNodePropertyBoolean getOauthTokenRevocationActive() {
    return oauthTokenRevocationActive;
  }

  public void setOauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties oauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
    this.oauthTokenRevocationActive = oauthTokenRevocationActive;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {\n");
    
    sb.append("    oauthTokenRevocationActive: ").append(toIndentedString(oauthTokenRevocationActive)).append("\n");
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

