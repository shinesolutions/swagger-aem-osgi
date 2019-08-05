package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString syncTranslationStateSchedulingFormat = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown exportFormat = null;
 /**
   * Get syncTranslationStateSchedulingFormat
   * @return syncTranslationStateSchedulingFormat
  **/
  @JsonProperty("syncTranslationState.schedulingFormat")
  public ConfigNodePropertyString getSyncTranslationStateSchedulingFormat() {
    return syncTranslationStateSchedulingFormat;
  }

  public void setSyncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
    return this;
  }

 /**
   * Get schedulingRepeatTranslationSchedulingFormat
   * @return schedulingRepeatTranslationSchedulingFormat
  **/
  @JsonProperty("schedulingRepeatTranslation.schedulingFormat")
  public ConfigNodePropertyString getSchedulingRepeatTranslationSchedulingFormat() {
    return schedulingRepeatTranslationSchedulingFormat;
  }

  public void setSchedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties schedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
    return this;
  }

 /**
   * Get syncTranslationStateLockTimeoutInMinutes
   * @return syncTranslationStateLockTimeoutInMinutes
  **/
  @JsonProperty("syncTranslationState.lockTimeoutInMinutes")
  public ConfigNodePropertyString getSyncTranslationStateLockTimeoutInMinutes() {
    return syncTranslationStateLockTimeoutInMinutes;
  }

  public void setSyncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
    return this;
  }

 /**
   * Get exportFormat
   * @return exportFormat
  **/
  @JsonProperty("export.format")
  public ConfigNodePropertyDropDown getExportFormat() {
    return exportFormat;
  }

  public void setExportFormat(ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties exportFormat(ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {\n");
    
    sb.append("    syncTranslationStateSchedulingFormat: ").append(toIndentedString(syncTranslationStateSchedulingFormat)).append("\n");
    sb.append("    schedulingRepeatTranslationSchedulingFormat: ").append(toIndentedString(schedulingRepeatTranslationSchedulingFormat)).append("\n");
    sb.append("    syncTranslationStateLockTimeoutInMinutes: ").append(toIndentedString(syncTranslationStateLockTimeoutInMinutes)).append("\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
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

