package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties
 */

@JsonTypeName("comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {

  private ConfigNodePropertyString processLabel;

  private ConfigNodePropertyBoolean notifyOnComplete;

  public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
   */
  @Valid 
  @Schema(name = "process.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties notifyOnComplete(ConfigNodePropertyBoolean notifyOnComplete) {
    this.notifyOnComplete = notifyOnComplete;
    return this;
  }

  /**
   * Get notifyOnComplete
   * @return notifyOnComplete
   */
  @Valid 
  @Schema(name = "Notify on Complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notify on Complete")
  public ConfigNodePropertyBoolean getNotifyOnComplete() {
    return notifyOnComplete;
  }

  public void setNotifyOnComplete(ConfigNodePropertyBoolean notifyOnComplete) {
    this.notifyOnComplete = notifyOnComplete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties = (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.processLabel) &&
        Objects.equals(this.notifyOnComplete, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.notifyOnComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, notifyOnComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    notifyOnComplete: ").append(toIndentedString(notifyOnComplete)).append("\n");
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

