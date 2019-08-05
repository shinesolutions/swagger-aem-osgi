package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties   {
  @JsonProperty("enable.token.cleanup.task")
  private ConfigNodePropertyBoolean enableTokenCleanupTask = null;

  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("batch.size")
  private ConfigNodePropertyInteger batchSize = null;

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties enableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
    return this;
  }

  /**
   * Get enableTokenCleanupTask
   * @return enableTokenCleanupTask
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnableTokenCleanupTask() {
    return enableTokenCleanupTask;
  }

  public void setEnableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
  }

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties batchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties comDayCrxSecurityTokenImplTokenCleanupTaskProperties = (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties) o;
    return Objects.equals(this.enableTokenCleanupTask, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.enableTokenCleanupTask) &&
        Objects.equals(this.schedulerExpression, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.schedulerExpression) &&
        Objects.equals(this.batchSize, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.batchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTokenCleanupTask, schedulerExpression, batchSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {\n");
    
    sb.append("    enableTokenCleanupTask: ").append(toIndentedString(enableTokenCleanupTask)).append("\n");
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
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

