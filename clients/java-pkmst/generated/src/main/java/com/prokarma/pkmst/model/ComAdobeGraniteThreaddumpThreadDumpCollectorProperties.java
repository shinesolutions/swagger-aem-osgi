package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties   {
  @JsonProperty("scheduler.period")
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @JsonProperty("scheduler.runOn")
  private ConfigNodePropertyDropDown schedulerRunOn = null;

  @JsonProperty("granite.threaddump.enabled")
  private ConfigNodePropertyBoolean graniteThreaddumpEnabled = null;

  @JsonProperty("granite.threaddump.dumpsPerFile")
  private ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile = null;

  @JsonProperty("granite.threaddump.enableGzipCompression")
  private ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression = null;

  @JsonProperty("granite.threaddump.enableDirectoriesCompression")
  private ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression = null;

  @JsonProperty("granite.threaddump.enableJStack")
  private ConfigNodePropertyBoolean graniteThreaddumpEnableJStack = null;

  @JsonProperty("granite.threaddump.maxBackupDays")
  private ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays = null;

  @JsonProperty("granite.threaddump.backupCleanTrigger")
  private ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger = null;

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

   /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
    return this;
  }

   /**
   * Get schedulerRunOn
   * @return schedulerRunOn
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getSchedulerRunOn() {
    return schedulerRunOn;
  }

  public void setSchedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
    return this;
  }

   /**
   * Get graniteThreaddumpEnabled
   * @return graniteThreaddumpEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnabled() {
    return graniteThreaddumpEnabled;
  }

  public void setGraniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
    return this;
  }

   /**
   * Get graniteThreaddumpDumpsPerFile
   * @return graniteThreaddumpDumpsPerFile
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getGraniteThreaddumpDumpsPerFile() {
    return graniteThreaddumpDumpsPerFile;
  }

  public void setGraniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
    return this;
  }

   /**
   * Get graniteThreaddumpEnableGzipCompression
   * @return graniteThreaddumpEnableGzipCompression
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableGzipCompression() {
    return graniteThreaddumpEnableGzipCompression;
  }

  public void setGraniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
    return this;
  }

   /**
   * Get graniteThreaddumpEnableDirectoriesCompression
   * @return graniteThreaddumpEnableDirectoriesCompression
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableDirectoriesCompression() {
    return graniteThreaddumpEnableDirectoriesCompression;
  }

  public void setGraniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
    return this;
  }

   /**
   * Get graniteThreaddumpEnableJStack
   * @return graniteThreaddumpEnableJStack
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableJStack() {
    return graniteThreaddumpEnableJStack;
  }

  public void setGraniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
    return this;
  }

   /**
   * Get graniteThreaddumpMaxBackupDays
   * @return graniteThreaddumpMaxBackupDays
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getGraniteThreaddumpMaxBackupDays() {
    return graniteThreaddumpMaxBackupDays;
  }

  public void setGraniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
    return this;
  }

   /**
   * Get graniteThreaddumpBackupCleanTrigger
   * @return graniteThreaddumpBackupCleanTrigger
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

