package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
 */

@JsonTypeName("comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {

  private ConfigNodePropertyString path;

  private ConfigNodePropertyString jaasControlFlag;

  private ConfigNodePropertyString jaasRealmName;

  private ConfigNodePropertyInteger jaasRanking;

  private ConfigNodePropertyBoolean oauthOfflineValidation;

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
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
   */
  @Valid 
  @Schema(name = "jaas.controlFlag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.controlFlag")
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
   */
  @Valid 
  @Schema(name = "jaas.realmName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.realmName")
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
   */
  @Valid 
  @Schema(name = "jaas.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.ranking")
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
   */
  @Valid 
  @Schema(name = "oauth.offline.validation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.offline.validation")
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
    return Objects.equals(this.path, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.path) &&
        Objects.equals(this.jaasControlFlag, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.jaasControlFlag) &&
        Objects.equals(this.jaasRealmName, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.jaasRealmName) &&
        Objects.equals(this.jaasRanking, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.jaasRanking) &&
        Objects.equals(this.oauthOfflineValidation, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.oauthOfflineValidation);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

