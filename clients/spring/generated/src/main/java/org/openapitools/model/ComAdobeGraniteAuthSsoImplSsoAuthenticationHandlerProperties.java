package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
 */

@JsonTypeName("comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasControlFlag;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasRealmName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger jaasRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray headers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cookies;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray parameters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray usermap;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString format;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString trustedCredentialsAttribute;

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties path(@Nullable ConfigNodePropertyString path) {
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

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasControlFlag(@Nullable ConfigNodePropertyString jaasControlFlag) {
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

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
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

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
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

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties headers(@Nullable ConfigNodePropertyArray headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  @Valid 
  @Schema(name = "headers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public @Nullable ConfigNodePropertyArray getHeaders() {
    return headers;
  }

  @JsonProperty("headers")
  public void setHeaders(@Nullable ConfigNodePropertyArray headers) {
    this.headers = headers;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties cookies(@Nullable ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
    return this;
  }

  /**
   * Get cookies
   * @return cookies
   */
  @Valid 
  @Schema(name = "cookies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cookies")
  public @Nullable ConfigNodePropertyArray getCookies() {
    return cookies;
  }

  @JsonProperty("cookies")
  public void setCookies(@Nullable ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties parameters(@Nullable ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   */
  @Valid 
  @Schema(name = "parameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public @Nullable ConfigNodePropertyArray getParameters() {
    return parameters;
  }

  @JsonProperty("parameters")
  public void setParameters(@Nullable ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties usermap(@Nullable ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
    return this;
  }

  /**
   * Get usermap
   * @return usermap
   */
  @Valid 
  @Schema(name = "usermap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usermap")
  public @Nullable ConfigNodePropertyArray getUsermap() {
    return usermap;
  }

  @JsonProperty("usermap")
  public void setUsermap(@Nullable ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties format(@Nullable ConfigNodePropertyString format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @Valid 
  @Schema(name = "format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable ConfigNodePropertyString getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(@Nullable ConfigNodePropertyString format) {
    this.format = format;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties trustedCredentialsAttribute(@Nullable ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
    return this;
  }

  /**
   * Get trustedCredentialsAttribute
   * @return trustedCredentialsAttribute
   */
  @Valid 
  @Schema(name = "trustedCredentialsAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trustedCredentialsAttribute")
  public @Nullable ConfigNodePropertyString getTrustedCredentialsAttribute() {
    return trustedCredentialsAttribute;
  }

  @JsonProperty("trustedCredentialsAttribute")
  public void setTrustedCredentialsAttribute(@Nullable ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties) o;
    return Objects.equals(this.path, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.path) &&
        Objects.equals(this.serviceRanking, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.serviceRanking) &&
        Objects.equals(this.jaasControlFlag, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasControlFlag) &&
        Objects.equals(this.jaasRealmName, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasRealmName) &&
        Objects.equals(this.jaasRanking, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasRanking) &&
        Objects.equals(this.headers, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.headers) &&
        Objects.equals(this.cookies, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.cookies) &&
        Objects.equals(this.parameters, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.parameters) &&
        Objects.equals(this.usermap, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.usermap) &&
        Objects.equals(this.format, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.format) &&
        Objects.equals(this.trustedCredentialsAttribute, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.trustedCredentialsAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, jaasControlFlag, jaasRealmName, jaasRanking, headers, cookies, parameters, usermap, format, trustedCredentialsAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
    sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
    sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    usermap: ").append(toIndentedString(usermap)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    trustedCredentialsAttribute: ").append(toIndentedString(trustedCredentialsAttribute)).append("\n");
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

