package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingCommonsLogLogManagerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsLogLogManagerProperties   {
  @JsonProperty("org.apache.sling.commons.log.level")
  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel = null;

  @JsonProperty("org.apache.sling.commons.log.file")
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;

  @JsonProperty("org.apache.sling.commons.log.file.number")
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null;

  @JsonProperty("org.apache.sling.commons.log.file.size")
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null;

  @JsonProperty("org.apache.sling.commons.log.pattern")
  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern = null;

  @JsonProperty("org.apache.sling.commons.log.configurationFile")
  private ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile = null;

  @JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled = null;

  @JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth = null;

  @JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump = null;

  @JsonProperty("org.apache.sling.commons.log.numOfLines")
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines = null;

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogLevel
   * @return orgApacheSlingCommonsLogLevel
  **/
  @Valid
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }

  public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFile
   * @return orgApacheSlingCommonsLogFile
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFileNumber
   * @return orgApacheSlingCommonsLogFileNumber
  **/
  @Valid
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }

  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFileSize
   * @return orgApacheSlingCommonsLogFileSize
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }

  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogPattern
   * @return orgApacheSlingCommonsLogPattern
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }

  public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogConfigurationFile
   * @return orgApacheSlingCommonsLogConfigurationFile
  **/
  @Valid
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogConfigurationFile() {
    return orgApacheSlingCommonsLogConfigurationFile;
  }

  public void setOrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogPackagingDataEnabled
   * @return orgApacheSlingCommonsLogPackagingDataEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogPackagingDataEnabled() {
    return orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  public void setOrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogMaxCallerDataDepth
   * @return orgApacheSlingCommonsLogMaxCallerDataDepth
  **/
  @Valid
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxCallerDataDepth() {
    return orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  public void setOrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogMaxOldFileCountInDump
   * @return orgApacheSlingCommonsLogMaxOldFileCountInDump
  **/
  @Valid
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxOldFileCountInDump() {
    return orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  public void setOrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogNumOfLines
   * @return orgApacheSlingCommonsLogNumOfLines
  **/
  @Valid
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogNumOfLines() {
    return orgApacheSlingCommonsLogNumOfLines;
  }

  public void setOrgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLogManagerProperties = (OrgApacheSlingCommonsLogLogManagerProperties) o;
    return Objects.equals(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFileNumber) &&
        Objects.equals(orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFileSize) &&
        Objects.equals(orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(orgApacheSlingCommonsLogConfigurationFile, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogConfigurationFile) &&
        Objects.equals(orgApacheSlingCommonsLogPackagingDataEnabled, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogPackagingDataEnabled) &&
        Objects.equals(orgApacheSlingCommonsLogMaxCallerDataDepth, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogMaxCallerDataDepth) &&
        Objects.equals(orgApacheSlingCommonsLogMaxOldFileCountInDump, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogMaxOldFileCountInDump) &&
        Objects.equals(orgApacheSlingCommonsLogNumOfLines, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogNumOfLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogConfigurationFile, orgApacheSlingCommonsLogPackagingDataEnabled, orgApacheSlingCommonsLogMaxCallerDataDepth, orgApacheSlingCommonsLogMaxOldFileCountInDump, orgApacheSlingCommonsLogNumOfLines);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsLogLogManagerProperties {\n");
    
    sb.append("    orgApacheSlingCommonsLogLevel: ").append(toIndentedString(orgApacheSlingCommonsLogLevel)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileNumber: ").append(toIndentedString(orgApacheSlingCommonsLogFileNumber)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileSize: ").append(toIndentedString(orgApacheSlingCommonsLogFileSize)).append("\n");
    sb.append("    orgApacheSlingCommonsLogPattern: ").append(toIndentedString(orgApacheSlingCommonsLogPattern)).append("\n");
    sb.append("    orgApacheSlingCommonsLogConfigurationFile: ").append(toIndentedString(orgApacheSlingCommonsLogConfigurationFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogPackagingDataEnabled: ").append(toIndentedString(orgApacheSlingCommonsLogPackagingDataEnabled)).append("\n");
    sb.append("    orgApacheSlingCommonsLogMaxCallerDataDepth: ").append(toIndentedString(orgApacheSlingCommonsLogMaxCallerDataDepth)).append("\n");
    sb.append("    orgApacheSlingCommonsLogMaxOldFileCountInDump: ").append(toIndentedString(orgApacheSlingCommonsLogMaxOldFileCountInDump)).append("\n");
    sb.append("    orgApacheSlingCommonsLogNumOfLines: ").append(toIndentedString(orgApacheSlingCommonsLogNumOfLines)).append("\n");
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

