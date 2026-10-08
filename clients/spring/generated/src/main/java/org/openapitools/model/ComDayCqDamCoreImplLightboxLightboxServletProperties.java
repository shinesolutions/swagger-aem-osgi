package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqDamCoreImplLightboxLightboxServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplLightboxLightboxServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplLightboxLightboxServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingServletMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamEnableAnonymous;

  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletPaths(@Nullable ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

  /**
   * Get slingServletPaths
   * @return slingServletPaths
   */
  @Valid 
  @Schema(name = "sling.servlet.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.paths")
  public @Nullable ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  @JsonProperty("sling.servlet.paths")
  public void setSlingServletPaths(@Nullable ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletMethods(@Nullable ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  /**
   * Get slingServletMethods
   * @return slingServletMethods
   */
  @Valid 
  @Schema(name = "sling.servlet.methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.methods")
  public @Nullable ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  @JsonProperty("sling.servlet.methods")
  public void setSlingServletMethods(@Nullable ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamCoreImplLightboxLightboxServletProperties cqDamEnableAnonymous(@Nullable ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
    return this;
  }

  /**
   * Get cqDamEnableAnonymous
   * @return cqDamEnableAnonymous
   */
  @Valid 
  @Schema(name = "cq.dam.enable.anonymous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.enable.anonymous")
  public @Nullable ConfigNodePropertyBoolean getCqDamEnableAnonymous() {
    return cqDamEnableAnonymous;
  }

  @JsonProperty("cq.dam.enable.anonymous")
  public void setCqDamEnableAnonymous(@Nullable ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplLightboxLightboxServletProperties comDayCqDamCoreImplLightboxLightboxServletProperties = (ComDayCqDamCoreImplLightboxLightboxServletProperties) o;
    return Objects.equals(this.slingServletPaths, comDayCqDamCoreImplLightboxLightboxServletProperties.slingServletPaths) &&
        Objects.equals(this.slingServletMethods, comDayCqDamCoreImplLightboxLightboxServletProperties.slingServletMethods) &&
        Objects.equals(this.cqDamEnableAnonymous, comDayCqDamCoreImplLightboxLightboxServletProperties.cqDamEnableAnonymous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, slingServletMethods, cqDamEnableAnonymous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplLightboxLightboxServletProperties {\n");
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    cqDamEnableAnonymous: ").append(toIndentedString(cqDamEnableAnonymous)).append("\n");
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

