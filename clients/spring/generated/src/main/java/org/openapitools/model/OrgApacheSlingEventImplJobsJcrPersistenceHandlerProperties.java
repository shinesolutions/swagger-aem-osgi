package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
 */

@JsonTypeName("orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger startupDelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cleanupPeriod;

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties jobConsumermanagerDisableDistribution(@Nullable ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
    return this;
  }

  /**
   * Get jobConsumermanagerDisableDistribution
   * @return jobConsumermanagerDisableDistribution
   */
  @Valid 
  @Schema(name = "job.consumermanager.disableDistribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job.consumermanager.disableDistribution")
  public @Nullable ConfigNodePropertyBoolean getJobConsumermanagerDisableDistribution() {
    return jobConsumermanagerDisableDistribution;
  }

  @JsonProperty("job.consumermanager.disableDistribution")
  public void setJobConsumermanagerDisableDistribution(@Nullable ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
    this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
  }

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties startupDelay(@Nullable ConfigNodePropertyInteger startupDelay) {
    this.startupDelay = startupDelay;
    return this;
  }

  /**
   * Get startupDelay
   * @return startupDelay
   */
  @Valid 
  @Schema(name = "startup.delay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startup.delay")
  public @Nullable ConfigNodePropertyInteger getStartupDelay() {
    return startupDelay;
  }

  @JsonProperty("startup.delay")
  public void setStartupDelay(@Nullable ConfigNodePropertyInteger startupDelay) {
    this.startupDelay = startupDelay;
  }

  public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties cleanupPeriod(@Nullable ConfigNodePropertyInteger cleanupPeriod) {
    this.cleanupPeriod = cleanupPeriod;
    return this;
  }

  /**
   * Get cleanupPeriod
   * @return cleanupPeriod
   */
  @Valid 
  @Schema(name = "cleanup.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cleanup.period")
  public @Nullable ConfigNodePropertyInteger getCleanupPeriod() {
    return cleanupPeriod;
  }

  @JsonProperty("cleanup.period")
  public void setCleanupPeriod(@Nullable ConfigNodePropertyInteger cleanupPeriod) {
    this.cleanupPeriod = cleanupPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties = (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties) o;
    return Objects.equals(this.jobConsumermanagerDisableDistribution, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.jobConsumermanagerDisableDistribution) &&
        Objects.equals(this.startupDelay, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.startupDelay) &&
        Objects.equals(this.cleanupPeriod, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.cleanupPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobConsumermanagerDisableDistribution, startupDelay, cleanupPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {\n");
    sb.append("    jobConsumermanagerDisableDistribution: ").append(toIndentedString(jobConsumermanagerDisableDistribution)).append("\n");
    sb.append("    startupDelay: ").append(toIndentedString(startupDelay)).append("\n");
    sb.append("    cleanupPeriod: ").append(toIndentedString(cleanupPeriod)).append("\n");
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

