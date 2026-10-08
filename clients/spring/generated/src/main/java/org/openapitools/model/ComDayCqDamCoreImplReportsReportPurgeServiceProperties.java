package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComDayCqDamCoreImplReportsReportPurgeServiceProperties
 */

@JsonTypeName("comDayCqDamCoreImplReportsReportPurgeServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString schedulerExpression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxSavedReports;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger timeDuration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableReportPurge;

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties schedulerExpression(@Nullable ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  /**
   * Get schedulerExpression
   * @return schedulerExpression
   */
  @Valid 
  @Schema(name = "scheduler.expression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.expression")
  public @Nullable ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  @JsonProperty("scheduler.expression")
  public void setSchedulerExpression(@Nullable ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties maxSavedReports(@Nullable ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
    return this;
  }

  /**
   * Get maxSavedReports
   * @return maxSavedReports
   */
  @Valid 
  @Schema(name = "maxSavedReports", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxSavedReports")
  public @Nullable ConfigNodePropertyInteger getMaxSavedReports() {
    return maxSavedReports;
  }

  @JsonProperty("maxSavedReports")
  public void setMaxSavedReports(@Nullable ConfigNodePropertyInteger maxSavedReports) {
    this.maxSavedReports = maxSavedReports;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties timeDuration(@Nullable ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
    return this;
  }

  /**
   * Get timeDuration
   * @return timeDuration
   */
  @Valid 
  @Schema(name = "timeDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeDuration")
  public @Nullable ConfigNodePropertyInteger getTimeDuration() {
    return timeDuration;
  }

  @JsonProperty("timeDuration")
  public void setTimeDuration(@Nullable ConfigNodePropertyInteger timeDuration) {
    this.timeDuration = timeDuration;
  }

  public ComDayCqDamCoreImplReportsReportPurgeServiceProperties enableReportPurge(@Nullable ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
    return this;
  }

  /**
   * Get enableReportPurge
   * @return enableReportPurge
   */
  @Valid 
  @Schema(name = "enableReportPurge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableReportPurge")
  public @Nullable ConfigNodePropertyBoolean getEnableReportPurge() {
    return enableReportPurge;
  }

  @JsonProperty("enableReportPurge")
  public void setEnableReportPurge(@Nullable ConfigNodePropertyBoolean enableReportPurge) {
    this.enableReportPurge = enableReportPurge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties comDayCqDamCoreImplReportsReportPurgeServiceProperties = (ComDayCqDamCoreImplReportsReportPurgeServiceProperties) o;
    return Objects.equals(this.schedulerExpression, comDayCqDamCoreImplReportsReportPurgeServiceProperties.schedulerExpression) &&
        Objects.equals(this.maxSavedReports, comDayCqDamCoreImplReportsReportPurgeServiceProperties.maxSavedReports) &&
        Objects.equals(this.timeDuration, comDayCqDamCoreImplReportsReportPurgeServiceProperties.timeDuration) &&
        Objects.equals(this.enableReportPurge, comDayCqDamCoreImplReportsReportPurgeServiceProperties.enableReportPurge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, maxSavedReports, timeDuration, enableReportPurge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {\n");
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    maxSavedReports: ").append(toIndentedString(maxSavedReports)).append("\n");
    sb.append("    timeDuration: ").append(toIndentedString(timeDuration)).append("\n");
    sb.append("    enableReportPurge: ").append(toIndentedString(enableReportPurge)).append("\n");
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

