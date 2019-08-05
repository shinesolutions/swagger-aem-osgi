package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jaasControlFlag = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jaasRealmName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger jaasRanking = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthOfflineValidation = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

 /**
   * Get jaasRealmName
   * @return jaasRealmName
  **/
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

 /**
   * Get jaasRanking
   * @return jaasRanking
  **/
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

 /**
   * Get oauthOfflineValidation
   * @return oauthOfflineValidation
  **/
  @JsonProperty("oauth.offline.validation")
  public ConfigNodePropertyBoolean getOauthOfflineValidation() {
    return oauthOfflineValidation;
  }

  public void setOauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
    this.oauthOfflineValidation = oauthOfflineValidation;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties oauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
    this.oauthOfflineValidation = oauthOfflineValidation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
    sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
    sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
    sb.append("    oauthOfflineValidation: ").append(toIndentedString(oauthOfflineValidation)).append("\n");
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

