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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmUndoUndoConfigProperties {

  private ConfigNodePropertyBoolean cqWcmUndoEnabled;

  private ConfigNodePropertyString cqWcmUndoPath;

  private ConfigNodePropertyInteger cqWcmUndoValidity;

  private ConfigNodePropertyInteger cqWcmUndoSteps;

  private ConfigNodePropertyString cqWcmUndoPersistence;

  private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode;

  private ConfigNodePropertyString cqWcmUndoMarkermode;

  private ConfigNodePropertyArray cqWcmUndoWhitelist;

  private ConfigNodePropertyArray cqWcmUndoBlacklist;

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
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
  public ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
    return cqWcmUndoEnabled;
  }

  public void setCqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
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
  public ConfigNodePropertyString getCqWcmUndoPath() {
    return cqWcmUndoPath;
  }

  public void setCqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
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
  public ConfigNodePropertyInteger getCqWcmUndoValidity() {
    return cqWcmUndoValidity;
  }

  public void setCqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
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
  public ConfigNodePropertyInteger getCqWcmUndoSteps() {
    return cqWcmUndoSteps;
  }

  public void setCqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
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
  public ConfigNodePropertyString getCqWcmUndoPersistence() {
    return cqWcmUndoPersistence;
  }

  public void setCqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
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
  public ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
    return cqWcmUndoPersistenceMode;
  }

  public void setCqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
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
  public ConfigNodePropertyString getCqWcmUndoMarkermode() {
    return cqWcmUndoMarkermode;
  }

  public void setCqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
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
  public ConfigNodePropertyArray getCqWcmUndoWhitelist() {
    return cqWcmUndoWhitelist;
  }

  public void setCqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
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
  public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }

  public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

