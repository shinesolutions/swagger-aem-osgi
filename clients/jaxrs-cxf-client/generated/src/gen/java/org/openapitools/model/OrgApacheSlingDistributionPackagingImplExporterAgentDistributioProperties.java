package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString queue = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean dropInvalidItems = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString agentTarget = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get queue
   * @return queue
  **/
  @JsonProperty("queue")
  public ConfigNodePropertyString getQueue() {
    return queue;
  }

  public void setQueue(ConfigNodePropertyString queue) {
    this.queue = queue;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties queue(ConfigNodePropertyString queue) {
    this.queue = queue;
    return this;
  }

 /**
   * Get dropInvalidItems
   * @return dropInvalidItems
  **/
  @JsonProperty("drop.invalid.items")
  public ConfigNodePropertyBoolean getDropInvalidItems() {
    return dropInvalidItems;
  }

  public void setDropInvalidItems(ConfigNodePropertyBoolean dropInvalidItems) {
    this.dropInvalidItems = dropInvalidItems;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties dropInvalidItems(ConfigNodePropertyBoolean dropInvalidItems) {
    this.dropInvalidItems = dropInvalidItems;
    return this;
  }

 /**
   * Get agentTarget
   * @return agentTarget
  **/
  @JsonProperty("agent.target")
  public ConfigNodePropertyString getAgentTarget() {
    return agentTarget;
  }

  public void setAgentTarget(ConfigNodePropertyString agentTarget) {
    this.agentTarget = agentTarget;
  }

  public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties agentTarget(ConfigNodePropertyString agentTarget) {
    this.agentTarget = agentTarget;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

