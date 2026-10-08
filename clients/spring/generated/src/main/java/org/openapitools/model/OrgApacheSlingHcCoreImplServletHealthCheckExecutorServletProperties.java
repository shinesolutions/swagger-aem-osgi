package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
 */

@JsonTypeName("orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString servletPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean disabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString corsAccessControlAllowOrigin;

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties servletPath(@Nullable ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
    return this;
  }

  /**
   * Get servletPath
   * @return servletPath
   */
  @Valid 
  @Schema(name = "servletPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servletPath")
  public @Nullable ConfigNodePropertyString getServletPath() {
    return servletPath;
  }

  @JsonProperty("servletPath")
  public void setServletPath(@Nullable ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
  }

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties disabled(@Nullable ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   */
  @Valid 
  @Schema(name = "disabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled")
  public @Nullable ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }

  @JsonProperty("disabled")
  public void setDisabled(@Nullable ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties corsAccessControlAllowOrigin(@Nullable ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
    return this;
  }

  /**
   * Get corsAccessControlAllowOrigin
   * @return corsAccessControlAllowOrigin
   */
  @Valid 
  @Schema(name = "cors.accessControlAllowOrigin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cors.accessControlAllowOrigin")
  public @Nullable ConfigNodePropertyString getCorsAccessControlAllowOrigin() {
    return corsAccessControlAllowOrigin;
  }

  @JsonProperty("cors.accessControlAllowOrigin")
  public void setCorsAccessControlAllowOrigin(@Nullable ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties = (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties) o;
    return Objects.equals(this.servletPath, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.servletPath) &&
        Objects.equals(this.disabled, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.disabled) &&
        Objects.equals(this.corsAccessControlAllowOrigin, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.corsAccessControlAllowOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servletPath, disabled, corsAccessControlAllowOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {\n");
    sb.append("    servletPath: ").append(toIndentedString(servletPath)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    corsAccessControlAllowOrigin: ").append(toIndentedString(corsAccessControlAllowOrigin)).append("\n");
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

