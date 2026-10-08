package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqReplicationImplAgentManagerImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplAgentManagerImplProperties   {
  @JsonProperty("job.topics")
  private ConfigNodePropertyString jobTopics;

  @JsonProperty("serviceUser.target")
  private ConfigNodePropertyString serviceUserTarget;

  @JsonProperty("agentProvider.target")
  private ConfigNodePropertyString agentProviderTarget;

  public ComDayCqReplicationImplAgentManagerImplProperties jobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  /**
   * Get jobTopics
   * @return jobTopics
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }

  public void setJobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
  }

  public ComDayCqReplicationImplAgentManagerImplProperties serviceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

  /**
   * Get serviceUserTarget
   * @return serviceUserTarget
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }

  public ComDayCqReplicationImplAgentManagerImplProperties agentProviderTarget(ConfigNodePropertyString agentProviderTarget) {
    this.agentProviderTarget = agentProviderTarget;
    return this;
  }

  /**
   * Get agentProviderTarget
   * @return agentProviderTarget
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAgentProviderTarget() {
    return agentProviderTarget;
  }

  public void setAgentProviderTarget(ConfigNodePropertyString agentProviderTarget) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

