package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties   {
  @JsonProperty("syncTranslationState.schedulingFormat")
  private ConfigNodePropertyString syncTranslationStateSchedulingFormat = null;

  @JsonProperty("schedulingRepeatTranslation.schedulingFormat")
  private ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat = null;

  @JsonProperty("syncTranslationState.lockTimeoutInMinutes")
  private ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes = null;

  @JsonProperty("export.format")
  private ConfigNodePropertyDropDown exportFormat = null;

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
    return this;
  }

  /**
   * Get syncTranslationStateSchedulingFormat
   * @return syncTranslationStateSchedulingFormat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSyncTranslationStateSchedulingFormat() {
    return syncTranslationStateSchedulingFormat;
  }

  public void setSyncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties schedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
    return this;
  }

  /**
   * Get schedulingRepeatTranslationSchedulingFormat
   * @return schedulingRepeatTranslationSchedulingFormat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSchedulingRepeatTranslationSchedulingFormat() {
    return schedulingRepeatTranslationSchedulingFormat;
  }

  public void setSchedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
    return this;
  }

  /**
   * Get syncTranslationStateLockTimeoutInMinutes
   * @return syncTranslationStateLockTimeoutInMinutes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSyncTranslationStateLockTimeoutInMinutes() {
    return syncTranslationStateLockTimeoutInMinutes;
  }

  public void setSyncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties exportFormat(ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }

  /**
   * Get exportFormat
   * @return exportFormat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getExportFormat() {
    return exportFormat;
  }

  public void setExportFormat(ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties = (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties) o;
    return Objects.equals(this.syncTranslationStateSchedulingFormat, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.syncTranslationStateSchedulingFormat) &&
        Objects.equals(this.schedulingRepeatTranslationSchedulingFormat, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.schedulingRepeatTranslationSchedulingFormat) &&
        Objects.equals(this.syncTranslationStateLockTimeoutInMinutes, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.syncTranslationStateLockTimeoutInMinutes) &&
        Objects.equals(this.exportFormat, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.exportFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncTranslationStateSchedulingFormat, schedulingRepeatTranslationSchedulingFormat, syncTranslationStateLockTimeoutInMinutes, exportFormat);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

