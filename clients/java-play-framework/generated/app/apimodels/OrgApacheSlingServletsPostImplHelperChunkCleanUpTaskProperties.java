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
 * OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties   {
  @JsonProperty("scheduler.expression")
  @Valid

  private ConfigNodePropertyString schedulerExpression;

  @JsonProperty("scheduler.concurrent")
  @Valid

  private ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonProperty("chunk.cleanup.age")
  @Valid

  private ConfigNodePropertyInteger chunkCleanupAge;

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
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

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

   /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties chunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
    return this;
  }

   /**
   * Get chunkCleanupAge
   * @return chunkCleanupAge
  **/
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
    return Objects.equals(schedulerExpression, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(schedulerConcurrent, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerConcurrent) &&
        Objects.equals(chunkCleanupAge, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.chunkCleanupAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, schedulerConcurrent, chunkCleanupAge);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

