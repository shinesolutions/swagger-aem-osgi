package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqReplicationImplAgentManagerImplProperties
 */

@JsonTypeName("comDayCqReplicationImplAgentManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplAgentManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jobTopics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceUserTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString agentProviderTarget;

  public ComDayCqReplicationImplAgentManagerImplProperties jobTopics(@Nullable ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  /**
   * Get jobTopics
   * @return jobTopics
   */
  @Valid 
  @Schema(name = "job.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job.topics")
  public @Nullable ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }

  @JsonProperty("job.topics")
  public void setJobTopics(@Nullable ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
  }

  public ComDayCqReplicationImplAgentManagerImplProperties serviceUserTarget(@Nullable ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

  /**
   * Get serviceUserTarget
   * @return serviceUserTarget
   */
  @Valid 
  @Schema(name = "serviceUser.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceUser.target")
  public @Nullable ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  @JsonProperty("serviceUser.target")
  public void setServiceUserTarget(@Nullable ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }

  public ComDayCqReplicationImplAgentManagerImplProperties agentProviderTarget(@Nullable ConfigNodePropertyString agentProviderTarget) {
    this.agentProviderTarget = agentProviderTarget;
    return this;
  }

  /**
   * Get agentProviderTarget
   * @return agentProviderTarget
   */
  @Valid 
  @Schema(name = "agentProvider.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agentProvider.target")
  public @Nullable ConfigNodePropertyString getAgentProviderTarget() {
    return agentProviderTarget;
  }

  @JsonProperty("agentProvider.target")
  public void setAgentProviderTarget(@Nullable ConfigNodePropertyString agentProviderTarget) {
    this.agentProviderTarget = agentProviderTarget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplAgentManagerImplProperties comDayCqReplicationImplAgentManagerImplProperties = (ComDayCqReplicationImplAgentManagerImplProperties) o;
    return Objects.equals(this.jobTopics, comDayCqReplicationImplAgentManagerImplProperties.jobTopics) &&
        Objects.equals(this.serviceUserTarget, comDayCqReplicationImplAgentManagerImplProperties.serviceUserTarget) &&
        Objects.equals(this.agentProviderTarget, comDayCqReplicationImplAgentManagerImplProperties.agentProviderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTopics, serviceUserTarget, agentProviderTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplAgentManagerImplProperties {\n");
    sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
    sb.append("    serviceUserTarget: ").append(toIndentedString(serviceUserTarget)).append("\n");
    sb.append("    agentProviderTarget: ").append(toIndentedString(agentProviderTarget)).append("\n");
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

