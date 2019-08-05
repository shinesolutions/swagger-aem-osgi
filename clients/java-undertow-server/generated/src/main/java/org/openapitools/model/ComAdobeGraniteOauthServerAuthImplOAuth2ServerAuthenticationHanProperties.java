package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties   {
  
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyString jaasControlFlag = null;
  private ConfigNodePropertyString jaasRealmName = null;
  private ConfigNodePropertyInteger jaasRanking = null;
  private ConfigNodePropertyBoolean oauthOfflineValidation = null;

  /**
   **/
  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }
  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }
  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }
  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  /**
   **/
  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties oauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
    this.oauthOfflineValidation = oauthOfflineValidation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.offline.validation")
  public ConfigNodePropertyBoolean getOauthOfflineValidation() {
    return oauthOfflineValidation;
  }
  public void setOauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
    this.oauthOfflineValidation = oauthOfflineValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties = (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties) o;
    return Objects.equals(path, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.path) &&
        Objects.equals(jaasControlFlag, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.jaasControlFlag) &&
        Objects.equals(jaasRealmName, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.jaasRealmName) &&
        Objects.equals(jaasRanking, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.jaasRanking) &&
        Objects.equals(oauthOfflineValidation, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.oauthOfflineValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, jaasControlFlag, jaasRealmName, jaasRanking, oauthOfflineValidation);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

