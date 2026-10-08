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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasControlFlag;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasRealmName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger jaasRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthOfflineValidation;

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties path(@Nullable ConfigNodePropertyString path) {
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
  public @Nullable ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasControlFlag(@Nullable ConfigNodePropertyString jaasControlFlag) {
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
  public @Nullable ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  @JsonProperty("jaas.controlFlag")
  public void setJaasControlFlag(@Nullable ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
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
  public @Nullable ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  @JsonProperty("jaas.realmName")
  public void setJaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties jaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
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
  public @Nullable ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  @JsonProperty("jaas.ranking")
  public void setJaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties oauthOfflineValidation(@Nullable ConfigNodePropertyBoolean oauthOfflineValidation) {
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
  public @Nullable ConfigNodePropertyBoolean getOauthOfflineValidation() {
    return oauthOfflineValidation;
  }

  @JsonProperty("oauth.offline.validation")
  public void setOauthOfflineValidation(@Nullable ConfigNodePropertyBoolean oauthOfflineValidation) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

