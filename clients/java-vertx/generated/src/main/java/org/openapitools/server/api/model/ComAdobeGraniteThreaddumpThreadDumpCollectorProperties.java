package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties   {
  
  private ConfigNodePropertyInteger schedulerPeriod = null;
  private ConfigNodePropertyDropDown schedulerRunOn = null;
  private ConfigNodePropertyBoolean graniteThreaddumpEnabled = null;
  private ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile = null;
  private ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression = null;
  private ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression = null;
  private ConfigNodePropertyBoolean graniteThreaddumpEnableJStack = null;
  private ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays = null;
  private ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger = null;

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties () {

  }

  public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties (ConfigNodePropertyInteger schedulerPeriod, ConfigNodePropertyDropDown schedulerRunOn, ConfigNodePropertyBoolean graniteThreaddumpEnabled, ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile, ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression, ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression, ConfigNodePropertyBoolean graniteThreaddumpEnableJStack, ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays, ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
    this.schedulerPeriod = schedulerPeriod;
    this.schedulerRunOn = schedulerRunOn;
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
    this.graniteThreaddumpBackupCleanTrigger = graniteThreaddumpBackupCleanTrigger;
  }

    
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

    
  @JsonProperty("scheduler.runOn")
  public ConfigNodePropertyDropDown getSchedulerRunOn() {
    return schedulerRunOn;
  }
  public void setSchedulerRunOn(ConfigNodePropertyDropDown schedulerRunOn) {
    this.schedulerRunOn = schedulerRunOn;
  }

    
  @JsonProperty("granite.threaddump.enabled")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnabled() {
    return graniteThreaddumpEnabled;
  }
  public void setGraniteThreaddumpEnabled(ConfigNodePropertyBoolean graniteThreaddumpEnabled) {
    this.graniteThreaddumpEnabled = graniteThreaddumpEnabled;
  }

    
  @JsonProperty("granite.threaddump.dumpsPerFile")
  public ConfigNodePropertyInteger getGraniteThreaddumpDumpsPerFile() {
    return graniteThreaddumpDumpsPerFile;
  }
  public void setGraniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger graniteThreaddumpDumpsPerFile) {
    this.graniteThreaddumpDumpsPerFile = graniteThreaddumpDumpsPerFile;
  }

    
  @JsonProperty("granite.threaddump.enableGzipCompression")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableGzipCompression() {
    return graniteThreaddumpEnableGzipCompression;
  }
  public void setGraniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableGzipCompression) {
    this.graniteThreaddumpEnableGzipCompression = graniteThreaddumpEnableGzipCompression;
  }

    
  @JsonProperty("granite.threaddump.enableDirectoriesCompression")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableDirectoriesCompression() {
    return graniteThreaddumpEnableDirectoriesCompression;
  }
  public void setGraniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean graniteThreaddumpEnableDirectoriesCompression) {
    this.graniteThreaddumpEnableDirectoriesCompression = graniteThreaddumpEnableDirectoriesCompression;
  }

    
  @JsonProperty("granite.threaddump.enableJStack")
  public ConfigNodePropertyBoolean getGraniteThreaddumpEnableJStack() {
    return graniteThreaddumpEnableJStack;
  }
  public void setGraniteThreaddumpEnableJStack(ConfigNodePropertyBoolean graniteThreaddumpEnableJStack) {
    this.graniteThreaddumpEnableJStack = graniteThreaddumpEnableJStack;
  }

    
  @JsonProperty("granite.threaddump.maxBackupDays")
  public ConfigNodePropertyInteger getGraniteThreaddumpMaxBackupDays() {
    return graniteThreaddumpMaxBackupDays;
  }
  public void setGraniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger graniteThreaddumpMaxBackupDays) {
    this.graniteThreaddumpMaxBackupDays = graniteThreaddumpMaxBackupDays;
  }

    
  @JsonProperty("granite.threaddump.backupCleanTrigger")
  public ConfigNodePropertyString getGraniteThreaddumpBackupCleanTrigger() {
    return graniteThreaddumpBackupCleanTrigger;
  }
  public void setGraniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString graniteThreaddumpBackupCleanTrigger) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
