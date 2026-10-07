package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression;

  @JsonProperty("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonProperty("chunk.cleanup.age")
  private ConfigNodePropertyInteger chunkCleanupAge;

  /**
   * 
   * @return schedulerExpression
   */
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   * 
   * @return schedulerConcurrent
   */
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   * 
   * @return chunkCleanupAge
   */
  public ConfigNodePropertyInteger getChunkCleanupAge() {
    return chunkCleanupAge;
  }

  public void setChunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties) o;
    return Objects.equals(this.schedulerExpression, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(this.schedulerConcurrent, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerConcurrent) &&
        Objects.equals(this.chunkCleanupAge, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.chunkCleanupAge);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
