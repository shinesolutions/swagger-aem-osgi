package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties   {
  
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyBoolean schedulerConcurrent = null;
  private ConfigNodePropertyInteger chunkCleanupAge = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chunk.cleanup.age")
  public ConfigNodePropertyInteger getChunkCleanupAge() {
    return chunkCleanupAge;
  }
  public void setChunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties) o;
    return Objects.equals(schedulerExpression, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(schedulerConcurrent, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerConcurrent) &&
        Objects.equals(chunkCleanupAge, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.chunkCleanupAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, schedulerConcurrent, chunkCleanupAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
    sb.append("    chunkCleanupAge: ").append(toIndentedString(chunkCleanupAge)).append("\n");
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

