package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties   {
  
  private ConfigNodePropertyString syncTranslationStateSchedulingFormat = null;
  private ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat = null;
  private ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes = null;
  private ConfigNodePropertyDropDown exportFormat = null;

  /**
   **/
  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateSchedulingFormat(ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
    return this;
  }

  
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
  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties schedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
    return this;
  }

  
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
  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
    return this;
  }

  
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
  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties exportFormat(ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("export.format")
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
    return Objects.equals(syncTranslationStateSchedulingFormat, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.syncTranslationStateSchedulingFormat) &&
        Objects.equals(schedulingRepeatTranslationSchedulingFormat, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.schedulingRepeatTranslationSchedulingFormat) &&
        Objects.equals(syncTranslationStateLockTimeoutInMinutes, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.syncTranslationStateLockTimeoutInMinutes) &&
        Objects.equals(exportFormat, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.exportFormat);
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

