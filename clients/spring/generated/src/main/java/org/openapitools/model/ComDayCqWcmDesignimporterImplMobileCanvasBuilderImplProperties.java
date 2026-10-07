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
 * ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
 */

@JsonTypeName("comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString filepattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray deviceGroups;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean buildPageNodes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean buildClientLibs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean buildCanvasComponent;

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties filepattern(@Nullable ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
    return this;
  }

  /**
   * Get filepattern
   * @return filepattern
   */
  @Valid 
  @Schema(name = "filepattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filepattern")
  public @Nullable ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }

  @JsonProperty("filepattern")
  public void setFilepattern(@Nullable ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties deviceGroups(@Nullable ConfigNodePropertyArray deviceGroups) {
    this.deviceGroups = deviceGroups;
    return this;
  }

  /**
   * Get deviceGroups
   * @return deviceGroups
   */
  @Valid 
  @Schema(name = "device.groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device.groups")
  public @Nullable ConfigNodePropertyArray getDeviceGroups() {
    return deviceGroups;
  }

  @JsonProperty("device.groups")
  public void setDeviceGroups(@Nullable ConfigNodePropertyArray deviceGroups) {
    this.deviceGroups = deviceGroups;
  }

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties buildPageNodes(@Nullable ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
    return this;
  }

  /**
   * Get buildPageNodes
   * @return buildPageNodes
   */
  @Valid 
  @Schema(name = "build.page.nodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build.page.nodes")
  public @Nullable ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }

  @JsonProperty("build.page.nodes")
  public void setBuildPageNodes(@Nullable ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties buildClientLibs(@Nullable ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
    return this;
  }

  /**
   * Get buildClientLibs
   * @return buildClientLibs
   */
  @Valid 
  @Schema(name = "build.client.libs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build.client.libs")
  public @Nullable ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }

  @JsonProperty("build.client.libs")
  public void setBuildClientLibs(@Nullable ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties buildCanvasComponent(@Nullable ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
    return this;
  }

  /**
   * Get buildCanvasComponent
   * @return buildCanvasComponent
   */
  @Valid 
  @Schema(name = "build.canvas.component", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build.canvas.component")
  public @Nullable ConfigNodePropertyBoolean getBuildCanvasComponent() {
    return buildCanvasComponent;
  }

  @JsonProperty("build.canvas.component")
  public void setBuildCanvasComponent(@Nullable ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties = (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties) o;
    return Objects.equals(this.filepattern, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.filepattern) &&
        Objects.equals(this.deviceGroups, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.deviceGroups) &&
        Objects.equals(this.buildPageNodes, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildPageNodes) &&
        Objects.equals(this.buildClientLibs, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildClientLibs) &&
        Objects.equals(this.buildCanvasComponent, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildCanvasComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filepattern, deviceGroups, buildPageNodes, buildClientLibs, buildCanvasComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {\n");
    sb.append("    filepattern: ").append(toIndentedString(filepattern)).append("\n");
    sb.append("    deviceGroups: ").append(toIndentedString(deviceGroups)).append("\n");
    sb.append("    buildPageNodes: ").append(toIndentedString(buildPageNodes)).append("\n");
    sb.append("    buildClientLibs: ").append(toIndentedString(buildClientLibs)).append("\n");
    sb.append("    buildCanvasComponent: ").append(toIndentedString(buildCanvasComponent)).append("\n");
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

