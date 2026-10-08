package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties   {
  @JsonProperty("enable.token.cleanup.task")
  @Valid

  private ConfigNodePropertyBoolean enableTokenCleanupTask;

  @JsonProperty("scheduler.expression")
  @Valid

  private ConfigNodePropertyString schedulerExpression;

  @JsonProperty("batch.size")
  @Valid

  private ConfigNodePropertyInteger batchSize;

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties enableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
    return this;
  }

   /**
   * Get enableTokenCleanupTask
   * @return enableTokenCleanupTask
  **/
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
  public ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties comDayCrxSecurityTokenImplTokenCleanupTaskProperties = (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties) o;
    return Objects.equals(enableTokenCleanupTask, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.enableTokenCleanupTask) &&
        Objects.equals(schedulerExpression, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.schedulerExpression) &&
        Objects.equals(batchSize, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.batchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTokenCleanupTask, schedulerExpression, batchSize);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

