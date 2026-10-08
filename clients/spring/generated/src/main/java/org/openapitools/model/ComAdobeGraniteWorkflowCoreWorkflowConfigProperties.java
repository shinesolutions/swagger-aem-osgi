package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
 */

@JsonTypeName("comAdobeGraniteWorkflowCoreWorkflowConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking;

  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowPackagesRootPath(@Nullable ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
    return this;
  }

  /**
   * Get cqWorkflowConfigWorkflowPackagesRootPath
   * @return cqWorkflowConfigWorkflowPackagesRootPath
   */
  @Valid 
  @Schema(name = "cq.workflow.config.workflow.packages.root.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.workflow.config.workflow.packages.root.path")
  public @Nullable ConfigNodePropertyArray getCqWorkflowConfigWorkflowPackagesRootPath() {
    return cqWorkflowConfigWorkflowPackagesRootPath;
  }

  @JsonProperty("cq.workflow.config.workflow.packages.root.path")
  public void setCqWorkflowConfigWorkflowPackagesRootPath(@Nullable ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowProcessLegacyMode(@Nullable ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
    return this;
  }

  /**
   * Get cqWorkflowConfigWorkflowProcessLegacyMode
   * @return cqWorkflowConfigWorkflowProcessLegacyMode
   */
  @Valid 
  @Schema(name = "cq.workflow.config.workflow.process.legacy.mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
  public @Nullable ConfigNodePropertyBoolean getCqWorkflowConfigWorkflowProcessLegacyMode() {
    return cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  @JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
  public void setCqWorkflowConfigWorkflowProcessLegacyMode(@Nullable ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigAllowLocking(@Nullable ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
    return this;
  }

  /**
   * Get cqWorkflowConfigAllowLocking
   * @return cqWorkflowConfigAllowLocking
   */
  @Valid 
  @Schema(name = "cq.workflow.config.allow.locking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.workflow.config.allow.locking")
  public @Nullable ConfigNodePropertyBoolean getCqWorkflowConfigAllowLocking() {
    return cqWorkflowConfigAllowLocking;
  }

  @JsonProperty("cq.workflow.config.allow.locking")
  public void setCqWorkflowConfigAllowLocking(@Nullable ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties comAdobeGraniteWorkflowCoreWorkflowConfigProperties = (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties) o;
    return Objects.equals(this.cqWorkflowConfigWorkflowPackagesRootPath, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigWorkflowPackagesRootPath) &&
        Objects.equals(this.cqWorkflowConfigWorkflowProcessLegacyMode, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigWorkflowProcessLegacyMode) &&
        Objects.equals(this.cqWorkflowConfigAllowLocking, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigAllowLocking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWorkflowConfigWorkflowPackagesRootPath, cqWorkflowConfigWorkflowProcessLegacyMode, cqWorkflowConfigAllowLocking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {\n");
    sb.append("    cqWorkflowConfigWorkflowPackagesRootPath: ").append(toIndentedString(cqWorkflowConfigWorkflowPackagesRootPath)).append("\n");
    sb.append("    cqWorkflowConfigWorkflowProcessLegacyMode: ").append(toIndentedString(cqWorkflowConfigWorkflowProcessLegacyMode)).append("\n");
    sb.append("    cqWorkflowConfigAllowLocking: ").append(toIndentedString(cqWorkflowConfigAllowLocking)).append("\n");
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

