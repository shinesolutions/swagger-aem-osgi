package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties   {
  @JsonProperty("syncTranslationState.schedulingFormat")
  private ConfigNodePropertyString syncTranslationStateSchedulingFormat;

  @JsonProperty("schedulingRepeatTranslation.schedulingFormat")
  private ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat;

  @JsonProperty("syncTranslationState.lockTimeoutInMinutes")
  private ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes;

  @JsonProperty("export.format")
  private ConfigNodePropertyDropDown exportFormat;

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
    return this;
  }

  /**
   * Get syncTranslationStateSchedulingFormat
   * @return syncTranslationStateSchedulingFormat
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getExportFormat() {
    return exportFormat;
  }

  public void setExportFormat(ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

