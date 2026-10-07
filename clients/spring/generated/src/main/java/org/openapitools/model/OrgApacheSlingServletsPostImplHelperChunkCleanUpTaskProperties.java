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
 * OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
 */

@JsonTypeName("orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString schedulerExpression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger chunkCleanupAge;

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties schedulerExpression(@Nullable ConfigNodePropertyString schedulerExpression) {
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

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties schedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

  /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
   */
  @Valid 
  @Schema(name = "scheduler.concurrent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.concurrent")
  public @Nullable ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  @JsonProperty("scheduler.concurrent")
  public void setSchedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties chunkCleanupAge(@Nullable ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
    return this;
  }

  /**
   * Get chunkCleanupAge
   * @return chunkCleanupAge
   */
  @Valid 
  @Schema(name = "chunk.cleanup.age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chunk.cleanup.age")
  public @Nullable ConfigNodePropertyInteger getChunkCleanupAge() {
    return chunkCleanupAge;
  }

  @JsonProperty("chunk.cleanup.age")
  public void setChunkCleanupAge(@Nullable ConfigNodePropertyInteger chunkCleanupAge) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

