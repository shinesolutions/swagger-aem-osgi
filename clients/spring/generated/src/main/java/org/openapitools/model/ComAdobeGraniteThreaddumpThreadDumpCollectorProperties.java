package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
 */

@JsonTypeName("comAdobeGraniteThreaddumpThreadDumpCollectorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger schedulerPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown schedulerRunOn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteThreaddumpEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableJStack;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger;

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  /**
   * Get schedulerPeriod
   * @return schedulerPeriod
   */
  @Valid 
  @Schema(name = "scheduler.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.period")
  public @Nullable ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  @JsonProperty("scheduler.period")
  public void setSchedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerRunOn(@Nullable ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
    return this;
  }

  /**
   * Get schedulerRunOn
   * @return schedulerRunOn
   */
  @Valid 
  @Schema(name = "scheduler.runOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.runOn")
  public @Nullable ConfigNodePropertyDropDown getSchedulerRunOn() {
    return schedulerRunOn;
  }

  @JsonProperty("scheduler.runOn")
  public void setSchedulerRunOn(@Nullable ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnabled(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
    return this;
  }

  /**
   * Get graniteThreaddumpEnabled
   * @return graniteThreaddumpEnabled
   */
  @Valid 
  @Schema(name = "granite.threaddump.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.enabled")
  public @Nullable ConfigNodePropertyBoolean getGraniteThreaddumpEnabled() {
    return graniteThreaddumpEnabled;
  }

  @JsonProperty("granite.threaddump.enabled")
  public void setGraniteThreaddumpEnabled(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpDumpsPerFile(@Nullable ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
    return this;
  }

  /**
   * Get graniteThreaddumpDumpsPerFile
   * @return graniteThreaddumpDumpsPerFile
   */
  @Valid 
  @Schema(name = "granite.threaddump.dumpsPerFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.dumpsPerFile")
  public @Nullable ConfigNodePropertyInteger getGraniteThreaddumpDumpsPerFile() {
    return graniteThreaddumpDumpsPerFile;
  }

  @JsonProperty("granite.threaddump.dumpsPerFile")
  public void setGraniteThreaddumpDumpsPerFile(@Nullable ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableGzipCompression(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
    return this;
  }

  /**
   * Get graniteThreaddumpEnableGzipCompression
   * @return graniteThreaddumpEnableGzipCompression
   */
  @Valid 
  @Schema(name = "granite.threaddump.enableGzipCompression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.enableGzipCompression")
  public @Nullable ConfigNodePropertyBoolean getGraniteThreaddumpEnableGzipCompression() {
    return graniteThreaddumpEnableGzipCompression;
  }

  @JsonProperty("granite.threaddump.enableGzipCompression")
  public void setGraniteThreaddumpEnableGzipCompression(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableDirectoriesCompression(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
    return this;
  }

  /**
   * Get graniteThreaddumpEnableDirectoriesCompression
   * @return graniteThreaddumpEnableDirectoriesCompression
   */
  @Valid 
  @Schema(name = "granite.threaddump.enableDirectoriesCompression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.enableDirectoriesCompression")
  public @Nullable ConfigNodePropertyBoolean getGraniteThreaddumpEnableDirectoriesCompression() {
    return graniteThreaddumpEnableDirectoriesCompression;
  }

  @JsonProperty("granite.threaddump.enableDirectoriesCompression")
  public void setGraniteThreaddumpEnableDirectoriesCompression(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableJStack(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
    return this;
  }

  /**
   * Get graniteThreaddumpEnableJStack
   * @return graniteThreaddumpEnableJStack
   */
  @Valid 
  @Schema(name = "granite.threaddump.enableJStack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.enableJStack")
  public @Nullable ConfigNodePropertyBoolean getGraniteThreaddumpEnableJStack() {
    return graniteThreaddumpEnableJStack;
  }

  @JsonProperty("granite.threaddump.enableJStack")
  public void setGraniteThreaddumpEnableJStack(@Nullable ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpMaxBackupDays(@Nullable ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
    return this;
  }

  /**
   * Get graniteThreaddumpMaxBackupDays
   * @return graniteThreaddumpMaxBackupDays
   */
  @Valid 
  @Schema(name = "granite.threaddump.maxBackupDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.maxBackupDays")
  public @Nullable ConfigNodePropertyInteger getGraniteThreaddumpMaxBackupDays() {
    return graniteThreaddumpMaxBackupDays;
  }

  @JsonProperty("granite.threaddump.maxBackupDays")
  public void setGraniteThreaddumpMaxBackupDays(@Nullable ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpBackupCleanTrigger(@Nullable ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
    return this;
  }

  /**
   * Get graniteThreaddumpBackupCleanTrigger
   * @return graniteThreaddumpBackupCleanTrigger
   */
  @Valid 
  @Schema(name = "granite.threaddump.backupCleanTrigger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.threaddump.backupCleanTrigger")
  public @Nullable ConfigNodePropertyString getGraniteThreaddumpBackupCleanTrigger() {
    return graniteThreaddumpBackupCleanTrigger;
  }

  @JsonProperty("granite.threaddump.backupCleanTrigger")
  public void setGraniteThreaddumpBackupCleanTrigger(@Nullable ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties comAdobeGraniteThreaddumpThreadDumpCollectorProperties = (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) o;
    return Objects.equals(this.schedulerPeriod, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.schedulerPeriod) &&
        Objects.equals(this.schedulerRunOn, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.schedulerRunOn) &&
        Objects.equals(this.graniteThreaddumpEnabled, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnabled) &&
        Objects.equals(this.graniteThreaddumpDumpsPerFile, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpDumpsPerFile) &&
        Objects.equals(this.graniteThreaddumpEnableGzipCompression, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnableGzipCompression) &&
        Objects.equals(this.graniteThreaddumpEnableDirectoriesCompression, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnableDirectoriesCompression) &&
        Objects.equals(this.graniteThreaddumpEnableJStack, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnableJStack) &&
        Objects.equals(this.graniteThreaddumpMaxBackupDays, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpMaxBackupDays) &&
        Objects.equals(this.graniteThreaddumpBackupCleanTrigger, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpBackupCleanTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerPeriod, schedulerRunOn, graniteThreaddumpEnabled, graniteThreaddumpDumpsPerFile, graniteThreaddumpEnableGzipCompression, graniteThreaddumpEnableDirectoriesCompression, graniteThreaddumpEnableJStack, graniteThreaddumpMaxBackupDays, graniteThreaddumpBackupCleanTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {\n");
    sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
    sb.append("    schedulerRunOn: ").append(toIndentedString(schedulerRunOn)).append("\n");
    sb.append("    graniteThreaddumpEnabled: ").append(toIndentedString(graniteThreaddumpEnabled)).append("\n");
    sb.append("    graniteThreaddumpDumpsPerFile: ").append(toIndentedString(graniteThreaddumpDumpsPerFile)).append("\n");
    sb.append("    graniteThreaddumpEnableGzipCompression: ").append(toIndentedString(graniteThreaddumpEnableGzipCompression)).append("\n");
    sb.append("    graniteThreaddumpEnableDirectoriesCompression: ").append(toIndentedString(graniteThreaddumpEnableDirectoriesCompression)).append("\n");
    sb.append("    graniteThreaddumpEnableJStack: ").append(toIndentedString(graniteThreaddumpEnableJStack)).append("\n");
    sb.append("    graniteThreaddumpMaxBackupDays: ").append(toIndentedString(graniteThreaddumpMaxBackupDays)).append("\n");
    sb.append("    graniteThreaddumpBackupCleanTrigger: ").append(toIndentedString(graniteThreaddumpBackupCleanTrigger)).append("\n");
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

