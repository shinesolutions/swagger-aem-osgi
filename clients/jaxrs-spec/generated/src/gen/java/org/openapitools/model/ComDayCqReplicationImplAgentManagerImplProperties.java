package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqReplicationImplAgentManagerImplProperties   {
  
  private @Valid ConfigNodePropertyString jobTopics = null;
  private @Valid ConfigNodePropertyString serviceUserTarget = null;
  private @Valid ConfigNodePropertyString agentProviderTarget = null;

  /**
   **/
  public ComDayCqReplicationImplAgentManagerImplProperties jobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.topics")
  public ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }
  public void setJobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
  }

  /**
   **/
  public ComDayCqReplicationImplAgentManagerImplProperties serviceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceUser.target")
  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }
  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }

  /**
   **/
  public ComDayCqReplicationImplAgentManagerImplProperties agentProviderTarget(ConfigNodePropertyString agentProviderTarget) {
    this.agentProviderTarget = agentProviderTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("agentProvider.target")
  public ConfigNodePropertyString getAgentProviderTarget() {
    return agentProviderTarget;
  }
  public void setAgentProviderTarget(ConfigNodePropertyString agentProviderTarget) {
    this.agentProviderTarget = agentProviderTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplAgentManagerImplProperties comDayCqReplicationImplAgentManagerImplProperties = (ComDayCqReplicationImplAgentManagerImplProperties) o;
    return Objects.equals(jobTopics, comDayCqReplicationImplAgentManagerImplProperties.jobTopics) &&
        Objects.equals(serviceUserTarget, comDayCqReplicationImplAgentManagerImplProperties.serviceUserTarget) &&
        Objects.equals(agentProviderTarget, comDayCqReplicationImplAgentManagerImplProperties.agentProviderTarget);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

