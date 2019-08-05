package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown schedulerRunOn = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteThreaddumpEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteThreaddumpEnableJStack = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger = null;
 /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

 /**
   * Get schedulerRunOn
   * @return schedulerRunOn
  **/
  @JsonProperty("scheduler.runOn")
  public ConfigNodePropertyDropDown getSchedulerRunOn() {
    return schedulerRunOn;
  }

  public void setSchedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties schedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
    return this;
  }

 /**
   * Get graniteThreaddumpEnabled
   * @return graniteThreaddumpEnabled
  **/
  @JsonProperty("granite.threaddump.enabled")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnabled() {
    return graniteThreaddumpEnabled;
  }

  public void setGraniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
    return this;
  }

 /**
   * Get graniteThreaddumpDumpsPerFile
   * @return graniteThreaddumpDumpsPerFile
  **/
  @JsonProperty("granite.threaddump.dumpsPerFile")
  public ConfigNodePropertyInteger getGraniteThreaddumpDumpsPerFile() {
    return graniteThreaddumpDumpsPerFile;
  }

  public void setGraniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
    return this;
  }

 /**
   * Get graniteThreaddumpEnableGzipCompression
   * @return graniteThreaddumpEnableGzipCompression
  **/
  @JsonProperty("granite.threaddump.enableGzipCompression")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableGzipCompression() {
    return graniteThreaddumpEnableGzipCompression;
  }

  public void setGraniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
    return this;
  }

 /**
   * Get graniteThreaddumpEnableDirectoriesCompression
   * @return graniteThreaddumpEnableDirectoriesCompression
  **/
  @JsonProperty("granite.threaddump.enableDirectoriesCompression")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableDirectoriesCompression() {
    return graniteThreaddumpEnableDirectoriesCompression;
  }

  public void setGraniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
    return this;
  }

 /**
   * Get graniteThreaddumpEnableJStack
   * @return graniteThreaddumpEnableJStack
  **/
  @JsonProperty("granite.threaddump.enableJStack")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableJStack() {
    return graniteThreaddumpEnableJStack;
  }

  public void setGraniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
    return this;
  }

 /**
   * Get graniteThreaddumpMaxBackupDays
   * @return graniteThreaddumpMaxBackupDays
  **/
  @JsonProperty("granite.threaddump.maxBackupDays")
  public ConfigNodePropertyInteger getGraniteThreaddumpMaxBackupDays() {
    return graniteThreaddumpMaxBackupDays;
  }

  public void setGraniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
    return this;
  }

 /**
   * Get graniteThreaddumpBackupCleanTrigger
   * @return graniteThreaddumpBackupCleanTrigger
  **/
  @JsonProperty("granite.threaddump.backupCleanTrigger")
  public ConfigNodePropertyString getGraniteThreaddumpBackupCleanTrigger() {
    return graniteThreaddumpBackupCleanTrigger;
  }

  public void setGraniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties graniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

