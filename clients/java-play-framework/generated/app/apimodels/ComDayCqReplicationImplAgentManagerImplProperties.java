package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqReplicationImplAgentManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplAgentManagerImplProperties   {
  @JsonProperty("job.topics")
  @Valid

  private ConfigNodePropertyString jobTopics;

  @JsonProperty("serviceUser.target")
  @Valid

  private ConfigNodePropertyString serviceUserTarget;

  @JsonProperty("agentProvider.target")
  @Valid

  private ConfigNodePropertyString agentProviderTarget;

  public ComDayCqReplicationImplAgentManagerImplProperties jobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

   /**
   * Get jobTopics
   * @return jobTopics
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

