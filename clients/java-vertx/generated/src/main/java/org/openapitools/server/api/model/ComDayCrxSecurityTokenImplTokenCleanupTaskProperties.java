package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties   {
  
  private ConfigNodePropertyBoolean enableTokenCleanupTask = null;
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyInteger batchSize = null;

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties () {

  }

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties (ConfigNodePropertyBoolean enableTokenCleanupTask, ConfigNodePropertyString schedulerExpression, ConfigNodePropertyInteger batchSize) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
    this.schedulerExpression = schedulerExpression;
    this.batchSize = batchSize;
  }

    
  @JsonProperty("enable.token.cleanup.task")
  public ConfigNodePropertyBoolean getEnableTokenCleanupTask() {
    return enableTokenCleanupTask;
  }
  public void setEnableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
  }

    
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

    
  @JsonProperty("batch.size")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
