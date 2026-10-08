package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties   {
  @JsonProperty("path")
  @Valid

  private ConfigNodePropertyString path;

  @JsonProperty("jaas.controlFlag")
  @Valid

  private ConfigNodePropertyString jaasControlFlag;

  @JsonProperty("jaas.realmName")
  @Valid

  private ConfigNodePropertyString jaasRealmName;

  @JsonProperty("jaas.ranking")
  @Valid

  private ConfigNodePropertyInteger jaasRanking;

  @JsonProperty("oauth.offline.validation")
  @Valid

  private ConfigNodePropertyBoolean oauthOfflineValidation;

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

   /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

   /**
   * Get jaasRealmName
   * @return jaasRealmName
  **/
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

   /**
   * Get jaasRanking
   * @return jaasRanking
  **/
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties oauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
    this.oauthOfflineValidation = oauthOfflineValidation;
    return this;
  }

   /**
   * Get oauthOfflineValidation
   * @return oauthOfflineValidation
  **/
  public ConfigNodePropertyBoolean getOauthOfflineValidation() {
    return oauthOfflineValidation;
  }

  public void setOauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
    this.oauthOfflineValidation = oauthOfflineValidation;
  }


  @Override
  public boolean equals(Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

