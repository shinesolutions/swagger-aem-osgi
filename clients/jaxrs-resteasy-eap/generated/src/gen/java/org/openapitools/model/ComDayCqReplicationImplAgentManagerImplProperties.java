package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqReplicationImplAgentManagerImplProperties   {
  

  private ConfigNodePropertyString jobTopics = null;

  private ConfigNodePropertyString serviceUserTarget = null;

  private ConfigNodePropertyString agentProviderTarget = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("agentProvider.target")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

