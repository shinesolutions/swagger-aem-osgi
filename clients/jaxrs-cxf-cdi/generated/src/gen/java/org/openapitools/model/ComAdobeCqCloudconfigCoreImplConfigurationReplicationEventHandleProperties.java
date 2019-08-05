package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties   {
  
  private ConfigNodePropertyArray flushAgents = null;


  /**
   **/
  public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties flushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("flush.agents")
  public ConfigNodePropertyArray getFlushAgents() {
    return flushAgents;
  }
  public void setFlushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties) o;
    return Objects.equals(flushAgents, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.flushAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flushAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {\n");
    
    sb.append("    flushAgents: ").append(toIndentedString(flushAgents)).append("\n");
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

