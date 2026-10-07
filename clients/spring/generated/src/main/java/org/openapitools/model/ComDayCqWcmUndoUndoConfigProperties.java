package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComDayCqWcmUndoUndoConfigProperties
 */

@JsonTypeName("comDayCqWcmUndoUndoConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmUndoUndoConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqWcmUndoEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqWcmUndoPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqWcmUndoValidity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqWcmUndoSteps;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqWcmUndoPersistence;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqWcmUndoPersistenceMode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqWcmUndoMarkermode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqWcmUndoWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqWcmUndoBlacklist;

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoEnabled(@Nullable ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
    return this;
  }

  /**
   * Get cqWcmUndoEnabled
   * @return cqWcmUndoEnabled
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.enabled")
  public @Nullable ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
    return cqWcmUndoEnabled;
  }

  @JsonProperty("cq.wcm.undo.enabled")
  public void setCqWcmUndoEnabled(@Nullable ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPath(@Nullable ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
    return this;
  }

  /**
   * Get cqWcmUndoPath
   * @return cqWcmUndoPath
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.path")
  public @Nullable ConfigNodePropertyString getCqWcmUndoPath() {
    return cqWcmUndoPath;
  }

  @JsonProperty("cq.wcm.undo.path")
  public void setCqWcmUndoPath(@Nullable ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoValidity(@Nullable ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
    return this;
  }

  /**
   * Get cqWcmUndoValidity
   * @return cqWcmUndoValidity
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.validity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.validity")
  public @Nullable ConfigNodePropertyInteger getCqWcmUndoValidity() {
    return cqWcmUndoValidity;
  }

  @JsonProperty("cq.wcm.undo.validity")
  public void setCqWcmUndoValidity(@Nullable ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoSteps(@Nullable ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
    return this;
  }

  /**
   * Get cqWcmUndoSteps
   * @return cqWcmUndoSteps
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.steps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.steps")
  public @Nullable ConfigNodePropertyInteger getCqWcmUndoSteps() {
    return cqWcmUndoSteps;
  }

  @JsonProperty("cq.wcm.undo.steps")
  public void setCqWcmUndoSteps(@Nullable ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistence(@Nullable ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
    return this;
  }

  /**
   * Get cqWcmUndoPersistence
   * @return cqWcmUndoPersistence
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.persistence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.persistence")
  public @Nullable ConfigNodePropertyString getCqWcmUndoPersistence() {
    return cqWcmUndoPersistence;
  }

  @JsonProperty("cq.wcm.undo.persistence")
  public void setCqWcmUndoPersistence(@Nullable ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistenceMode(@Nullable ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
    return this;
  }

  /**
   * Get cqWcmUndoPersistenceMode
   * @return cqWcmUndoPersistenceMode
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.persistence.mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.persistence.mode")
  public @Nullable ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
    return cqWcmUndoPersistenceMode;
  }

  @JsonProperty("cq.wcm.undo.persistence.mode")
  public void setCqWcmUndoPersistenceMode(@Nullable ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoMarkermode(@Nullable ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
    return this;
  }

  /**
   * Get cqWcmUndoMarkermode
   * @return cqWcmUndoMarkermode
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.markermode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.markermode")
  public @Nullable ConfigNodePropertyString getCqWcmUndoMarkermode() {
    return cqWcmUndoMarkermode;
  }

  @JsonProperty("cq.wcm.undo.markermode")
  public void setCqWcmUndoMarkermode(@Nullable ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoWhitelist(@Nullable ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
    return this;
  }

  /**
   * Get cqWcmUndoWhitelist
   * @return cqWcmUndoWhitelist
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.whitelist")
  public @Nullable ConfigNodePropertyArray getCqWcmUndoWhitelist() {
    return cqWcmUndoWhitelist;
  }

  @JsonProperty("cq.wcm.undo.whitelist")
  public void setCqWcmUndoWhitelist(@Nullable ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoBlacklist(@Nullable ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
    return this;
  }

  /**
   * Get cqWcmUndoBlacklist
   * @return cqWcmUndoBlacklist
   */
  @Valid 
  @Schema(name = "cq.wcm.undo.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.undo.blacklist")
  public @Nullable ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }

  @JsonProperty("cq.wcm.undo.blacklist")
  public void setCqWcmUndoBlacklist(@Nullable ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmUndoUndoConfigProperties comDayCqWcmUndoUndoConfigProperties = (ComDayCqWcmUndoUndoConfigProperties) o;
    return Objects.equals(this.cqWcmUndoEnabled, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoEnabled) &&
        Objects.equals(this.cqWcmUndoPath, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPath) &&
        Objects.equals(this.cqWcmUndoValidity, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoValidity) &&
        Objects.equals(this.cqWcmUndoSteps, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoSteps) &&
        Objects.equals(this.cqWcmUndoPersistence, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistence) &&
        Objects.equals(this.cqWcmUndoPersistenceMode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistenceMode) &&
        Objects.equals(this.cqWcmUndoMarkermode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoMarkermode) &&
        Objects.equals(this.cqWcmUndoWhitelist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoWhitelist) &&
        Objects.equals(this.cqWcmUndoBlacklist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmUndoEnabled, cqWcmUndoPath, cqWcmUndoValidity, cqWcmUndoSteps, cqWcmUndoPersistence, cqWcmUndoPersistenceMode, cqWcmUndoMarkermode, cqWcmUndoWhitelist, cqWcmUndoBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmUndoUndoConfigProperties {\n");
    sb.append("    cqWcmUndoEnabled: ").append(toIndentedString(cqWcmUndoEnabled)).append("\n");
    sb.append("    cqWcmUndoPath: ").append(toIndentedString(cqWcmUndoPath)).append("\n");
    sb.append("    cqWcmUndoValidity: ").append(toIndentedString(cqWcmUndoValidity)).append("\n");
    sb.append("    cqWcmUndoSteps: ").append(toIndentedString(cqWcmUndoSteps)).append("\n");
    sb.append("    cqWcmUndoPersistence: ").append(toIndentedString(cqWcmUndoPersistence)).append("\n");
    sb.append("    cqWcmUndoPersistenceMode: ").append(toIndentedString(cqWcmUndoPersistenceMode)).append("\n");
    sb.append("    cqWcmUndoMarkermode: ").append(toIndentedString(cqWcmUndoMarkermode)).append("\n");
    sb.append("    cqWcmUndoWhitelist: ").append(toIndentedString(cqWcmUndoWhitelist)).append("\n");
    sb.append("    cqWcmUndoBlacklist: ").append(toIndentedString(cqWcmUndoBlacklist)).append("\n");
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

