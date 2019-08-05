package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("queue")
  private ConfigNodePropertyString queue = null;

  @JsonProperty("drop.invalid.items")
  private ConfigNodePropertyBoolean dropInvalidItems = null;

  @JsonProperty("agent.target")
  private ConfigNodePropertyString agentTarget = null;

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties queue(ConfigNodePropertyString queue) {
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @Valid
  public ConfigNodePropertyString getQueue() {
    return queue;
  }

  public void setQueue(ConfigNodePropertyString queue) {
    this.queue = queue;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties dropInvalidItems(ConfigNodePropertyBoolean dropInvalidItems) {
    this.dropInvalidItems = dropInvalidItems;
    return this;
  }

   /**
   * Get dropInvalidItems
   * @return dropInvalidItems
  **/
  @Valid
  public ConfigNodePropertyBoolean getDropInvalidItems() {
    return dropInvalidItems;
  }

  public void setDropInvalidItems(ConfigNodePropertyBoolean dropInvalidItems) {
    this.dropInvalidItems = dropInvalidItems;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties agentTarget(ConfigNodePropertyString agentTarget) {
    this.agentTarget = agentTarget;
    return this;
  }

   /**
   * Get agentTarget
   * @return agentTarget
  **/
  @Valid
  public ConfigNodePropertyString getAgentTarget() {
    return agentTarget;
  }

  public void setAgentTarget(ConfigNodePropertyString agentTarget) {
    this.agentTarget = agentTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

