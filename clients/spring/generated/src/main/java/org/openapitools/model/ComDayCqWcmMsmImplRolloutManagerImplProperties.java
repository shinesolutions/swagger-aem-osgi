package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * ComDayCqWcmMsmImplRolloutManagerImplProperties
 */

@JsonTypeName("comDayCqWcmMsmImplRolloutManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplRolloutManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray rolloutmgrExcludedpropsDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger rolloutmgrCommitSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled;

  public ComDayCqWcmMsmImplRolloutManagerImplProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
   */
  @Valid 
  @Schema(name = "event.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.filter")
  public @Nullable ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludedpropsDefault(@Nullable ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
    return this;
  }

  /**
   * Get rolloutmgrExcludedpropsDefault
   * @return rolloutmgrExcludedpropsDefault
   */
  @Valid 
  @Schema(name = "rolloutmgr.excludedprops.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.excludedprops.default")
  public @Nullable ConfigNodePropertyArray getRolloutmgrExcludedpropsDefault() {
    return rolloutmgrExcludedpropsDefault;
  }

  @JsonProperty("rolloutmgr.excludedprops.default")
  public void setRolloutmgrExcludedpropsDefault(@Nullable ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludedparagraphpropsDefault(@Nullable ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
    return this;
  }

  /**
   * Get rolloutmgrExcludedparagraphpropsDefault
   * @return rolloutmgrExcludedparagraphpropsDefault
   */
  @Valid 
  @Schema(name = "rolloutmgr.excludedparagraphprops.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.excludedparagraphprops.default")
  public @Nullable ConfigNodePropertyArray getRolloutmgrExcludedparagraphpropsDefault() {
    return rolloutmgrExcludedparagraphpropsDefault;
  }

  @JsonProperty("rolloutmgr.excludedparagraphprops.default")
  public void setRolloutmgrExcludedparagraphpropsDefault(@Nullable ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludednodetypesDefault(@Nullable ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
    return this;
  }

  /**
   * Get rolloutmgrExcludednodetypesDefault
   * @return rolloutmgrExcludednodetypesDefault
   */
  @Valid 
  @Schema(name = "rolloutmgr.excludednodetypes.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.excludednodetypes.default")
  public @Nullable ConfigNodePropertyArray getRolloutmgrExcludednodetypesDefault() {
    return rolloutmgrExcludednodetypesDefault;
  }

  @JsonProperty("rolloutmgr.excludednodetypes.default")
  public void setRolloutmgrExcludednodetypesDefault(@Nullable ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolMaxsize(@Nullable ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
    return this;
  }

  /**
   * Get rolloutmgrThreadpoolMaxsize
   * @return rolloutmgrThreadpoolMaxsize
   */
  @Valid 
  @Schema(name = "rolloutmgr.threadpool.maxsize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.threadpool.maxsize")
  public @Nullable ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxsize() {
    return rolloutmgrThreadpoolMaxsize;
  }

  @JsonProperty("rolloutmgr.threadpool.maxsize")
  public void setRolloutmgrThreadpoolMaxsize(@Nullable ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolMaxshutdowntime(@Nullable ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
    return this;
  }

  /**
   * Get rolloutmgrThreadpoolMaxshutdowntime
   * @return rolloutmgrThreadpoolMaxshutdowntime
   */
  @Valid 
  @Schema(name = "rolloutmgr.threadpool.maxshutdowntime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
  public @Nullable ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxshutdowntime() {
    return rolloutmgrThreadpoolMaxshutdowntime;
  }

  @JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
  public void setRolloutmgrThreadpoolMaxshutdowntime(@Nullable ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolPriority(@Nullable ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
    return this;
  }

  /**
   * Get rolloutmgrThreadpoolPriority
   * @return rolloutmgrThreadpoolPriority
   */
  @Valid 
  @Schema(name = "rolloutmgr.threadpool.priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.threadpool.priority")
  public @Nullable ConfigNodePropertyDropDown getRolloutmgrThreadpoolPriority() {
    return rolloutmgrThreadpoolPriority;
  }

  @JsonProperty("rolloutmgr.threadpool.priority")
  public void setRolloutmgrThreadpoolPriority(@Nullable ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrCommitSize(@Nullable ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
    return this;
  }

  /**
   * Get rolloutmgrCommitSize
   * @return rolloutmgrCommitSize
   */
  @Valid 
  @Schema(name = "rolloutmgr.commit.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.commit.size")
  public @Nullable ConfigNodePropertyInteger getRolloutmgrCommitSize() {
    return rolloutmgrCommitSize;
  }

  @JsonProperty("rolloutmgr.commit.size")
  public void setRolloutmgrCommitSize(@Nullable ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrConflicthandlingEnabled(@Nullable ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
    return this;
  }

  /**
   * Get rolloutmgrConflicthandlingEnabled
   * @return rolloutmgrConflicthandlingEnabled
   */
  @Valid 
  @Schema(name = "rolloutmgr.conflicthandling.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rolloutmgr.conflicthandling.enabled")
  public @Nullable ConfigNodePropertyBoolean getRolloutmgrConflicthandlingEnabled() {
    return rolloutmgrConflicthandlingEnabled;
  }

  @JsonProperty("rolloutmgr.conflicthandling.enabled")
  public void setRolloutmgrConflicthandlingEnabled(@Nullable ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplRolloutManagerImplProperties comDayCqWcmMsmImplRolloutManagerImplProperties = (ComDayCqWcmMsmImplRolloutManagerImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqWcmMsmImplRolloutManagerImplProperties.eventFilter) &&
        Objects.equals(this.rolloutmgrExcludedpropsDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludedpropsDefault) &&
        Objects.equals(this.rolloutmgrExcludedparagraphpropsDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludedparagraphpropsDefault) &&
        Objects.equals(this.rolloutmgrExcludednodetypesDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludednodetypesDefault) &&
        Objects.equals(this.rolloutmgrThreadpoolMaxsize, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolMaxsize) &&
        Objects.equals(this.rolloutmgrThreadpoolMaxshutdowntime, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolMaxshutdowntime) &&
        Objects.equals(this.rolloutmgrThreadpoolPriority, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolPriority) &&
        Objects.equals(this.rolloutmgrCommitSize, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrCommitSize) &&
        Objects.equals(this.rolloutmgrConflicthandlingEnabled, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrConflicthandlingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, rolloutmgrExcludedpropsDefault, rolloutmgrExcludedparagraphpropsDefault, rolloutmgrExcludednodetypesDefault, rolloutmgrThreadpoolMaxsize, rolloutmgrThreadpoolMaxshutdowntime, rolloutmgrThreadpoolPriority, rolloutmgrCommitSize, rolloutmgrConflicthandlingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplRolloutManagerImplProperties {\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    rolloutmgrExcludedpropsDefault: ").append(toIndentedString(rolloutmgrExcludedpropsDefault)).append("\n");
    sb.append("    rolloutmgrExcludedparagraphpropsDefault: ").append(toIndentedString(rolloutmgrExcludedparagraphpropsDefault)).append("\n");
    sb.append("    rolloutmgrExcludednodetypesDefault: ").append(toIndentedString(rolloutmgrExcludednodetypesDefault)).append("\n");
    sb.append("    rolloutmgrThreadpoolMaxsize: ").append(toIndentedString(rolloutmgrThreadpoolMaxsize)).append("\n");
    sb.append("    rolloutmgrThreadpoolMaxshutdowntime: ").append(toIndentedString(rolloutmgrThreadpoolMaxshutdowntime)).append("\n");
    sb.append("    rolloutmgrThreadpoolPriority: ").append(toIndentedString(rolloutmgrThreadpoolPriority)).append("\n");
    sb.append("    rolloutmgrCommitSize: ").append(toIndentedString(rolloutmgrCommitSize)).append("\n");
    sb.append("    rolloutmgrConflicthandlingEnabled: ").append(toIndentedString(rolloutmgrConflicthandlingEnabled)).append("\n");
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

