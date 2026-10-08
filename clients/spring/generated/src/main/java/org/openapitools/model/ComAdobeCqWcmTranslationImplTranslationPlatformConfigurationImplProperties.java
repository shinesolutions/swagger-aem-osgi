package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
 */

@JsonTypeName("comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString syncTranslationStateSchedulingFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown exportFormat;

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateSchedulingFormat(@Nullable ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
    return this;
  }

  /**
   * Get syncTranslationStateSchedulingFormat
   * @return syncTranslationStateSchedulingFormat
   */
  @Valid 
  @Schema(name = "syncTranslationState.schedulingFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncTranslationState.schedulingFormat")
  public @Nullable ConfigNodePropertyString getSyncTranslationStateSchedulingFormat() {
    return syncTranslationStateSchedulingFormat;
  }

  @JsonProperty("syncTranslationState.schedulingFormat")
  public void setSyncTranslationStateSchedulingFormat(@Nullable ConfigNodePropertyString syncTranslationStateSchedulingFormat) {
    this.syncTranslationStateSchedulingFormat = syncTranslationStateSchedulingFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties schedulingRepeatTranslationSchedulingFormat(@Nullable ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
    return this;
  }

  /**
   * Get schedulingRepeatTranslationSchedulingFormat
   * @return schedulingRepeatTranslationSchedulingFormat
   */
  @Valid 
  @Schema(name = "schedulingRepeatTranslation.schedulingFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedulingRepeatTranslation.schedulingFormat")
  public @Nullable ConfigNodePropertyString getSchedulingRepeatTranslationSchedulingFormat() {
    return schedulingRepeatTranslationSchedulingFormat;
  }

  @JsonProperty("schedulingRepeatTranslation.schedulingFormat")
  public void setSchedulingRepeatTranslationSchedulingFormat(@Nullable ConfigNodePropertyString schedulingRepeatTranslationSchedulingFormat) {
    this.schedulingRepeatTranslationSchedulingFormat = schedulingRepeatTranslationSchedulingFormat;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties syncTranslationStateLockTimeoutInMinutes(@Nullable ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
    return this;
  }

  /**
   * Get syncTranslationStateLockTimeoutInMinutes
   * @return syncTranslationStateLockTimeoutInMinutes
   */
  @Valid 
  @Schema(name = "syncTranslationState.lockTimeoutInMinutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncTranslationState.lockTimeoutInMinutes")
  public @Nullable ConfigNodePropertyString getSyncTranslationStateLockTimeoutInMinutes() {
    return syncTranslationStateLockTimeoutInMinutes;
  }

  @JsonProperty("syncTranslationState.lockTimeoutInMinutes")
  public void setSyncTranslationStateLockTimeoutInMinutes(@Nullable ConfigNodePropertyString syncTranslationStateLockTimeoutInMinutes) {
    this.syncTranslationStateLockTimeoutInMinutes = syncTranslationStateLockTimeoutInMinutes;
  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties exportFormat(@Nullable ConfigNodePropertyDropDown exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }

  /**
   * Get exportFormat
   * @return exportFormat
   */
  @Valid 
  @Schema(name = "export.format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("export.format")
  public @Nullable ConfigNodePropertyDropDown getExportFormat() {
    return exportFormat;
  }

  @JsonProperty("export.format")
  public void setExportFormat(@Nullable ConfigNodePropertyDropDown exportFormat) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

