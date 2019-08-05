package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString queue = null;
  private ConfigNodePropertyBoolean dropInvalidItems = null;
  private ConfigNodePropertyString agentTarget = null;

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties () {

  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties (ConfigNodePropertyString name, ConfigNodePropertyString queue, ConfigNodePropertyBoolean dropInvalidItems, ConfigNodePropertyString agentTarget) {
    this.name = name;
    this.queue = queue;
    this.dropInvalidItems = dropInvalidItems;
    this.agentTarget = agentTarget;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("queue")
  public ConfigNodePropertyString getQueue() {
    return queue;
  }
  public void setQueue(ConfigNodePropertyString queue) {
    this.queue = queue;
  }

    
  @JsonProperty("drop.invalid.items")
  public ConfigNodePropertyBoolean getDropInvalidItems() {
    return dropInvalidItems;
  }
  public void setDropInvalidItems(ConfigNodePropertyBoolean dropInvalidItems) {
    this.dropInvalidItems = dropInvalidItems;
  }

    
  @JsonProperty("agent.target")
  public ConfigNodePropertyString getAgentTarget() {
    return agentTarget;
  }
  public void setAgentTarget(ConfigNodePropertyString agentTarget) {
    this.agentTarget = agentTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties = (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.name) &&
        Objects.equals(queue, orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.queue) &&
        Objects.equals(dropInvalidItems, orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.dropInvalidItems) &&
        Objects.equals(agentTarget, orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.agentTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, queue, dropInvalidItems, agentTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    dropInvalidItems: ").append(toIndentedString(dropInvalidItems)).append("\n");
    sb.append("    agentTarget: ").append(toIndentedString(agentTarget)).append("\n");
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
