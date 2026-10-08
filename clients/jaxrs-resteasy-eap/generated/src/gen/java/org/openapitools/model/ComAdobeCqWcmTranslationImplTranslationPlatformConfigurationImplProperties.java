package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties   {
  
  private ConfigNodePropertyString syncTranslationStateSchedulingFormat;
  private ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat;
  private ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes;
  private ConfigNodePropertyDropDown exportFormat;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("syncTranslationState.schedulingFormat")
  public ConfigNodePropertyString getSyncTranslationStateSchedulingFormat() {
    return syncTranslationStateSchedulingFormat;
  }
  public void setSyncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("schedulingRepeatTranslation.schedulingFormat")
  public ConfigNodePropertyString getSchedulingRepeatTranslationSchedulingFormat() {
    return schedulingRepeatTranslationSchedulingFormat;
  }
  public void setSchedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("syncTranslationState.lockTimeoutInMinutes")
  public ConfigNodePropertyString getSyncTranslationStateLockTimeoutInMinutes() {
    return syncTranslationStateLockTimeoutInMinutes;
  }
  public void setSyncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("export.format")
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

