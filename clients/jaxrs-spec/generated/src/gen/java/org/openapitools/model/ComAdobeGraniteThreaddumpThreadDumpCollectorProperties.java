package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties   {
  
  private @Valid ConfigNodePropertyInteger schedulerPeriod = null;
  private @Valid ConfigNodePropertyDropDown schedulerRunOn = null;
  private @Valid ConfigNodePropertyBoolean graniteThreaddumpEnabled = null;
  private @Valid ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile = null;
  private @Valid ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression = null;
  private @Valid ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression = null;
  private @Valid ConfigNodePropertyBoolean graniteThreaddumpEnableJStack = null;
  private @Valid ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays = null;
  private @Valid ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger = null;

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.runOn")
  public ConfigNodePropertyDropDown getSchedulerRunOn() {
    return schedulerRunOn;
  }
  public void setSchedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.enabled")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnabled() {
    return graniteThreaddumpEnabled;
  }
  public void setGraniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.dumpsPerFile")
  public ConfigNodePropertyInteger getGraniteThreaddumpDumpsPerFile() {
    return graniteThreaddumpDumpsPerFile;
  }
  public void setGraniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.enableGzipCompression")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableGzipCompression() {
    return graniteThreaddumpEnableGzipCompression;
  }
  public void setGraniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.enableDirectoriesCompression")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableDirectoriesCompression() {
    return graniteThreaddumpEnableDirectoriesCompression;
  }
  public void setGraniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.enableJStack")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableJStack() {
    return graniteThreaddumpEnableJStack;
  }
  public void setGraniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.maxBackupDays")
  public ConfigNodePropertyInteger getGraniteThreaddumpMaxBackupDays() {
    return graniteThreaddumpMaxBackupDays;
  }
  public void setGraniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
  }

  /**
   **/
  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.threaddump.backupCleanTrigger")
  public ConfigNodePropertyString getGraniteThreaddumpBackupCleanTrigger() {
    return graniteThreaddumpBackupCleanTrigger;
  }
  public void setGraniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties comAdobeGraniteThreaddumpThreadDumpCollectorProperties = (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) o;
    return Objects.equals(schedulerPeriod, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.schedulerPeriod) &&
        Objects.equals(schedulerRunOn, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.schedulerRunOn) &&
        Objects.equals(graniteThreaddumpEnabled, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnabled) &&
        Objects.equals(graniteThreaddumpDumpsPerFile, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpDumpsPerFile) &&
        Objects.equals(graniteThreaddumpEnableGzipCompression, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnableGzipCompression) &&
        Objects.equals(graniteThreaddumpEnableDirectoriesCompression, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnableDirectoriesCompression) &&
        Objects.equals(graniteThreaddumpEnableJStack, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpEnableJStack) &&
        Objects.equals(graniteThreaddumpMaxBackupDays, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpMaxBackupDays) &&
        Objects.equals(graniteThreaddumpBackupCleanTrigger, comAdobeGraniteThreaddumpThreadDumpCollectorProperties.graniteThreaddumpBackupCleanTrigger);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

